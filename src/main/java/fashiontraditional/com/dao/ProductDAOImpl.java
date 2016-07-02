package fashiontraditional.com.dao;

import java.util.LinkedList;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import fashiontraditional.com.controller.MainController;
import fashiontraditional.com.exception.DataAccessException;
import fashiontraditional.com.exception.ErrorCode;
import fashiontraditional.com.model.Product;
import fashiontraditional.com.util.Page;
import fashiontraditional.com.vo.ProductVO;

@Repository
@Transactional
public class ProductDAOImpl implements ProductDAO {

	@Autowired
	private SessionFactory sessionFactory;
	private static final Logger logger = Logger.getLogger(ProductDAOImpl.class);

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public Product findProductById(Long productId) throws DataAccessException {
		Session session = sessionFactory.getCurrentSession();
		// Transaction transaction = session.beginTransaction();
		try {
			Product product = (Product) session.get(Product.class, productId);
			// transaction.commit();
			session.flush();
			return product;
		} catch (HibernateException e) {
			// transaction.rollback();
			throw new DataAccessException(ErrorCode.COMMON_EXCEPTION,
					"Error is getting data");
		}
	}

	@Override
	@Transactional(readOnly = false, propagation = Propagation.REQUIRES_NEW)
	public Product createProduct(Product product) throws DataAccessException {
		try {
			Session session = sessionFactory.getCurrentSession();
			// session.beginTransaction();
			Product p = (Product) session.save(product);
			session.flush();
			return p;
		} catch (HibernateException e) {
			throw new DataAccessException(ErrorCode.COMMON_EXCEPTION,
					"Error is saving data");
		}
	}

	@Override
	@Transactional(readOnly = false, propagation = Propagation.REQUIRES_NEW)
	public boolean updateProduct(Product product) throws DataAccessException {
		try {
			Session session = sessionFactory.getCurrentSession();
			session.update(product);
			session.flush();
			return true;
		} catch (HibernateException e) {
			throw new DataAccessException(ErrorCode.COMMON_EXCEPTION,
					"Error is updating data");
		}
	}

	@Override
	@Transactional(readOnly = false, propagation = Propagation.REQUIRES_NEW)
	public boolean deleteProduct(Product product) throws DataAccessException {
		try {
			Session session = sessionFactory.getCurrentSession();
			session.delete(product);
			session.flush();
			return true;
		} catch (HibernateException e) {
			throw new DataAccessException(ErrorCode.COMMON_EXCEPTION,
					"Error is deleting data");
		}
	}

	@Override
	public List<ProductVO> getProductsByCatalog(Integer page,
			Page<ProductVO> paging, Integer catalogId)
			throws DataAccessException {

		List<ProductVO> result = null;
		try {
			Session session = sessionFactory.getCurrentSession();

			StringBuilder sql = new StringBuilder();
			sql.append(" SELECT p.id AS id, ");
			sql.append(" p.name AS name, ");
			sql.append(" p.price AS money, ");
			sql.append(" p.image AS image, ");
			sql.append(" p.color AS color, ");
			sql.append(" p.size AS size ");
			sql.append(" FROM PRODUCT AS p ");
			sql.append(" INNER JOIN CATALOG_DETAIL AS c ");
			sql.append(" ON p.id = c.product_id ");
			sql.append(" WHERE c.catalog_id = :catalogId ");
			sql.append(" OR EXISTS ( SELECT 1 ");
			sql.append(" 				FROM CATALOG c1 ");
			sql.append(" 				WHERE c1.ID = c.catalog_id ");
			sql.append(" 				AND c1.PARENT_ID= :catalogId ) ");
			sql.append(" ORDER BY p.price ");
			SQLQuery query = session.createSQLQuery(sql.toString());
			query.addEntity(ProductVO.class);
			query.setParameter("catalogId", catalogId);
			query.setParameter("catalogId", catalogId);
			result = query.list();
			paging.setList(result);
			result = paging.getList(page);
			session.flush();
		} catch (HibernateException e) {
			throw new DataAccessException(ErrorCode.COMMON_EXCEPTION,
					"Error is getting data: " + e.getMessage());
		}
		return result;
	}

	@Override
	public List<ProductVO> getProducts() throws DataAccessException {
		// TODO Auto-generated method stub
		List<ProductVO> result = new LinkedList<ProductVO>();
		return result;
	}
}

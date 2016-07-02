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
import org.springframework.stereotype.Repository;

import fashiontraditional.com.exception.DataAccessException;
import fashiontraditional.com.exception.ErrorCode;
import fashiontraditional.com.model.Address;
import fashiontraditional.com.model.Banner;
import fashiontraditional.com.model.Catalog;
import fashiontraditional.com.services.OrderServiceImpl;
import fashiontraditional.com.vo.CatalogVO;
import fashiontraditional.com.vo.UserVO;

@Repository
public class CatalogDAOImpl implements CatalogDAO {

	private SessionFactory sessionFactory;

	@Autowired
	public CatalogDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	private static final Logger logger = Logger.getLogger(CatalogDAOImpl.class);

	@Override
	public List<Catalog> getCatalogs() throws DataAccessException {
		Session session = sessionFactory.getCurrentSession();
		// Transaction transaction = session.beginTransaction();
		List<Catalog> results = null;
		try {
			Query query = session
					.createQuery("FROM CATALOG a WHERE a.catalog = null");
			// query.setString("pname", addressName);

			results = query.list();
			session.flush();
		} catch (HibernateException e) {
			throw new DataAccessException(ErrorCode.COMMON_EXCEPTION,
					"Error is getting data " + e.getMessage());
		}
		return results;
		// return null;
	}

	@Override
	public List<Catalog> getCatalogsByParent(Integer parent)
			throws DataAccessException {
		Session session = sessionFactory.getCurrentSession();
//		Transaction transaction = session.beginTransaction();
		List<Catalog> results = null;
		try {
			StringBuilder sql = new StringBuilder();
			sql.append(" SELECT * ");
			sql.append(" FROM CATALOG a ");

			if (parent == null)
				sql.append(" WHERE a.parent_id IS NULL");
			else
				sql.append(" WHERE a.parent_id = :parent");

			SQLQuery query = session.createSQLQuery(sql.toString());
			query.addEntity(Catalog.class);
			if (parent != null)
				query.setParameter("parent", parent);
			results = query.list();
			session.flush();
		} catch (HibernateException e) {
			throw new DataAccessException(ErrorCode.COMMON_EXCEPTION,
					"Error is getting data " + e.getMessage());
		}
		return results;

	}

	@Override
	public List<Catalog> getCatalogsEqualsParent(Integer catalogId)
			throws DataAccessException {
		Session session = sessionFactory.getCurrentSession();
		// Transaction transaction = session.beginTransaction();
		List<Catalog> results = null;
		try {
			StringBuilder sql = new StringBuilder();
			sql.append(" SELECT * ");
			sql.append(" FROM CATALOG a ");
			sql.append(" WHERE a.parent_id = ");
			sql.append(" 				(SELECT c.parent_id ");
			sql.append(" 				FROM CATALOG c ");
			sql.append(" 				WHERE c.id = :pCatalogId )");
			SQLQuery query = session.createSQLQuery(sql.toString());
			query.addEntity(Catalog.class);
			query.setParameter("pCatalogId", catalogId);
			results = query.list();
			session.flush();
		} catch (HibernateException e) {
			throw new DataAccessException(ErrorCode.COMMON_EXCEPTION,
					"Error is getting data " + e.getMessage());
		}
		return results;

	}

	// @Override
	// @Transactional(readOnly = false, propagation = Propagation.REQUIRES_NEW)
	// public Long createAddress(Address address) throws DataAccessException {
	// Session session = sessionFactory.getCurrentSession();
	// Transaction transaction = session.beginTransaction();
	// long result = 0;
	// try {
	// result = (Long) session.save(address);
	// transaction.commit();
	// } catch (HibernateException e) {
	// transaction.rollback();
	// throw new DataAccessException(ErrorCode.COMMON_EXCEPTION,
	// "Error is saving data [ " + e.getMessage() + " ]");
	// }
	// return result;
	// }
	//
	// @Override
	// @Transactional(readOnly = false, propagation = Propagation.REQUIRES_NEW)
	// public boolean updateAddress(Address Address) throws DataAccessException
	// {
	// Session session = sessionFactory.getCurrentSession();
	// Transaction transaction = session.beginTransaction();
	// boolean result = false;
	// try {
	// session.update(Address);
	// transaction.commit();
	// result = true;
	// } catch (HibernateException e) {
	// transaction.rollback();
	// throw new DataAccessException(ErrorCode.COMMON_EXCEPTION,
	// "Error is saving data [ " + e.getMessage() + " ]");
	// }
	// return result;
	//
	// }
	//
	// @Override
	// @Transactional(readOnly = false, propagation = Propagation.REQUIRES_NEW)
	// public boolean deleteAddress(Address address) throws DataAccessException
	// {
	// Session session = sessionFactory.getCurrentSession();
	// Transaction transaction = session.beginTransaction();
	// boolean result = false;
	// try {
	// session.delete(address);
	// transaction.commit();
	// result = true;
	// } catch (HibernateException e) {
	// transaction.rollback();
	// throw new DataAccessException(ErrorCode.COMMON_EXCEPTION,
	// "Error is saving data [ " + e.getMessage() + " ]");
	// }
	// return result;
	//
	// }

}

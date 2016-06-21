package fashiontraditional.com.dao;

import java.util.LinkedList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
//import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import fashiontraditional.com.exception.DataAccessException;
import fashiontraditional.com.exception.ErrorCode;
import fashiontraditional.com.model.Address;
import fashiontraditional.com.model.Banner;
import fashiontraditional.com.model.Product;
import fashiontraditional.com.model.User;
import fashiontraditional.com.util.Page;
import fashiontraditional.com.vo.ProductVO;
import fashiontraditional.com.vo.UserVO;

@Repository
public class UserDAOImpl implements UserDAO {

	private SessionFactory sessionFactory;

	@Autowired
	public UserDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public UserVO getUserByUsername(String username) throws DataAccessException {
		UserVO result = null;
		try {
			Session session = sessionFactory.getCurrentSession();
			session.beginTransaction();

			StringBuilder sql = new StringBuilder();
			sql.append(" SELECT user.id AS id, ");
			sql.append(" user.name AS name, ");
			sql.append(" user.email AS email, ");
			sql.append(" user.image_thumbnail AS imageThumbnail, ");
			sql.append(" user.password AS password, ");
			sql.append(" user.phone_number AS phoneNumber, ");
			sql.append(" user.type_user AS typeUser, ");
			sql.append(" address.name AS address ");
			sql.append(" FROM User AS user ");
			sql.append(" INNER JOIN Address AS address ");
			sql.append(" ON user.address_id = address.id ");
			sql.append(" WHERE user.email = :pEmail OR user.phone_number = :pPhone");
			SQLQuery query = session.createSQLQuery(sql.toString());
			query.addEntity(UserVO.class);
			query.setParameter("pEmail", username);
			query.setParameter("pPhone", username);
			List<UserVO> list = query.list();
			if (list != null && list.size() > 0)
				result = list.get(0);

			// Page<UserVO> paging = new Page<UserVO>(numberRecord, result);
			// result = paging.getList(page);
			session.close();
		} catch (Exception e) {
			throw new DataAccessException(ErrorCode.COMMON_EXCEPTION,
					"Error is getting data: " + e.getMessage());
		}
		return result;
	}

	@Override
	public UserVO getUserByEmail(String email, String phone)
			throws DataAccessException {
		UserVO result = null;
		try {
			Session session = sessionFactory.getCurrentSession();
			session.beginTransaction();

			StringBuilder sql = new StringBuilder();
			sql.append(" SELECT user.id AS id, ");
			sql.append(" user.name AS name, ");
			sql.append(" user.email AS email, ");
			sql.append(" user.image_thumbnail AS imageThumbnail, ");
			sql.append(" user.password AS password, ");
			sql.append(" user.phone_number AS phoneNumber, ");
			sql.append(" user.type_user AS typeUser, ");
			sql.append(" address.name AS address ");
			sql.append(" FROM User AS user ");
			sql.append(" INNER JOIN Address AS address ");
			sql.append(" ON user.address_id = address.id ");
			sql.append(" WHERE user.email = :email OR user.phone_number = :phone");
			SQLQuery query = session.createSQLQuery(sql.toString());
			query.addEntity(UserVO.class);
			query.setParameter("email", email);
			query.setParameter("phone", phone);
			List<UserVO> list = query.list();
			if (list != null && list.size() > 0)
				result = list.get(0);

			// Page<UserVO> paging = new Page<UserVO>(numberRecord, result);
			// result = paging.getList(page);
			session.close();
		} catch (Exception e) {
			throw new DataAccessException(ErrorCode.COMMON_EXCEPTION,
					"Error is getting data: " + e.getMessage());
		}
		return result;
	}

	@Override
	public UserVO getUserByPhone(String phone) throws DataAccessException {
		UserVO result = null;
		try {
			Session session = sessionFactory.getCurrentSession();
			session.beginTransaction();

			StringBuilder sql = new StringBuilder();
			sql.append(" SELECT user.name AS name, ");
			sql.append(" user.email AS email, ");
			sql.append(" user.image_thumbnail AS imageThumbnail, ");
			sql.append(" user.password AS password, ");
			sql.append(" user.phone_number AS phoneNumber, ");
			sql.append(" user.type_user AS typeUser, ");
			sql.append(" address.name AS address ");
			sql.append(" FROM User AS user ");
			sql.append(" INNER JOIN Address AS address ");
			sql.append(" ON user.address_id = address.id ");
			sql.append(" WHERE user.phone_number = :phone");
			SQLQuery query = session.createSQLQuery(sql.toString());
			query.addEntity(UserVO.class);
			query.setParameter("phone", phone);
			result = (UserVO) query.uniqueResult();

			// Page<UserVO> paging = new Page<UserVO>(numberRecord, result);
			// result = paging.getList(page);
			session.close();
		} catch (Exception e) {
			throw new DataAccessException(ErrorCode.COMMON_EXCEPTION,
					"Error is getting data: " + e.getMessage());
		}
		return result;
	}

	@Override
	public Long createUser(User currentUser) throws DataAccessException {
		Session session = sessionFactory.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		try {
			Long user_id = (Long) session.save(currentUser);

			transaction.commit();
			return user_id;
		} catch (HibernateException e) {
			transaction.rollback();
			throw new DataAccessException(ErrorCode.COMMON_EXCEPTION,
					"Error is getting data [ " + e.getMessage() + " ]");
		}
	}

	@Override
	public User findUserById(Long id) throws DataAccessException {
		Session session = sessionFactory.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		try {
			User user = (User) session.get(User.class, id);
			// transaction.commit();
			session.close();
			return user;
		} catch (HibernateException e) {
			// transaction.rollback();
			throw new DataAccessException(ErrorCode.COMMON_EXCEPTION,
					"Error is getting data");
		}
	}

}

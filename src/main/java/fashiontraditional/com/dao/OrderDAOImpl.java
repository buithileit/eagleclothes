package fashiontraditional.com.dao;

import java.util.LinkedList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
//import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import fashiontraditional.com.exception.DataAccessException;
import fashiontraditional.com.exception.ErrorCode;
import fashiontraditional.com.model.Order;
import fashiontraditional.com.model.Banner;

@Repository
public class OrderDAOImpl implements OrderDAO {

	private SessionFactory sessionFactory;

	@Autowired
	public OrderDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public Order findOrderById(Long orderId) throws DataAccessException {
		Session session = sessionFactory.getCurrentSession();
		// Transaction transaction = session.beginTransaction();
		try {
			Order order = (Order) session.get(Order.class, orderId);
			// transaction.commit();
			session.close();
			return order;
		} catch (HibernateException e) {
			// transaction.rollback();
			throw new DataAccessException(ErrorCode.COMMON_EXCEPTION,
					"Error is getting data");
		}
	}

	@Override
	@Transactional(readOnly = false, propagation = Propagation.REQUIRES_NEW)
	public Long createOrder(Order order) throws DataAccessException {
		Session session = sessionFactory.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		long result = 0;
		try {
			result = (Long) session.save(order);
			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			throw new DataAccessException(ErrorCode.COMMON_EXCEPTION,
					"Error is saving data [ " + e.getMessage() + " ]");
		}
		return result;
	}

	@Override
	@Transactional(readOnly = false, propagation = Propagation.REQUIRES_NEW)
	public boolean updateOrder(Order Order) throws DataAccessException {
		Session session = sessionFactory.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		boolean result = false;
		try {
			session.update(Order);
			transaction.commit();
			result = true;
		} catch (HibernateException e) {
			transaction.rollback();
			throw new DataAccessException(ErrorCode.COMMON_EXCEPTION,
					"Error is saving data [ " + e.getMessage() + " ]");
		}
		return result;

	}

	@Override
	@Transactional(readOnly = false, propagation = Propagation.REQUIRES_NEW)
	public boolean deleteOrder(Order order) throws DataAccessException {
		Session session = sessionFactory.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		boolean result = false;
		try {
			session.delete(order);
			transaction.commit();
			result = true;
		} catch (HibernateException e) {
			transaction.rollback();
			throw new DataAccessException(ErrorCode.COMMON_EXCEPTION,
					"Error is saving data [ " + e.getMessage() + " ]");
		}
		return result;

	}

	@Override
	public List<Order> findOrderByName(String nameReceice)
			throws DataAccessException {
		Session session = sessionFactory.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		List<Order> results = null;
		try {
			Query query = session
					.createQuery("FROM Order a WHERE a.namePersonReceice = :pname");
			query.setString("pname", nameReceice);

			results = query.list();
		} catch (HibernateException e) {
			throw new DataAccessException(ErrorCode.COMMON_EXCEPTION,
					"Error is getting data " + e.getMessage());
		}
		session.close();
		return results;
	}
}

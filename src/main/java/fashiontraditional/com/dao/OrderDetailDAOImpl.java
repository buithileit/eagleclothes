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
import fashiontraditional.com.model.OrderDetail;
import fashiontraditional.com.model.Banner;

@Repository
public class OrderDetailDAOImpl implements OrderDetailDAO {

	private SessionFactory sessionFactory;

	@Autowired
	public OrderDetailDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	@Override
	public OrderDetail findOrderDetailById(Long orderDetailId) throws DataAccessException {
		Session session = sessionFactory.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		try {
			OrderDetail orderDetail = (OrderDetail) session.get(OrderDetail.class, orderDetailId);
			transaction.commit();
			return orderDetail;
		} catch (HibernateException e) {
			transaction.rollback();
			throw new DataAccessException(ErrorCode.COMMON_EXCEPTION,
					"Error is getting data");
		}
	}

	@Override
	@Transactional(readOnly = false, propagation = Propagation.REQUIRES_NEW)
	public Long createOrderDetail(OrderDetail orderDetail) throws DataAccessException {
		Session session = sessionFactory.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		long result = 0;
		try {
			result = (Long) session.save(orderDetail);
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
	public boolean updateOrderDetail(OrderDetail OrderDetail) throws DataAccessException {
		Session session = sessionFactory.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		boolean result = false;
		try {
			session.update(OrderDetail);
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
	public boolean deleteOrderDetail(OrderDetail orderDetail) throws DataAccessException {
		Session session = sessionFactory.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		boolean result = false;
		try {
			session.delete(orderDetail);
			transaction.commit();
			result = true;
		} catch (HibernateException e) {
			transaction.rollback();
			throw new DataAccessException(ErrorCode.COMMON_EXCEPTION,
					"Error is saving data [ " + e.getMessage() + " ]");
		}
		return result;

	}

//	@Override
//	public List<OrderDetail> findOrderDetailByName(String orderDetailName)
//			throws DataAccessException {
//		Session session = sessionFactory.getCurrentSession();
//		Transaction transaction = session.beginTransaction();
//		List<OrderDetail> results = null;
//		try {
//			Query query = session
//					.createQuery("FROM ORDER_DETAIL a WHERE a.name = :pname");
//			query.setString("pname", orderDetailName);
//
//			results = query.list();
//		} catch (HibernateException e) {
//			throw new DataAccessException(ErrorCode.COMMON_EXCEPTION,
//					"Error is getting data " + e.getMessage());
//		}
//		session.close();
//		return results;
//	}

}

package fashiontraditional.com.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import fashiontraditional.com.exception.DataAccessException;
import fashiontraditional.com.exception.ErrorCode;
import fashiontraditional.com.model.Address;

@Repository
public class AddressDAOImpl implements AddressDAO {

	private SessionFactory sessionFactory;

	@Autowired
	public AddressDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public Address findAddressById(Long addressId) throws DataAccessException {
		Session session = sessionFactory.getCurrentSession();
		// Transaction transaction = session.beginTransaction();
		try {
			Address address = (Address) session.get(Address.class, addressId);
			// transaction.commit();
			session.flush();
			return address;
		} catch (HibernateException e) {
			// transaction.rollback();
			throw new DataAccessException(ErrorCode.COMMON_EXCEPTION,
					"Error is getting data");
		}

	}

	@Override
	@Transactional(readOnly = false, propagation = Propagation.REQUIRES_NEW)
	public Long createAddress(Address address) throws DataAccessException {
		Session session = sessionFactory.getCurrentSession();
		// Transaction transaction = session.beginTransaction();
		long result = 0;
		try {
			result = (Long) session.save(address);
			session.flush();
			// transaction.commit();
		} catch (HibernateException e) {
			// transaction.rollback();
			throw new DataAccessException(ErrorCode.COMMON_EXCEPTION,
					"Error is saving data [ " + e.getMessage() + " ]");
		}
		return result;
	}

	@Override
	@Transactional(readOnly = false, propagation = Propagation.REQUIRES_NEW)
	public boolean updateAddress(Address Address) throws DataAccessException {
		Session session = sessionFactory.getCurrentSession();
		// Transaction transaction = session.beginTransaction();
		boolean result = false;
		try {
			session.update(Address);
			session.flush();
			// transaction.commit();
			result = true;
		} catch (HibernateException e) {
			// transaction.rollback();
			throw new DataAccessException(ErrorCode.COMMON_EXCEPTION,
					"Error is saving data [ " + e.getMessage() + " ]");
		}
		return result;

	}

	@Override
	@Transactional(readOnly = false, propagation = Propagation.REQUIRES_NEW)
	public boolean deleteAddress(Address address) throws DataAccessException {
		Session session = sessionFactory.getCurrentSession();
		// Transaction transaction = session.beginTransaction();
		boolean result = false;
		try {
			session.delete(address);
			// transaction.commit();
			session.flush();
			result = true;
		} catch (HibernateException e) {
			// transaction.rollback();
			throw new DataAccessException(ErrorCode.COMMON_EXCEPTION,
					"Error is saving data [ " + e.getMessage() + " ]");
		}
		return result;

	}

	@Override
	public List<Address> findAddressByName(String addressName)
			throws DataAccessException {
		Session session = sessionFactory.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		List<Address> results = null;
		try {
			Query query = session
					.createQuery("FROM ADDRESS a WHERE a.name LIKE :pname");
			query.setString("pname", "%" + addressName + "%");

			results = query.list();
			session.flush();
		} catch (HibernateException e) {
			throw new DataAccessException(ErrorCode.COMMON_EXCEPTION,
					"Error is getting data " + e.getMessage());
		}
		return results;
	}

}

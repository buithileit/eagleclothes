package fashiontraditional.com.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import fashiontraditional.com.exception.DataAccessException;
import fashiontraditional.com.exception.ErrorCode;
import fashiontraditional.com.model.Banner;
import fashiontraditional.com.model.Product;

@Repository
public class BannerDAOImpl implements BannerDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public List<Banner> getBanners() throws DataAccessException {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		List<Banner> results = null;
		try {
			Query query = session.createQuery("FROM BANNER");
			results = query.list();
//			transaction.commit();
		} catch (HibernateException e) {
//			transaction.rollback();
			throw new DataAccessException(ErrorCode.COMMON_EXCEPTION,
					"Error is getting data");
		}
		session.close();
		return results;
	}

}

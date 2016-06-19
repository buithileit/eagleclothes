package fashiontraditional.com.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import fashiontraditional.com.exception.DataAccessException;
import fashiontraditional.com.exception.ErrorCode;

@Repository
@Transactional(readOnly = true)
public class RepositoryImpl<T> implements IRepository<T> {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public T findById(Class<T> object, Long id) throws DataAccessException {
		try {

			Session session = sessionFactory.getCurrentSession();
			session.beginTransaction();
			Query query = session.createQuery("FROM " + object.getName());
			T results = (T) session.get(object, id);
			session.close();
			// if (results == null || results.isEmpty())
			// return null;

			return results;
		} catch (HibernateException e) {

			throw new DataAccessException(ErrorCode.COMMON_EXCEPTION,
					"Error is saving data");
		}
	}

	@Override
	public List<T> findByName(Class<T> object, String name, Integer record,
			Integer page) {
		return null;
	}

	@Override
	public List<T> getListBySQL(Class<T> object, String sql, Integer record,
			Integer page) {
		return null;
	}

}

package fashiontraditional.com.dao;

import java.util.List;

import fashiontraditional.com.exception.DataAccessException;

public interface IRepository<T> {

	T findById(Class<T> object, Long id) throws DataAccessException;

	List<T> findByName(Class<T> object, String name, Integer record,
			Integer page);

	List<T> getListBySQL(Class<T> object, String sql, Integer record,
			Integer page);

}

package fashiontraditional.com.dao;


import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import fashiontraditional.com.model.Product;

@Repository
public class ProductDAOImpl implements ProductDAO {

	private SessionFactory sessionFactory;

	@Autowired
	public ProductDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	
	@Override
	public Product findProductById(Long productId) {
		// TODO Auto-generated method stub
		return null;
	}

}

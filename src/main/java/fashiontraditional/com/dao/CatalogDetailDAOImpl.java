package fashiontraditional.com.dao;

import java.util.LinkedList;
import java.util.List;

import org.hibernate.Query;
//import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import fashiontraditional.com.model.Banner;

@Repository
public class CatalogDetailDAOImpl implements CatalogDetailDAO {

	private SessionFactory sessionFactory;

	@Autowired
	public CatalogDetailDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public List<Banner> getBanners() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		Query query = session.createQuery("FROM BANNER");

		List<Banner> results = query.list();
		session.flush();
		return results;

		// List<Banner> banners = new LinkedList<Banner>();
		// banners.add(new Banner(1, "images/banner1.jpg"));
		// banners.add(new Banner(2, "images/banner2.jpg"));
		// banners.add(new Banner(3, "images/banner3.jpg"));
		// banners.add(new Banner(4, "images/details.png"));
		// banners.add(new Banner(5, "images/banner4.jpg"));
		// banners.add(new Banner(6, "images/banner5.jpg"));
		// return banners;
	}

}

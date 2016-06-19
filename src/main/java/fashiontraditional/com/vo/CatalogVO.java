package fashiontraditional.com.vo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

import fashiontraditional.com.model.Catalog;

@Entity
public class CatalogVO {
	@Id
	private int id;
	private String name;
	private List<CatalogVO> childrens;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<CatalogVO> getChildrens() {
		return childrens;
	}

//	public void setChildrens(List<CatalogVO> childrens) {
//		this.childrens = childrens;
//	}

	public void setChildrens(List<Catalog> catalogsChild) {
		this.childrens = new LinkedList<CatalogVO>();

		for (Catalog catalog : catalogsChild) {
			CatalogVO c = new CatalogVO();
			c.setId(catalog.getId());
			c.setName(catalog.getName());
			this.childrens.add(c);
		}

	}

}

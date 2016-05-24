package fashiontraditional.com.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "BANNER")
public class Banner implements Serializable {

	private static final long serialVersionUID = 7815564168593347170L;

	public Banner() {
		super();
	}

	public Banner(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Id
	private int id;
	@Column
	private String name;

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

	@Override
	public String toString() {
		return "Banner [id=" + id + ", name=" + name + "]";
	}

}

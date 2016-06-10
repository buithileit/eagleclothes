package fashiontraditional.com.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "BANNER")
public class Banner implements Serializable {

	private static final long serialVersionUID = 7815564168593347170L;

	@Id
	@GeneratedValue
	@Column(name = "ID")
	private int id;
	@Column(name = "NAME")
	private String name;

	@Column(name = "LINK_IMAGE", nullable = false)
	private String linkImage;

	public Banner() {
		super();
	}

	public Banner(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Banner(int id, String name, String linkImage) {
		super();
		this.id = id;
		this.name = name;
		this.linkImage = linkImage;
	}

	public String getLinkImage() {
		return linkImage;
	}

	public void setLinkImage(String linkImage) {
		this.linkImage = linkImage;
	}

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

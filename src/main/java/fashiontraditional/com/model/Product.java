package fashiontraditional.com.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity(name = "PRODUCT")
public class Product {
	@Id
	@Column(name = "ID")
	@GeneratedValue
	private long id;
	@Column(name = "NAME")
	private String name;
	@Column(name = "PRICE")
	private double price;
	@Column(name = "COLOR")
	private String color;
	@Column(name = "SIZE")
	private int size;
	@Column(name = "DESCRIPTION")
	private String description;
	@Column(name = "IMAGE")
	private String image;
	@Column(name = "IMAGE_THUMBNAIL")
	private String imageThumbnail;
	@Column(name = "RATE")
	private short rate;

	@OneToMany(mappedBy = "product")
	private Set<CatalogDetail> catalogDetails;

	// @OneToMany
	// private Set<String> sizes;

	public long getId() {
		return id;
	}

	public Set<CatalogDetail> getCatalogDetails() {
		return catalogDetails;
	}

	public void setCatalogDetails(Set<CatalogDetail> catalogDetails) {
		this.catalogDetails = catalogDetails;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getImageThumbnail() {
		return imageThumbnail;
	}

	public void setImageThumbnail(String imageThumbnail) {
		this.imageThumbnail = imageThumbnail;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public short getRate() {
		return rate;
	}

	public void setRate(short rate) {
		this.rate = rate;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price
				+ ", color=" + color + ", size=" + size + "]";
	}
	

}

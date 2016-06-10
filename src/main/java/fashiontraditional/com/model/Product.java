package fashiontraditional.com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

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

	// @OneToMany
	// private Set<Color> colors;
	// @OneToMany
	// private Set<String> sizes;

	
	public long getId() {
		return id;
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
	//
	// public Set<String> getColors() {
	// return colors;
	// }
	//
	// public void setColors(Set<String> colors) {
	// this.colors = colors;
	// }
	//
	// public Set<String> getSizes() {
	// return sizes;
	// }
	//
	// public void setSizes(Set<String> sizes) {
	// this.sizes = sizes;
	// }
	//
	// public void addColor(String color) {
	// colors.add(color);
	// }
	//
	// public void addSize(String size) {
	// sizes.add(size);
	// }

}

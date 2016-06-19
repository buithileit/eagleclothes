package fashiontraditional.com.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import fashiontraditional.com.model.enumType.Status;
import fashiontraditional.com.model.enumType.TypeUser;

@Entity(name = "USER")
public class User implements Serializable {

	private static final long serialVersionUID = -4597595886209812513L;
	@Id
	@Column(name = "ID")
	@GeneratedValue
	private long id;
	@Column(name = "EMAIL", unique = true, nullable = false)
	private String email;
	@Column(name = "NAME")
	private String name;
	@Column(name = "PASSWORD")
	private String password;
	@Column(name = "PHONE_NUMBER")
	private String phoneNumber;
	@ManyToOne(targetEntity = Address.class)
	@JoinColumn(name = "ADDRESS_ID", referencedColumnName = "ID")
	private Address address;
	@Column(name = "TYPE_USER")
	@Enumerated(EnumType.ORDINAL)
	private TypeUser typeUser;
	@Column(name = "STATUS")
	@Enumerated(EnumType.ORDINAL)
	private Status status;
	@Column(name = "IMAGE_THUMBNAIL")
	private String imageThumbnail;

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public TypeUser getTypeUser() {
		return typeUser;
	}

	public void setTypeUser(TypeUser typeUser) {
		this.typeUser = typeUser;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public String getImageThumbnail() {
		return imageThumbnail;
	}

	public void setImageThumbnail(String imageThumbnail) {
		this.imageThumbnail = imageThumbnail;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}

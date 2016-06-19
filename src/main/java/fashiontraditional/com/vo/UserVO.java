package fashiontraditional.com.vo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import fashiontraditional.com.bean.RegisterBean;
import fashiontraditional.com.util.SystemUtil;

@Entity
@Table(name = "USER")
public class UserVO implements Serializable {

	@Id
	private Long id;
	private String email;
	private String name;
	private String password;
	private String phoneNumber;
	private String address;
	private String imageThumbnail;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getImageThumbnail() {
		return imageThumbnail;
	}

	public void setImageThumbnail(String imageThumbnail) {
		this.imageThumbnail = imageThumbnail;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public final String toString() {
		if (password == null)
			password = "";
		if (phoneNumber == null)
			phoneNumber = "";
		return email + password + phoneNumber;
	}

	public boolean checkValues() {
		boolean result = false;
		if (SystemUtil.checkEmail(this.email)
				&& SystemUtil.checkPhoneNumber(this.phoneNumber)
				&& !SystemUtil.isNullOrEmpty(password)) {
			result = true;
		}
		if (SystemUtil.isNullOrEmpty(name))
			this.name = email;
		return result;
	}

	public void setData(RegisterBean register) {
		this.address = register.getAddress();
		this.email = register.getEmail();
		this.imageThumbnail = register.getImageThumbnail();
		this.name = register.getName();
		this.password = register.getPassword();
		this.phoneNumber = register.getPhoneNumber();

	}
}

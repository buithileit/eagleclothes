package fashiontraditional.com.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;

import fashiontraditional.com.util.SystemUtil;

@Entity
public class RegisterBean implements Serializable {

	private String email;
	private String name;
	private String phoneNumber;
	private String address;
	private String imageThumbnail;
	private String password;
	private String prePassword;

	public String getPrePassword() {
		return prePassword;
	}

	public void setPrePassword(String prePassword) {
		this.prePassword = prePassword;
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
		return email + password + phoneNumber + name;
	}

	public boolean checkValues() {
		boolean result = false;
		if (SystemUtil.checkEmail(this.email)
				&& SystemUtil.checkPhoneNumber(this.phoneNumber)
				&& !SystemUtil.isNullOrEmpty(password)
				&& this.password.equals(prePassword)) {
			result = true;
		}
		if (SystemUtil.isNullOrEmpty(name))
			this.name = email;
		return result;
	}
}

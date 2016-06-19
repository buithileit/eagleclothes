package fashiontraditional.com.util;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.validator.EmailValidator;

import fashiontraditional.com.vo.UserVO;

public class SystemUtil {

	public static String generateHash(String email,
			String password) throws NoSuchAlgorithmException,
			UnsupportedEncodingException {
		// SHA or MD5
		MessageDigest md = MessageDigest.getInstance("MD5");
		String hash = "";

		String input = email + password;
		byte[] data = input.getBytes("US-ASCII");

		md.update(data);
		byte[] digest = md.digest();
		for (int i = 0; i < digest.length; i++) {
			String hex = Integer.toHexString(digest[i]);
			if (hex.length() == 1)
				hex = "0" + hex;
			hex = hex.substring(hex.length() - 2);
			hash += hex;
		}

		return hash;
	}

	public static boolean isNullOrEmpty(String line) {
		if (line == null || line.isEmpty()) {
			return true;
		}
		return false;
	}

	@SuppressWarnings("deprecation")
	public static boolean checkEmail(String email) {
		boolean valid = EmailValidator.getInstance().isValid(email);

		return valid;
	}

	@SuppressWarnings("deprecation")
	public static boolean checkPhoneNumber(String phoneNumber) {

		String regex = "^\\+?[0-9. ()-]{10,25}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(phoneNumber);

		if (matcher.matches()) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println(checkPhoneNumber("01282470953"));
	}
}

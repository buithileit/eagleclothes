package fashiontraditional.com.util;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import fashiontraditional.com.vo.UserVO;

public class SystemUtil {

	public static String generateHash(UserVO user)
			throws NoSuchAlgorithmException, UnsupportedEncodingException {
		// SHA or MD5
		MessageDigest md = MessageDigest.getInstance("MD5");
		String hash = "";

		String input = user.toString();
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
}

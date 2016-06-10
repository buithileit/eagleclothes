package fashiontraditional.com.util;

import java.util.Date;
import java.util.StringTokenizer;

@SuppressWarnings("deprecation")
public class DateUtils {

	/**
	 * parse Date
	 * 
	 * @param date
	 * @return
	 */
	public static Date createDate(String date) {
		StringTokenizer token = new StringTokenizer(date, "/-:\\");
		int day = 1, month = 1, year = 1;
		// thang +1, nam +1900
		try {
			while (token.hasMoreTokens()) {
				// System.out.println(token.nextToken());
				// System.out.println(token.nextToken());
				// System.out.println(token.nextToken());
				// day = Integer.parseInt(token.nextToken());
				// day = day <= 0 ? 1 : day;
				// month = Integer.parseInt(token.nextToken());
				// month = month <= 0 ? 1 : month;
				// year = Integer.parseInt(token.nextToken());
				// year = year <= 0 ? 1 : year;
			}
			month = month - 1;
			year = year - 1900;
			return new Date(year, month, day);
		} catch (Exception e) {
			System.out.println("Input false !");
			e.printStackTrace();
			return new Date(date);
		}
	}

	// set Date cho true
	public Date getDate(String date) {
		StringTokenizer token = new StringTokenizer(date, "/-:\\");
		int ngay = 1, thang = 1, nam = 1;
		// thang +1, nam +1900
		try {
			while (token.hasMoreTokens()) {
				System.out.println(token.nextToken());
				// System.out.println(token.nextToken());
				// System.out.println(token.nextToken());
				// ngay = Integer.parseInt(token.nextToken());
				// thang = Integer.parseInt(token.nextToken());
				// nam = Integer.parseInt(token.nextToken());
			}
			thang = thang - 1;
			nam = nam - 1900;
			return new Date(nam, thang, ngay);
		} catch (Exception e) {
			System.out.println("Input false !");
			e.printStackTrace();
			return null;
		}
	}

	public static Date getDateTime(String dateTime) {
		StringTokenizer token = new StringTokenizer(dateTime, "/-\\: ");
		int ngay = 0, thang = 0, nam = 0, gio = 0, phut = 0, giay = 0;
		// thang +1, nam +1900
		try {
			while (token.hasMoreTokens()) {
				ngay = Integer.parseInt(token.nextToken());
				thang = Integer.parseInt(token.nextToken());
				nam = Integer.parseInt(token.nextToken());
				gio = Integer.parseInt(token.nextToken());
				phut = Integer.parseInt(token.nextToken());
				giay = Integer.parseInt(token.nextToken());
			}
			thang = thang - 1;
			nam = nam - 1900;
			return new Date(nam, thang, ngay, gio, phut, giay);
		} catch (Exception e) {
			System.out.println("Input false !");
			e.printStackTrace();
			return null;
		}
	}
}

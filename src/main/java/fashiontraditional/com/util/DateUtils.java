package fashiontraditional.com.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.StringTokenizer;

import org.apache.log4j.Logger;

import fashiontraditional.com.services.OrderServiceImpl;

@SuppressWarnings("deprecation")
public class DateUtils {

	/**
	 * parse Date
	 * 
	 * @param date
	 * @return
	 */

	private static final Logger logger = Logger.getLogger(DateUtils.class);

	public static String format(Date d, String format) {
		if (d == null) {
			return " ";
		}
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		return sdf.format(d);
	}

	public static Date now(String formatDate) {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat(formatDate);
		try {
			return sdf.parse(sdf.format(cal.getTime()));
		} catch (ParseException e) {
			return new Date();
		}
	}

	public static Date createDate(String date) {
		StringTokenizer token = new StringTokenizer(date, "/-:\\");
		int day = 1, month = 1, year = 1;
		// thang +1, nam +1900
		try {
			while (token.hasMoreTokens()) {
				// System.out.println(token.nextToken());
				// System.out.println(token.nextToken());
				// System.out.println(token.nextToken());
				day = Integer.parseInt(token.nextToken());
				// day = day <= 0 ? 1 : day;
				month = Integer.parseInt(token.nextToken());
				// month = month <= 0 ? 1 : month;
				year = Integer.parseInt(token.nextToken());
				// year = year <= 0 ? 1 : year;
			}
			month = month - 1;
			year = year - 1900;
			return new Date(year, month, day);
		} catch (Exception e) {
			// System.out.println("Input false !");
			// e.printStackTrace();
			logger.error("createDate ", e);
			return new Date(date);
		}
	}

	// set Date cho true
	public static Date getDate(String date) {
		StringTokenizer token = new StringTokenizer(date, "/-:\\");
		int ngay = 1, thang = 1, nam = 1;
		// thang +1, nam +1900
		try {
			while (token.hasMoreTokens()) {
				// System.out.println(token.nextToken());
				// System.out.println(token.nextToken());
				ngay = Integer.parseInt(token.nextToken());
				thang = Integer.parseInt(token.nextToken());
				nam = Integer.parseInt(token.nextToken());
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

	public static Date addDate(Date input, int number) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(input);

		cal.add(Calendar.DATE, number);

		return cal.getTime();
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

package ru.kle10wka.main;

import java.util.Calendar;
import java.util.Locale;
import org.apache.log4j.Logger;


public class TimeTest {

	private static String LOG_FILE = "C:/da/Workspace/TimeTest/src/main/resources/log4j.properties";
	private static Logger logger = Logger.getLogger(TimeTest.class);
	
	public static void main(String[] args) {

		Locale currLocale = Locale.getDefault();
		Calendar calendarTime = Calendar.getInstance();
		TimeUtil currTime = new TimeUtil(calendarTime, currLocale);
		String result = currTime.getResult();
		LogConfig lc = new LogConfig(LOG_FILE);
		lc.initProp();
		logger.info(result);
		System.out.println(result);
	}

}

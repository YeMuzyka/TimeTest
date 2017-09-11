package ru.kle10wka.main;

import java.util.Calendar;
import java.util.Locale;
import java.util.ResourceBundle;

public class TimeUtil {

	private Calendar time;
	ResourceBundle res;
	
	public TimeUtil(Calendar time, Locale locale){
		this.time = time;
		if(locale.getLanguage().equals(new Locale("ru").getLanguage()) || locale.getLanguage().equals(new Locale("en").getLanguage())){
			this.res = ResourceBundle.getBundle("message", locale);
		} else {
			Locale defaultLocale = new Locale("en");
			this.res = ResourceBundle.getBundle("message", defaultLocale);
		}
	}
	
	public String getResult(){
		
		int currHour = time.get(Calendar.HOUR_OF_DAY);
		String result = new String();
		if(currHour >= 0 && currHour < 6 || currHour == 23){
			result = res.getString("good.night");
		} else 
			if(currHour >= 6 && currHour < 9){
				result = res.getString("good.morning");
			}else 
				if(currHour >= 9 && currHour < 19){
					result = res.getString("good.day");
				} else 
					if(currHour >= 19 && currHour < 23){
						result = res.getString("good.evening");
					}
		return result;
	}
}

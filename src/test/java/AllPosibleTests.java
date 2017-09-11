import java.util.Calendar;
import java.util.Locale;
import org.junit.Assert;
import org.junit.Test;
import ru.kle10wka.main.TimeUtil;

public class AllPosibleTests {

	@Test
	public void test_RU_0_clock() {
		Locale currLocale = new Locale("ru");
		Calendar calendarTime = Calendar.getInstance(currLocale);
		calendarTime.set(Calendar.HOUR_OF_DAY, 0);
		TimeUtil currTime = new TimeUtil(calendarTime, currLocale);
		Assert.assertTrue(currTime.getResult().equals("Доброй ночи, Мир!"));
	}

	@Test
	public void test_RU_23_o_clock(){
		Locale currLocale = new Locale("ru");
		Calendar calendarTime = Calendar.getInstance(currLocale);
		calendarTime.set(Calendar.HOUR_OF_DAY, 23);
		TimeUtil currTime = new TimeUtil(calendarTime, currLocale);
		Assert.assertTrue(currTime.getResult().equals("Доброй ночи, Мир!"));
	}
	
	@Test
	public void test_RU_6_o_clock(){
		Locale currLocale = new Locale("ru");
		Calendar calendarTime = Calendar.getInstance(currLocale);
		calendarTime.set(Calendar.HOUR_OF_DAY, 6);
		TimeUtil currTime = new TimeUtil(calendarTime, currLocale);
		Assert.assertTrue(currTime.getResult().equals("Доброе утро, Мир!"));
	}
	
	@Test
	public void test_RU_9_o_clock(){
		Locale currLocale = new Locale("ru");
		Calendar calendarTime = Calendar.getInstance(currLocale);
		calendarTime.set(Calendar.HOUR_OF_DAY, 9);
		TimeUtil currTime = new TimeUtil(calendarTime, currLocale);
		Assert.assertTrue(currTime.getResult().equals("Добрый день, Мир!"));
	}
	
	@Test
	public void test_RU_19_o_clock(){
		Locale currLocale = new Locale("ru");
		Calendar calendarTime = Calendar.getInstance(currLocale);
		calendarTime.set(Calendar.HOUR_OF_DAY, 19);
		TimeUtil currTime = new TimeUtil(calendarTime, currLocale);
		Assert.assertTrue(currTime.getResult().equals("Добрый вечер, Мир!"));
	}
	
	@Test
	public void test_RU_5_o_clock(){
		Locale currLocale = new Locale("ru");
		Calendar calendarTime = Calendar.getInstance(currLocale);
		calendarTime.set(Calendar.HOUR_OF_DAY, 5);
		TimeUtil currTime = new TimeUtil(calendarTime, currLocale);
		Assert.assertTrue(currTime.getResult().equals("Доброй ночи, Мир!"));
	}
	
	@Test
	public void test_RU_8_o_clock(){
		Locale currLocale = new Locale("ru");
		Calendar calendarTime = Calendar.getInstance(currLocale);
		calendarTime.set(Calendar.HOUR_OF_DAY, 8);
		TimeUtil currTime = new TimeUtil(calendarTime, currLocale);
		Assert.assertTrue(currTime.getResult().equals("Доброе утро, Мир!"));
	}
	
	@Test
	public void test_RU_14_o_clock(){
		Locale currLocale = new Locale("ru");
		Calendar calendarTime = Calendar.getInstance(currLocale);
		calendarTime.set(Calendar.HOUR_OF_DAY, 14);
		TimeUtil currTime = new TimeUtil(calendarTime, currLocale);
		Assert.assertTrue(currTime.getResult().equals("Добрый день, Мир!"));
	}
	
	@Test
	public void test_RU_21_o_clock(){
		Locale currLocale = new Locale("ru");
		Calendar calendarTime = Calendar.getInstance(currLocale);
		calendarTime.set(Calendar.HOUR_OF_DAY, 21);
		TimeUtil currTime = new TimeUtil(calendarTime, currLocale);
		Assert.assertTrue(currTime.getResult().equals("Добрый вечер, Мир!"));
	}
	
	@Test
	public void test_EN_0_clock() {
		Locale currLocale = new Locale("en");
		Calendar calendarTime = Calendar.getInstance(currLocale);
		calendarTime.set(Calendar.HOUR_OF_DAY, 0);
		TimeUtil currTime = new TimeUtil(calendarTime, currLocale);
		Assert.assertTrue(currTime.getResult().equals("Good night, World!"));
	}

	@Test
	public void test_EN_23_o_clock(){
		Locale currLocale = new Locale("en");
		Calendar calendarTime = Calendar.getInstance(currLocale);
		calendarTime.set(Calendar.HOUR_OF_DAY, 23);
		TimeUtil currTime = new TimeUtil(calendarTime, currLocale);
		Assert.assertTrue(currTime.getResult().equals("Good night, World!"));
	}
	
	@Test
	public void test_EN_6_o_clock(){
		Locale currLocale = new Locale("en");
		Calendar calendarTime = Calendar.getInstance(currLocale);
		calendarTime.set(Calendar.HOUR_OF_DAY, 6);
		TimeUtil currTime = new TimeUtil(calendarTime, currLocale);
		Assert.assertTrue(currTime.getResult().equals("Good morning, World!"));
	}
	
	@Test
	public void test_EN_9_o_clock(){
		Locale currLocale = new Locale("en");
		Calendar calendarTime = Calendar.getInstance(currLocale);
		calendarTime.set(Calendar.HOUR_OF_DAY, 9);
		TimeUtil currTime = new TimeUtil(calendarTime, currLocale);
		Assert.assertTrue(currTime.getResult().equals("Good day, World!"));
	}
	
	@Test
	public void test_EN_19_o_clock(){
		Locale currLocale = new Locale("en");
		Calendar calendarTime = Calendar.getInstance(currLocale);
		calendarTime.set(Calendar.HOUR_OF_DAY, 19);
		TimeUtil currTime = new TimeUtil(calendarTime, currLocale);
		Assert.assertTrue(currTime.getResult().equals("Good evening, World!"));
	}
	
	@Test
	public void test_EN_5_o_clock(){
		Locale currLocale = new Locale("en");
		Calendar calendarTime = Calendar.getInstance(currLocale);
		calendarTime.set(Calendar.HOUR_OF_DAY, 5);
		TimeUtil currTime = new TimeUtil(calendarTime, currLocale);
		Assert.assertTrue(currTime.getResult().equals("Good night, World!"));
	}
	
	@Test
	public void test_EN_8_o_clock(){
		Locale currLocale = new Locale("en");
		Calendar calendarTime = Calendar.getInstance(currLocale);
		calendarTime.set(Calendar.HOUR_OF_DAY, 8);
		TimeUtil currTime = new TimeUtil(calendarTime, currLocale);
		Assert.assertTrue(currTime.getResult().equals("Good morning, World!"));
	}
	
	@Test
	public void test_EN_14_o_clock(){
		Locale currLocale = new Locale("en");
		Calendar calendarTime = Calendar.getInstance(currLocale);
		calendarTime.set(Calendar.HOUR_OF_DAY, 14);
		TimeUtil currTime = new TimeUtil(calendarTime, currLocale);
		Assert.assertTrue(currTime.getResult().equals("Good day, World!"));
	}
	
	@Test
	public void test_EN_21_o_clock(){
		Locale currLocale = new Locale("en");
		Calendar calendarTime = Calendar.getInstance(currLocale);
		calendarTime.set(Calendar.HOUR_OF_DAY, 21);
		TimeUtil currTime = new TimeUtil(calendarTime, currLocale);
		Assert.assertTrue(currTime.getResult().equals("Good evening, World!"));
	}
	
	@Test
	public void test_FR_0_clock() {
		Locale currLocale = new Locale("fr");
		Calendar calendarTime = Calendar.getInstance(currLocale);
		calendarTime.set(Calendar.HOUR_OF_DAY, 0);
		TimeUtil currTime = new TimeUtil(calendarTime, currLocale);
		Assert.assertTrue(currTime.getResult().equals("Good night, World!"));
	}

	@Test
	public void test_FR_23_o_clock(){
		Locale currLocale = new Locale("fr");
		Calendar calendarTime = Calendar.getInstance(currLocale);
		calendarTime.set(Calendar.HOUR_OF_DAY, 23);
		TimeUtil currTime = new TimeUtil(calendarTime, currLocale);
		Assert.assertTrue(currTime.getResult().equals("Good night, World!"));
	}
	
	@Test
	public void test_FR_6_o_clock(){
		Locale currLocale = new Locale("fr");
		Calendar calendarTime = Calendar.getInstance(currLocale);
		calendarTime.set(Calendar.HOUR_OF_DAY, 6);
		TimeUtil currTime = new TimeUtil(calendarTime, currLocale);
		Assert.assertTrue(currTime.getResult().equals("Good morning, World!"));
	}
	
	@Test
	public void test_FR_9_o_clock(){
		Locale currLocale = new Locale("fr");
		Calendar calendarTime = Calendar.getInstance(currLocale);
		calendarTime.set(Calendar.HOUR_OF_DAY, 9);
		TimeUtil currTime = new TimeUtil(calendarTime, currLocale);
		Assert.assertTrue(currTime.getResult().equals("Good day, World!"));
	}
	
	@Test
	public void test_FR_19_o_clock(){
		Locale currLocale = new Locale("fr");
		Calendar calendarTime = Calendar.getInstance(currLocale);
		calendarTime.set(Calendar.HOUR_OF_DAY, 19);
		TimeUtil currTime = new TimeUtil(calendarTime, currLocale);
		Assert.assertTrue(currTime.getResult().equals("Good evening, World!"));
	}
	
	@Test
	public void test_FR_5_o_clock(){
		Locale currLocale = new Locale("fr");
		Calendar calendarTime = Calendar.getInstance(currLocale);
		calendarTime.set(Calendar.HOUR_OF_DAY, 5);
		TimeUtil currTime = new TimeUtil(calendarTime, currLocale);
		Assert.assertTrue(currTime.getResult().equals("Good night, World!"));
	}
	
	@Test
	public void test_FR_8_o_clock(){
		Locale currLocale = new Locale("fr");
		Calendar calendarTime = Calendar.getInstance(currLocale);
		calendarTime.set(Calendar.HOUR_OF_DAY, 8);
		TimeUtil currTime = new TimeUtil(calendarTime, currLocale);
		Assert.assertTrue(currTime.getResult().equals("Good morning, World!"));
	}
	
	@Test
	public void test_FR_14_o_clock(){
		Locale currLocale = new Locale("fr");
		Calendar calendarTime = Calendar.getInstance(currLocale);
		calendarTime.set(Calendar.HOUR_OF_DAY, 14);
		TimeUtil currTime = new TimeUtil(calendarTime, currLocale);
		Assert.assertTrue(currTime.getResult().equals("Good day, World!"));
	}
	
	@Test
	public void test_FR_21_o_clock(){
		Locale currLocale = new Locale("fr");
		Calendar calendarTime = Calendar.getInstance(currLocale);
		calendarTime.set(Calendar.HOUR_OF_DAY, 21);
		TimeUtil currTime = new TimeUtil(calendarTime, currLocale);
		Assert.assertTrue(currTime.getResult().equals("Good evening, World!"));
	}
	
	@Test
	public void test_DE_0_clock() {
		Locale currLocale = new Locale("de");
		Calendar calendarTime = Calendar.getInstance(currLocale);
		calendarTime.set(Calendar.HOUR_OF_DAY, 0);
		TimeUtil currTime = new TimeUtil(calendarTime, currLocale);
		Assert.assertTrue(currTime.getResult().equals("Good night, World!"));
	}

	@Test
	public void test_DE_23_o_clock(){
		Locale currLocale = new Locale("de");
		Calendar calendarTime = Calendar.getInstance(currLocale);
		calendarTime.set(Calendar.HOUR_OF_DAY, 23);
		TimeUtil currTime = new TimeUtil(calendarTime, currLocale);
		Assert.assertTrue(currTime.getResult().equals("Good night, World!"));
	}
	
	@Test
	public void test_DE_6_o_clock(){
		Locale currLocale = new Locale("de");
		Calendar calendarTime = Calendar.getInstance(currLocale);
		calendarTime.set(Calendar.HOUR_OF_DAY, 6);
		TimeUtil currTime = new TimeUtil(calendarTime, currLocale);
		Assert.assertTrue(currTime.getResult().equals("Good morning, World!"));
	}
	
	@Test
	public void test_DE_9_o_clock(){
		Locale currLocale = new Locale("de");
		Calendar calendarTime = Calendar.getInstance(currLocale);
		calendarTime.set(Calendar.HOUR_OF_DAY, 9);
		TimeUtil currTime = new TimeUtil(calendarTime, currLocale);
		Assert.assertTrue(currTime.getResult().equals("Good day, World!"));
	}
	
	@Test
	public void test_DE_19_o_clock(){
		Locale currLocale = new Locale("de");
		Calendar calendarTime = Calendar.getInstance(currLocale);
		calendarTime.set(Calendar.HOUR_OF_DAY, 19);
		TimeUtil currTime = new TimeUtil(calendarTime, currLocale);
		Assert.assertTrue(currTime.getResult().equals("Good evening, World!"));
	}
	
	@Test
	public void test_DE_5_o_clock(){
		Locale currLocale = new Locale("de");
		Calendar calendarTime = Calendar.getInstance(currLocale);
		calendarTime.set(Calendar.HOUR_OF_DAY, 5);
		TimeUtil currTime = new TimeUtil(calendarTime, currLocale);
		Assert.assertTrue(currTime.getResult().equals("Good night, World!"));
	}
	
	@Test
	public void test_DE_8_o_clock(){
		Locale currLocale = new Locale("de");
		Calendar calendarTime = Calendar.getInstance(currLocale);
		calendarTime.set(Calendar.HOUR_OF_DAY, 8);
		TimeUtil currTime = new TimeUtil(calendarTime, currLocale);
		Assert.assertTrue(currTime.getResult().equals("Good morning, World!"));
	}
	
	@Test
	public void test_DE_14_o_clock(){
		Locale currLocale = new Locale("de");
		Calendar calendarTime = Calendar.getInstance(currLocale);
		calendarTime.set(Calendar.HOUR_OF_DAY, 14);
		TimeUtil currTime = new TimeUtil(calendarTime, currLocale);
		Assert.assertTrue(currTime.getResult().equals("Good day, World!"));
	}
	
	@Test
	public void test_DE_21_o_clock(){
		Locale currLocale = new Locale("de");
		Calendar calendarTime = Calendar.getInstance(currLocale);
		calendarTime.set(Calendar.HOUR_OF_DAY, 21);
		TimeUtil currTime = new TimeUtil(calendarTime, currLocale);
		Assert.assertTrue(currTime.getResult().equals("Good evening, World!"));
	}
}

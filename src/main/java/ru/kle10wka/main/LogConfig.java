package ru.kle10wka.main;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.apache.log4j.PropertyConfigurator;

public class LogConfig {
	private static Properties logProperty = new Properties();
	private String logFile;
	
	public LogConfig(String logFile){
		this.logFile = logFile;
	}
	
	public void initProp(){
		try{
			logProperty.load(new FileInputStream(logFile));
			PropertyConfigurator.configure(logProperty);
		}catch(IOException ie){
			ie.printStackTrace();
		}
	}
}
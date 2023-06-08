package com.utility;

import org.openqa.selenium.WebDriver;

public class Config {
	
public static WebDriver driver;
	
	public static String projectPath = System.getProperty("user.dir");
	
	public static String chromeDriverPath = projectPath + "\\drivers\\chromedriver.exe";
	
	public static String geckoDriverPath = projectPath + "\\drivers\\geckodriver.exe";
	
	public static String excelPath = projectPath + "\\src\\main\\java\\com\\testdata\\testdata.xlsx";
	
	public static String filepath = projectPath + "\\src\\main\\java\\com\\config\\Config.properties";


	
	public static String screenshotsPath = projectPath + "\\screenshots\\";
	
	public static String url = "https://www.apollo247.com/";
	
	public static long PAGE_LOAD_TIMEOUT = 10;
	public static long IMPLICIT_WAIT = 15;
	
	

}

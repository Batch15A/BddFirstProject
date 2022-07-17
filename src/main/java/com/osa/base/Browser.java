package com.osa.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Browser {
	public static WebDriver openBrowser() {
		WebDriver dr;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Md Obaidulla\\Desktop\\drivers\\Drivers\\chromedriver.exe");
		dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return dr;
	}
}

package org.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {

	public static void main(String[] args) {
		//Set the property of the Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\eclipse-workspace\\SeleniumNovemberBatch\\Driver\\chromedriver.exe");
		//Intilize the WebDriver
		WebDriver driver = new ChromeDriver();
		//to launch the URL
		driver.get("https://www.facebook.com/");
		
	}

}

package org.sample.FirstMaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lanuch {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse\\Demo\\FirstMaven\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/3.141.59");
	}
}

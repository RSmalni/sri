package bom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Malni {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Facebook\\driver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.instagram.com/accounts/login/?h1=en)login page");
		
		WebElement game = d.findElement(By.xpath("(//input[@class='_2hvTZ pexuQ zyHYP'])[1]"));
		
		game.sendKeys("ramshakthis@gmail.com");
		
		WebElement text = d.findElement(By.xpath("//input[@type='password']"));
		
		text.sendKeys("23456788887");
		
		WebElement log = d.findElement(By.xpath("//button[@type='submit']"));
		
		log.click();
		
	}

}

package bom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hotel {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Facebook\\driver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.facebook.com/");
		
		WebElement net = d.findElement(By.xpath("//input[@id='email']"));
		
		net.sendKeys("ramsakthi");
		
		
		
		
		
		WebElement text1 = d.findElement(By.xpath("//input[@name='pass']"));
		
		text1.sendKeys("23456778876");
		
		
		WebElement tetlog = d.findElement(By.xpath("//button[@name='login']"));
		
		tetlog.click();
		
		WebElement tetcrat = d.findElement(By.xpath("(//a[@role='button'])[2]"));
		
		tetcrat.click();
		
		
		

}
}
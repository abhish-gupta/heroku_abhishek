package selenium;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class herokuapp {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		
		String downloadFilePath = "C:\\Users\\Abhi\\Desktop\\herokuapp\\";
		HashMap<String, Object>chromePref = new HashMap<String, Object>();
		chromePref.put("download.default_directory", downloadFilePath);
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", chromePref);
		WebDriver driver;
		driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		
		//File Upload
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[contains(.,'File Upload')]")).click();
		driver.findElement(By.xpath("//input[@id='file-upload']")).sendKeys("C:\\Users\\Abhi\\Documents\\demo.jpg");
		driver.findElement(By.id("file-submit")).click();
		Thread.sleep(2000);
		
		//File Download
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[contains(.,'File Download')]")).click();
		driver.findElement(By.xpath("//a[contains(.,'image007.png')]")).click();
		Thread.sleep(2000);
		
		//New Window
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[contains(.,'Multiple Windows')]")).click();
		driver.findElement(By.xpath("//a[contains(.,'Click Here')]")).click();
		
	}

}

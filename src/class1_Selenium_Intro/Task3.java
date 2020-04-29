package class1_Selenium_Intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task3 {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.gecko.driver", "drivers\\geckodriver.exe");
		WebDriver dr = new FirefoxDriver();
		
		dr.navigate().to("http://newtours.demoaut.com/");
		
		dr.findElement(By.linkText("Register here")).click();
		
		dr.findElement(By.className("firstName")).sendKeys("Jemka");
		
		dr.findElement(By.className("lastName")).sendKeys("Mert");
		
		dr.findElement(By.className("Phone")).sendKeys("2326568");
		
		dr.findElement(By.id("userName")).sendKeys("@jemkajik.com");
		
		dr.findElement(By.className("address")).sendKeys("Dogwood Dr");
		
		dr.findElement(By.className("city")).sendKeys("Dallas");
		
		dr.findElement(By.className("state")).sendKeys("Texas");
		
		dr.findElement(By.className("postalCode")).sendKeys("47474");
		
		dr.findElement(By.className("register")).click();
		
		dr.findElement(By.className("email")).sendKeys("Jemka@gmail.com");
		
		dr.findElement(By.className("password")).sendKeys("guljejik1255113");
		
		dr.findElement(By.className("confirmPassword")).sendKeys("guljejik1255113");
		
		dr.findElement(By.className("register")).click();
	}

}

package class7_HandleWindows_Snchronization_Waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.syntax.utils.BaseClass;

public class FrameRecap {

	public static void main(String[] args) {
		
		WebDriver driver = BaseClass.setUp();
		
		boolean isHomeDis = driver.findElement(By.xpath("//a[@href='./index.html']")).isDisplayed();
		
		System.out.println("Is Home Linke Displayed? "+isHomeDis);
		
		driver.switchTo().frame("FrameOne");
		
		String welcomeMsg = driver.findElement(By.xpath("//h3[text()='Welcome to Selenium Easy ']")).getText();
		
		System.out.println(welcomeMsg);
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("FrameTwo");
		
		boolean bottonEnabled = driver.findElement(By.xpath("//a[@class='enroll-btn']")).isEnabled();
		
		System.out.println("is enroll BTN enabaled===>"+bottonEnabled);
		
		
		
		
		
		
		
		
		
		
		

	}

}

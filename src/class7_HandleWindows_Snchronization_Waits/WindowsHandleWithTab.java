package class7_HandleWindows_Snchronization_Waits;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandleWithTab {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-switch-windows-2/");
		
		String signUpTitle = driver.getTitle();
		System.out.println("Main page title is::"+signUpTitle);
		
		String parentWindowHandle = driver.getWindowHandle();//grab the handle of parent window.
		System.out.println("What is the Parent Window Handle???==>"+parentWindowHandle);
		
		for(int i=0; i<=3; i++) {
			driver.findElement(By.xpath("//button[@onclick='newBrwTab()']")).click();
			Thread.sleep(2000);			
		}
		Set<String> allWindowsHAndle = driver.getWindowHandles();
		
		for (String handle : allWindowsHAndle) {
			System.out.println("Id Of the Window ::"+handle);
			driver.switchTo().window(handle);
			driver.get("https://www.google.com");
			Thread.sleep(2000);
			driver.close();
		}
		
		
		
		

	}

}

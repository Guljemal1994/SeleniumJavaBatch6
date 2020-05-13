package class7_HandleWindows_Snchronization_Waits;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleWindowHandle {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/signup");
		
		String signUpTitle = driver.getTitle();
		System.out.println("Main page title is::"+signUpTitle);
		driver.findElement(By.linkText("Help")).click();
		/*
		 * How to get window handle?
		 * In selenium we have two method to get the hand of window 
		 * gitWindowHandle();
		 * gitWindowHandles();
		 * 
		 */
		Set<String>allWindowHandle = driver.getWindowHandles();//Returns set of String IDs 
		//of all windows currently opened by the current instance
		System.out.println("Number of windows opened are:: "+allWindowHandle.size());//get size of set
		Iterator<String>it = allWindowHandle.iterator();
		
		String mainWindowHandle = it.next();//returns the id of Mine Window 
		System.out.println("Id is Main window:: "+mainWindowHandle);
		
		String childWindowHandle = it.next();//returns the id of Child Window 
		System.out.println("Id of Child window:: "+childWindowHandle);
		
		
		driver.switchTo().window(childWindowHandle);//Using swithchTo method to another
		//window by passing the handle/Id of window
		
		String chilWindowTitle = driver.getTitle();
		System.out.println("Child page title is::"+chilWindowTitle);
		
		
		
		
		
		
		
		

	}

}

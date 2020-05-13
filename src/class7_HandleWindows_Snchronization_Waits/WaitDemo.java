package class7_HandleWindows_Snchronization_Waits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.syntax.utils.BaseClass;

public class WaitDemo {

	public static void main(String[] args) {

	WebDriver driver = BaseClass.setUp();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	
	boolean isHomeDis = driver.findElement(By.xpath("//a[@href='./index.html']")).isDisplayed();
	System.out.println("Is Home Linke Displayed? " + isHomeDis);

	
	}

}

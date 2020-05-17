package classs11_Action_JSExcuter_TakesScreenshots;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import com.syntax.utils.BaseClass;

public class Task2 extends BaseClass{

	/*
	 * TC 2: Upload file and Take Screenshot 
	 * 
	 * Navigate to
	 * 
	 * “http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwFileUpload”
	 * 
	 * Upload file Verify file got successfully uploaded and take screenshot
	 * 
	 */
	public static void main(String[] args) throws IOException {

		setUp();//http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwFileUpload
	
		String path = " C:\\Users\\konul\\OneDrive\\Pictures\\Saved Pictures";
		
	  WebElement chFile = driver.findElement(By.id("gwt-debug-cwFileUpload"));
	  chFile.sendKeys(path);
	  
	  driver.findElement(By.xpath("//button[@class='gwt-Button']")).click();
	  Alert alert =driver.switchTo().alert();
	  String text = alert.getText();
	  System.out.println(text);
	  
	  alert.accept();
	  TakesScreenshot takeS = (TakesScreenshot) driver;
	  File file = takeS.getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(file, new File("screenshots/Task2/dashboard.png"));
	  
	  tearDown();
	  
	 
	  
	}

}

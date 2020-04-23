package guljemal_first_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class udemuPractice {

	public static void main(String[] args) {
		
	//Give me the count of links on the page //a
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\konul\\eclipse-workspace\\SeleniumJavaBatch6\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		
		
		
		
		

	}

}

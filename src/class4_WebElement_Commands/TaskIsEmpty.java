package class4_WebElement_Commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskIsEmpty {

	/*
	 * TC 2: HRMS Application Negative Login: Open chrome browser Go to
	 * “http://166.62.36.207/humanresources/symfony/web/index.php/auth/login” Enter
	 * valid username Leave password field empty Verify error message with text
	 * “Password cannot be empty” is displayed.
	 * 
	 */
	public static String url = "http://166.62.36.207/humanresources/symfony/web/index.php/auth/login";

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.findElement(By.cssSelector("input[id=txtUsername]")).sendKeys("Admin");
		driver.findElement(By.cssSelector("input[name=txtPassword]")).sendKeys("");
		driver.findElement(By.cssSelector("input[name=Submit]")).click();

		WebElement el = driver.findElement(By.cssSelector("span[id='spanMessage']"));
		//Thread.sleep(5000);
		String str = el.getText();
		boolean boo = el.isDisplayed();
		if (boo) {
			System.out.println(str + " is displayed");
		} else {
			System.out.println(str + " is not displayed");
		}

		//driver.close();

	}

}

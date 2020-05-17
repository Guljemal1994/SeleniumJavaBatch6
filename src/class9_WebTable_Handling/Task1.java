package class9_WebTable_Handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

import com.syntax.utils.CommanMethods;

public class Task1 extends CommanMethods {

	public static void main(String[] args) {
		/*
		 * 
		 * TC 1: Table headers and rows verification Open chrome browser Go to
		 * “http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.
		 * aspx” Login to the application Verify customer “Susan McLaren” is present in
		 * the table Click on customer details Update customers last name and credit
		 * card info Verify updated customers name and credit card number is displayed
		 * in table Close browser
		 */
		System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY, "true");
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");

		WebElement username = driver.findElement(By.id("ctl00_MainContent_username"));
		sendText(username, "Tester");

		WebElement password = driver.findElement(By.id("ctl00_MainContent_password"));
		sendText(password, "test");
		driver.findElement(By.id("ctl00_MainContent_login_button")).click();

		WebElement Name = driver.findElement(By.xpath("//*[@id='ctl00_MainContent_orderGrid']/tbody/tr[6]/td[2]"));
       System.out.println("is Susan McLaren displayed==>" + Name.isDisplayed());
		driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_orderGrid\"]/tbody/tr[6]/td[13]/input")).click();

		WebElement lastName = driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtName"));
		sendText(lastName, "Jem Mert");
		driver.findElement(By.xpath("//input[@value='Visa']")).click();

		WebElement cc = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox6"));
		sendText(cc, "987456123741");
		driver.findElement(By.xpath("//*[@id='ctl00_MainContent_fmwOrder_UpdateButton']")).click();

		WebElement nName = driver.findElement(By.xpath("//*[@id='ctl00_MainContent_orderGrid']/tbody/tr[6]/td[2]"));
		
		System.out.println("Susan McLaren changed to Jem Mert===> " + nName.isDisplayed());

		WebElement ccard = driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_orderGrid\"]/tbody/tr[6]/td[11]"));
		String ccNum = ccard.getText();
		System.out.println("Jem's credit card number :::" + ccNum);
		
		
		
		
		tearDown();

	}

}

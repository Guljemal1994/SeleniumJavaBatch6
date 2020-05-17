package classs10_WebTables_and_Calenders;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.BaseClass;
import com.syntax.utils.CommonMethods;
import com.syntax.utils.ConfigsReader;

public class SimpleCalendarDemo extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

		setUp();// http://166.62.36.207/humanresources/symfony/web/index.php/dashboard

		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		// Login to HRMS application
		driver.findElement(By.id("txtUsername")).sendKeys(ConfigsReader.getProperty("username"));
		driver.findElement(By.id("txtPassword")).sendKeys(ConfigsReader.getProperty("password"));
		driver.findElement(By.id("btnLogin")).click();

		// Navigate to leave list
		CommonMethods.waitForClickablity(driver.findElement(By.linkText("Leave")));
		driver.findElement(By.linkText("Leave")).click();
        driver.findElement(By.linkText("Leave List")).click();

		// click on the Calender
		WebElement ele = CommonMethods.waitForClickablity(driver.findElement(By.id("calFromDate")));
		ele.click();
		WebElement mDD = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		CommonMethods.selectDdValue(mDD, "Apr");

		WebElement yDD = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		CommonMethods.selectDdValue(yDD, "2021");

		List<WebElement> fromData = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
		for (WebElement fromDay : fromData) {
			Thread.sleep(100);
			if (fromDay.getText().equals("17")) {
				fromDay.click();
				break;

			}

		}

		Thread.sleep(3000);
		tearDown();
	}

}

package class5_DropDowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SaifsClassTask {

	public static void main(String[] args) throws InterruptedException {

		/*
		 * TC 1: Facebook dropdown verification Open chrome browser Go to
		 * "https://www.facebook.com" Verify: month dd has 12 month options day dd has
		 * 31 day options year dd has 116 year options Select your date of birth Quit
		 * browser
		 * 
		 * 
		 */
		// set properties
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// navigate to facebook
		driver.get("https://www.facebook.com/");

		WebElement month = driver.findElement(By.id("month"));
		WebElement day = driver.findElement(By.id("day"));
		WebElement year = driver.findElement(By.id("year"));
		
		Select sMonth = new Select(month);
		Select sDay = new Select(day);
		Select sYear = new Select(year);
		
		List<WebElement> monthList = sMonth.getOptions();
		List<WebElement> dayList = sDay.getOptions();
		List<WebElement> yearList = sYear.getOptions();
		
		System.out.println("====Verifying options=====");
		System.out.println("No of Monthsin list: " + (monthList.size() - 1));
		System.out.println("No of daysin list: " + (dayList.size() - 1));
		System.out.println("No of year in list: " + (yearList.size() - 1));
		
		String mm = null, dd = null, yy = null;
		
		System.out.println();
		
		for (WebElement we : monthList) {
			String str = we.getText();
			if (str.equals("Jan")) {
				sMonth.selectByVisibleText("Jan");
				mm = str;
			}
			for (WebElement wD : dayList) {
				String str1 = wD.getText();
				if (str1.equals("1")) {
					sDay.selectByIndex(1);
					dd = str1;
				}
			}
			for (WebElement wY : yearList) {
				String str2 = wY.getText();
				if (str2.equals("1979")) {
					sYear.selectByValue("1979");
					yy = str2;
				}
			}
		}
		System.out.printf("Date of Birth: " + "%s/%s/%s", yy, mm, dd);
		Thread.sleep(3000);
		driver.quit();

	}

	

}

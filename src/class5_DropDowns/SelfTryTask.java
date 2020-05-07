package class5_DropDowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelfTryTask {
public static void main(String[] args) throws InterruptedException {

		// set properties
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        // navigate to facebook
		driver.get("https://www.facebook.com/");

		WebElement month = driver.findElement(By.id("month"));
		WebElement day = driver.findElement(By.id("day"));
		WebElement year = driver.findElement(By.id("year"));

		Select m = new Select(month);
		Select d = new Select(day);
		Select y = new Select(year);
		
		List<WebElement> mL = m.getOptions();
		List<WebElement> mD = d.getOptions();
		List<WebElement> mY = y.getOptions();
		
		for(WebElement eM:mL) {
			String text = eM.getText();
			if(text.equals("Sep")) {
				m.selectByVisibleText("Sep");
			}
		}
		for(WebElement eD:mD) {
			String tex = eD.getText();
			if(tex.equals("22")) {
				d.selectByIndex(22);
			}
		}
		for(WebElement eY:mY) {
			String t = eY.getText();
			if(t.equals("1994")) {
				y.selectByValue("1994");
			}
		}
		System.out.println("Month::: " + (mL.size()-1));
		System.out.println("Days::: " + (mD.size()-1));
		System.out.println("Year::: " + (mY.size()));
		//System.out.printf("Date of Birth=====>"+month,day,year );
		Thread.sleep(3000);
		driver.close();
		
		
	}

}

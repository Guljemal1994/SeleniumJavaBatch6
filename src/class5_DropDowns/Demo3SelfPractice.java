package class5_DropDowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.syntax.utils.BaseClass;

public class Demo3SelfPractice extends BaseClass {

	public static void main(String[] args) {

		setUp();
		WebElement month = driver.findElement(By.id("month"));
		WebElement day = driver.findElement(By.id("day"));
		WebElement year = driver.findElement(By.id("year"));

		Select m = new Select(month);
		Select d = new Select(day);
		Select y = new Select(year);

		m.selectByVisibleText("Sep");
       List<WebElement> option = m.getOptions();
		if (option.size() - 1 == 12) {
			System.out.println("There is 12 month options");
			// System.out.println(option.size());
		}
		
		d.selectByIndex(21);
        List<WebElement> dayOptions = d.getOptions();
		if (dayOptions.size() - 1 == 31) {
			System.out.println("There is 31 days option");
		}
		y.selectByValue("1994");
		List<WebElement> yearOptions=y.getOptions();
         System.out.println("Year options size==>"+yearOptions.size());
         try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

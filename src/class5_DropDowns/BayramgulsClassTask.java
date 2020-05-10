package class5_DropDowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.syntax.utils.BaseClass;

public class BayramgulsClassTask extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = BaseClass.setUp();// returns WebDriver
		
		WebElement months = driver.findElement(By.id("month"));
		Select mm=new Select(months);
		
		WebElement days = driver.findElement(By.id("day"));
		Select dd=new Select(days);
		
		WebElement years = driver.findElement(By.id("year"));
		Select yy=new Select(years);
		
		
		
		List<WebElement> options=mm.getOptions();
		if(options.size()-1==12) {
			System.out.println("There is 12 months options");
		}
		//System.out.println(options.size());
		mm.selectByVisibleText("Nov");
		
		List<WebElement> dayOptions=dd.getOptions();
		//System.out.println(dayOptions.size());
	
		if(dayOptions.size()-1==31) {
			System.out.println("There is 31 days options");
		}
		dd.selectByIndex(1);
		
		List<WebElement> yearOptions=yy.getOptions();
		if(yearOptions.size()-2==115) {
			System.out.println("There is 115 options");
		}
		yy.selectByValue("1989");
		System.out.println(yearOptions.size());
		Thread.sleep(2000);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

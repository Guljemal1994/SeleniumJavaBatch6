package class5_DropDowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.syntax.utils.BaseClass;

public class DropDownDemo1 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

		// BaseClass.setUp();--> 1st way

		setUp();//open Chrome browser and lunch Syntax Practice Site

		WebElement weekDD = driver.findElement(By.id("select-demo"));

		Select select = new Select(weekDD);//object select class accepts WebElement

		List<WebElement> option = select.getOptions();
		System.out.println("Number of Opetions in the DD==> " + option.size());

		//select.selectByIndex(3);==> will select only one Tuesday

		for(int i = 0; i<option.size(); i++) {
		    select.selectByIndex(i);//==>will select 8 index at the same time
		    Thread.sleep(1000);
		}
		select.selectByVisibleText("Friday");//can select an option by Visible text.
		//In the parameter provide the text visible on UI;
		
		
		Thread.sleep(3000);
		tearDown();

	}
}

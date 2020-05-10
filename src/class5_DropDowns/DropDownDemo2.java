package class5_DropDowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.syntax.utils.BaseClass;

public class DropDownDemo2 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

		setUp();
		WebElement continents = driver.findElement(By.id("continents"));

		Select select = new Select(continents);

		List<WebElement> options = select.getOptions();// it will return list of all option in the DD

		for(WebElement option : options) {//enhanced for loop 
			String text = option.getText();
			System.out.println(text);
			if(text.equals("Africa")) {
				option.click();
				String ddText = option.getText();
				if(ddText.equals("Africa")) {
					System.out.println("Africa is selected==> "+option.isSelected());//true
				}else {
					System.out.println("Africa is not selected");
				}
				
				Thread.sleep(2000);
			}
		}
		boolean isMultiple = select.isMultiple();//showa if DropDown is multi select or not.
		System.out.println("The Continent DD is Multiple==>"+isMultiple);
		tearDown();
		
		
		
		
		
		
		
	}

}

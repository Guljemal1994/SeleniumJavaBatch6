package class4_WebElement_Commands;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioDemo {

	public static String url = "https://demoqa.com/automation-practice-form/";

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get(url);
		WebElement maleRadioB = driver.findElement(By.xpath("//input[@id='sex-1']"));

		System.out.println(maleRadioB.isDisplayed());// true
		System.out.println(maleRadioB.isEnabled());// true
		System.out.println("is Radido Button selected -->" + maleRadioB.isSelected());// false

		System.out.println();

		// fist way to click on a Radio button;
		maleRadioB.click();
		System.out.println("is Radido Button selected:::" + maleRadioB.isSelected());// true
		System.out.println();

		// secend way to click on Radio buttons

		List<WebElement> proList = driver.findElements(By.xpath("//input[@name='profession']"));
		int listSize = proList.size();
		System.out.println("(Profession)Size of Check boxes are:::" + proList.size());
		
		String valueToBeSelected = "Manual Testing";
		for (WebElement profession : proList) {

			if (profession.isEnabled()) {
				
				String value = profession.getAttribute("value");
				
				System.out.println(value);

				if(value.equals(valueToBeSelected)) {
					profession.click();
					break;
				}
			}
		}

		
		
		
		
		
//		System.out.println();
//		List<WebElement> listRadio = driver.findElements(By.xpath("//input[@name='exp']"));
//		System.out.println("Size of Check boxes are(Years of expereince):::" + listRadio.size());// 7

	}

}

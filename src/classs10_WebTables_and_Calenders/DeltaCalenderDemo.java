package classs10_WebTables_and_Calenders;

import org.openqa.selenium.By;

import com.syntax.utils.BaseClass;

public class DeltaCalenderDemo extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		
		setUp();//https://www.delta.com/
		
		//click on the depart/to calender
		driver.findElement(By.xpath("//span[@id='calDepartLabelCont']")).click();
		String dMonth = driver.findElement(By.xpath("//span[@class='dl-datepicker-month-0']")).getText();
		
		while(!dMonth.equals("August")) {
			driver.findElement(By.xpath("//span[text()='Next']")).click();
			Thread.sleep(2000);
			dMonth = driver.findElement(By.xpath("//span[@class='dl-datepicker-month-0']")).getText();
		}
	}
}

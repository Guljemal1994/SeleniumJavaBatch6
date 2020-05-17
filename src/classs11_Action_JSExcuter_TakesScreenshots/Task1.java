package classs11_Action_JSExcuter_TakesScreenshots;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.syntax.utils.BaseClass;

public class Task1 extends BaseClass {

	/*
	 * TC 1: Drag and Drop verification Open chrome browser 
	 * 
	 * Go to “http://www.uitestpractice.com/” 
	 * 
	 * Click on “Droppable” link 
	 * 
	 * Using mouse drag “Drag me to my target” 
	 * 
	 * to the “Drop Here” Close the browser
	 * 
	 */
	public static void main(String[] args) throws InterruptedException {

		setUp();//http://www.uitestpractice.com/
		
		WebElement dropA = driver.findElement(By.id("draggable"));
		WebElement dropH = driver.findElement(By.id("draggable"));
		
		Actions actions = new Actions(driver);
		actions.dragAndDrop(dropA, dropH).perform();
		
		//Thread.sleep(3000);

		tearDown();
	}

}

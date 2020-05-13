package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.BaseClass;
import com.syntax.utils.CommanMethods;
import com.syntax.utils.ConfigsReader;

public class Task_FaceBookSignUp extends CommanMethods {

	public static void main(String[] args) {

		setUp();

		WebElement nameBox = driver.findElement(By.xpath("//input[@id='u_0_m']"));

		sendText(nameBox, ConfigsReader.getProperty("firstname"));

		WebElement lastnameBox = driver.findElement(By.xpath("//input[@id='u_0_o']"));

		sendText(lastnameBox, ConfigsReader.getProperty("lastname"));

		WebElement phoneBox = driver.findElement(By.cssSelector("input[id='u_0_r']"));

		sendText(phoneBox, ConfigsReader.getProperty("email"));

		WebElement reEnterBox = driver.findElement(By.xpath("//input[@id='u_0_u']"));

		sendText(reEnterBox, ConfigsReader.getProperty("email"));

		WebElement newPasswordBox = driver.findElement(By.cssSelector("input[id='u_0_w']"));

		sendText(newPasswordBox, ConfigsReader.getProperty("password"));

		WebElement monthSelect = driver.findElement(By.xpath("//select[@id='month']"));

		selectDdValue(monthSelect, "Sep");

		WebElement daySelect = driver.findElement(By.xpath("//select[@id='day']"));

		selectDdValue(daySelect, "11");

		WebElement yearSelect = driver.findElement(By.xpath("//select[@id='year']"));

		selectDdValue(yearSelect, "1994");

		List<WebElement> radioButtons = driver.findElements(By.xpath("//input[@name='sex']"));

		clickRadioOrCheckbox(radioButtons, "22");

		WebElement signUpButton = driver.findElement(By.xpath("//div[@class='_1lch']//button"));

		signUpButton.click();

	}
}

package com.syntax.utils;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.UnexpectedTagNameException;

public class CommanMethods extends BaseClass {

	/**
	 * Method that clears and sends keys
	 * @param element
	 * @param text
	 */
	public static void sendText(WebElement element, String text) {
		element.clear();
		element.sendKeys(text);
	}
	
	/**
	 * Method checks if radio/checkbox is enabled and clicks it
	 * @param radioOrCheckbox
	 * @param value
	 */
	public static void clickRadioOrCheckbox(List<WebElement> radioOrCheckbox,String value) {
		
		String actualValue;
		
		for (WebElement el : radioOrCheckbox) {
		  actualValue = el.getAttribute("value").trim();
			if(el.isEnabled() && actualValue.equals(value)) {
				el.click();
				break;
			}
		}
	}
	/**
	 * Method that checks if text is there and selects it 
	 * @param element
	 * @param textToSelect
	 */
	public static void selectDdValue(WebElement element,String textToSelect) {
		try {
		Select select = new Select(element);
		
		List<WebElement> option = select.getOptions();
		
		for (WebElement el : option) {
			if(el.getText().equals(textToSelect)){
				select.selectByVisibleText(textToSelect);
				break;
			}
		}
		
		}catch(UnexpectedTagNameException e) {
			e.printStackTrace();
		}
	}
	
	public static void selectDdValue(WebElement element, int index) {
		
		try {
			Select select = new Select(element);
			int size = select.getOptions().size();
			if(size>index) {
				select.selectByIndex(index);
			}
		}catch(UnexpectedTagNameException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
 }

package com.syntax.utils;

import org.openqa.selenium.WebElement;

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
	
	
	
}

package class2_WebDriver_Commands_and_Locators;

public class TestWebDriver {

	public static void main(String[] args) {

		SWebDriver driver = new SChromeDriver();

		driver.get("https://www.google.com");

		driver.close();

		SWebDriver driver2 = new SFirefoxDriver();

		driver2.get("https://www.google.com");

	}

}

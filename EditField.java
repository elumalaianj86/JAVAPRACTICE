package week2.day2;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditField {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");		
		ChromeDriver driver=new ChromeDriver();
	
	driver.get("http://leafground.com/pages/Edit.html");
	
	driver.manage().window().maximize();
//enter email id
	driver.findElementByXPath("//label[text()='Enter your email address']/following-sibling::input").sendKeys("elumalaianj86@gmail.com");
//enter default text
	driver.findElementByXPath("//label[text()='Append a text and press keyboard tab']/following-sibling::input").sendKeys("elumalai" + Keys.TAB);
// Get default text entered
System.out.println(driver.findElementByXPath("(//input[@name='username'])[1]").getAttribute("value"));	
//Clear the text
driver.findElementByXPath("//input[@value='Clear me!!']").clear();
//Confirm that edit field is disabled
System.out.println(driver.findElementByXPath("//input[@disabled='true']").isEnabled());
driver.close();
	}
}

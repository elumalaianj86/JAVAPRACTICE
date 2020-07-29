package week2.day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");		
		ChromeDriver driver=new ChromeDriver();
	
	driver.get("http://leafground.com/pages/checkbox.html");
	
	driver.manage().window().maximize();
	driver.findElementByXPath("(//label[text()='Select the languages that you know?']/following::input)[1]").click();

	System.out.println(driver.findElementByXPath("//label[text()='Confirm Selenium is checked']/following::input[1]").isSelected());
	
	driver.findElementByXPath("//label[text()='DeSelect only checked']/following::input[2]").click();
	for(int i=1;i<=5;i++) {
driver.findElementByXPath("//label[text()='Select all below checkboxes ']/following::input["+i+"]").click();			
	}
driver.close();	
}
}
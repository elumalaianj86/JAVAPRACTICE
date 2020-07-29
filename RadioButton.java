package week2.day2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");		
		ChromeDriver driver=new ChromeDriver();
	
	driver.get("http://leafground.com/pages/radio.html");
	
	driver.manage().window().maximize();
	//Are you enjoying the classes?
driver.findElementByXPath("//input[@id='yes']").click();
//Find default selected radio button
System.out.println(driver.findElementByXPath("(//input[@name='news'])[2]").isSelected());
//Select your age group (Only if choice wasn't selected)
WebElement radio = driver.findElementByXPath("(//input[@class='myradio'])[4]");
System.out.println(radio.isSelected());
driver.close();
	}

}

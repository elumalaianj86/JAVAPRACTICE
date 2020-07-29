package week2.day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonPage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");		
		ChromeDriver driver=new ChromeDriver();
	
	driver.get("http://leafground.com/pages/Button.html");
	
	driver.manage().window().maximize();
driver.findElementByXPath("(//label[@for='home']/following-sibling::button)").click();
//click Button option
driver.findElementByXPath("(//img[@alt='Buttons']/parent::a)").click(); 
// position of button
System.out.println(driver.findElementByXPath("//button[text()='Get Position']").getLocation());	
// color
System.out.println(driver.findElementByXPath("//button[text()='What color am I?']").getCssValue("background-color"));
//height and width
System.out.println(driver.findElementByXPath("//button[@style='background-color:lightblue']").getSize());
driver.close();
	}
	

}

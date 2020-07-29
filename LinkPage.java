package week2.day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class LinkPage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");		
		ChromeDriver driver=new ChromeDriver();
	
	driver.get("http://leafground.com/pages/Link.html");
	
	driver.manage().window().maximize();
	//go to home page
	driver.findElementByXPath("//a[text()='Go to Home Page']").click();
// click hyperlink
	driver.findElementByXPath("//h5[text()='HyperLink']").click();
// Find where am supposed to go without clicking me?	
System.out.println(driver.findElementByLinkText("Find where am supposed to go without clicking me?").getAttribute("href"));
//Verify am I broken?
driver.findElementByLinkText("Verify am I broken?").click();
if(driver.getTitle().contains("Not Found")) {
System.out.println("page is broken");
}else
	System.out.println("page is not broken");
driver.navigate().back();
System.out.println(driver.findElementsByTagName("a").size());
//driver.close();
	}
}

package week2.day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class FindLeads {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");		
		ChromeDriver driver=new ChromeDriver();
	
	driver.get("http://leaftaps.com/opentaps/control/main");
	
	driver.manage().window().maximize();
	driver.findElementById("username").sendKeys("demosalesmanager");
	driver.findElementById("password").sendKeys("crmsfa");
	driver.findElementByClassName("decorativeSubmit").click();
	driver.findElementByLinkText("CRM/SFA").click();
driver.findElementByLinkText("Leads").click();
//click find leads
driver.findElementByXPath("//a[text()='Find Leads']").click();
//enter first name
driver.findElementByXPath("(//input[@style='width: 212px;'])[2]").sendKeys("elumalai");
// click find lead
driver.findElementByXPath("//button[text()='Find Leads']").click();
Thread.sleep(3000);
// click 1st results
driver.findElementByXPath("(//a[@class='linktext'])[4]").click();
//Verify title of the page
System.out.println(driver.getTitle());	
//Click Edit
driver.findElementByXPath("((//div[@class='frameSectionExtra'])[2]/a)[3]").click();
driver.findElementByXPath("//(a[text()='Edit'])[2]").click();
driver.findElementById("updateLeadForm_companyName").sendKeys("BNY");
driver.findElementByName("submitButton").click();
System.out.println(driver.findElementById("viewLead_companyName_sp").getText());

	
	
	
	}
	

}

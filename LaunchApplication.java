package week2.day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchApplication {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\seleniumweek1\\SeleniumLearning\\driver\\chromedriver.exe");
	
		ChromeDriver driver=new ChromeDriver();
	
	driver.get("http://leaftaps.com/opentaps/control/main");
	
	driver.manage().window().maximize();
		
	//driver.findElementByXPath("//input[@class='inputLogin' and @type='text']").sendKeys("demosalesmanager");	
	driver.findElementByXPath("//input[@class='inputLogin' and @id='password']").sendKeys("crmsfa");
	driver.findElementByXPath("//input[@class='decorativeSubmit' and @type='submit']").click();
	driver.findElementByXPath("//a[@style='color: black;']").click();
driver.findElementByXPath("//a[contains(text(),'Leads')]").click();
driver.findElementByXPath("//a[contains(text(),'Create Lead')]").click();
driver.findElementByXPath("//input[@id='createLeadForm_companyName']").sendKeys("testleaf");
driver.findElementByXPath("//input[@id='createLeadForm_firstName']").sendKeys("elumalai");
driver.findElementByXPath("//input[@id='createLeadForm_lastName']").sendKeys("m s");
driver.findElementByXPath("//select[@id='createLeadForm_dataSourceId']").sendKeys("Employee");
//driver.findElementByXPath("//option[@value='LEAD_EMPLOYEE']").click();
//driver.findElementByXPath("//option[@value='9001']").click();

driver.findElementByXPath("//option[@value='IND_TELECOM']").click();
driver.findElementByXPath("//option[@value='OWN_CCORP']").click();
driver.findElementByXPath("//option[@value='IND']").click();
driver.findElementByXPath("//input[@value='Create Lead']").click();
driver.close();
	
	}

}

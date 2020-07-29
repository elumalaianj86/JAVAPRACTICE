package week2.day2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LauchTestLeaf {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");		
		ChromeDriver driver=new ChromeDriver();
	
	driver.get("http://leaftaps.com/opentaps/control/main");
	
	driver.manage().window().maximize();
	driver.findElementById("username").sendKeys("demosalesmanager");
	driver.findElementById("password").sendKeys("crmsfa");
	driver.findElementByClassName("decorativeSubmit").click();
	driver.findElementByLinkText("CRM/SFA").click();
driver.findElementByLinkText("Leads").click();
driver.findElementByLinkText("Create Lead").click();
driver.findElementByXPath("(//input[@name='companyName'])[2]").sendKeys("testleaf");
driver.findElementByXPath("(//input[@name='firstName' and @id='createLeadForm_firstName'])").sendKeys("Elumalai");
driver.findElementByXPath("(//input[@id='createLeadForm_lastName' or @name='lastName'])[3]").sendKeys("M S");
WebElement source = driver.findElementByName("dataSourceId"); 	
Select src =new Select(source);
src.selectByVisibleText("Employee");
WebElement marketing = driver.findElementById("createLeadForm_marketingCampaignId");
	Select mkt = new Select(marketing);
	mkt.selectByValue("9001");
	WebElement industry = driver.findElementById("createLeadForm_industryEnumId");
	Select ind = new Select(industry);
	ind.selectByValue("IND_TELECOM");
	WebElement ownership = driver.findElementByName("ownershipEnumId");
	Select own = new Select(ownership);
	own.selectByIndex(5);
WebElement country = driver.findElementById("createLeadForm_generalCountryGeoId");
	Select cnt = new Select(country);
	cnt.selectByVisibleText("India");
	driver.findElementByClassName("smallSubmit").click();
	System.out.println(driver.getTitle());
driver.close();
	}
	}

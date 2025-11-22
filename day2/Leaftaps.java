package week2.day2;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Leaftaps {
		ChromeDriver driver=new ChromeDriver();
		public void Login(){
			driver.get("http://leaftaps.com/opentaps");
			driver.manage().window().maximize();
			
			//implicit wait
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			//Login
			driver.findElement(By.id("username")).sendKeys("Test");
			driver.findElement(By.id("password")).sendKeys("Test123");
			driver.findElement(By.className("decorativeSubmit")).click();
							
		}
			public void CreateAccount() {
			//Click on SRM/SFA link
					driver.findElement(By.linkText("CRM/SFA")).click();
					driver.findElement(By.linkText("Accounts")).click();
					driver.findElement(By.linkText("Create Account")).click();
					WebElement Accname=driver.findElement(By.id("accountName"));
							Accname.sendKeys("Test Account");
					driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
					
					//Industry dropdown
					Select dropdown=new Select(driver.findElement(By.name("industryEnumId")));
					dropdown.selectByValue("IND_SOFTWARE");
					
					//Ownership dropdown
					Select ownership=new Select(driver.findElement(By.className("inputBox")));
					ownership.selectByVisibleText("S-Corporation");
					
					//Emp
					Select emp=new Select(driver.findElement(By.id("dataSourceId")));
	                   emp.selectByValue("LEAD_EMPLOYEE");
	                   
	                //Campaign
	                  Select camp=new Select(driver.findElement(By.id("marketingCampaignId")));
	                  camp.selectByIndex(5);
	                  
	                  //state/province
	                  Select state=new Select(driver.findElement(By.id("generalStateProvinceGeoId\"")));
	                  state.selectByValue("TX");
	                  
	                  //Create account
	                  driver.findElement(By.className("smallSubmit")).click();
	                  
	                  
	                  //Checking the account name
	                  WebElement Accountname = driver.findElement(By.className("tabletext"));
	                  String Name = Accountname.getText();
	                  if(Name.contains(Accname.getText())){
	                	 System.out.println("Account name is correct");
	                	  driver.close();
	                  }
	                   
		}
			public static void main(String[] args) {
	       Leaftaps run=new Leaftaps();
	       run.Login();
	       run.CreateAccount();
	       }
}


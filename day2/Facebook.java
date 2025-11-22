package week2.day2;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Facebook {
ChromeDriver driver=new ChromeDriver();

	
	public void launch() {
		//LAunching the URL
		
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	public void createNewAccount() {
		driver.findElement(By.linkText("Create new account")).click();
		//First,surname and mobile
		driver.findElement(By.name("firstname")).sendKeys("Hema");
		driver.findElement(By.name("lastname")).sendKeys("Ramesh");
		driver.findElement(By.name("reg_email__")).sendKeys("Test@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Test@123");
      
		//DOB dropdown
		Select DOB=new Select(driver.findElement(By.id("day")));
		DOB.selectByValue("25");
		Select Month=new Select(driver.findElement(By.id("month")));
		Month.selectByIndex(4);
		Select Year=new Select(driver.findElement(By.id("year")));
		Year.selectByValue("2015");
		
		//Radio button
		driver.findElement(By.id("sex")).click();
		
		//Signup
		driver.findElement(By.name("websubmit")).click();
		
	}
	
	public void close() {
		driver.close();
	}
	public static void main(String[] args) {
       Facebook load=new Facebook();
       load.launch();
       load.createNewAccount();
       load.close();
	}

}


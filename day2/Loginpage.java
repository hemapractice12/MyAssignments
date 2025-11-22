package week2.day2;
		import org.openqa.selenium.By;
		import org.openqa.selenium.chrome.ChromeDriver;
		public class Loginpage {
			public static void main(String[] args) {
				//Launch the browser
				ChromeDriver driver=new ChromeDriver();
				
				//Load the URL
				driver.get("https://www.facebook.com");
				//maximize the window
				driver.manage().window().maximize();
				//Entering user name
				driver.findElement(By.id("email")).sendKeys("Test@gmail.com");
				//Entering Password
				driver.findElement(By.id("pass")).sendKeys("Test@123");
				//Login
				driver.findElement(By.name("login")).click();
				

			}
		}



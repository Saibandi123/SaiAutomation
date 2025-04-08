package Default;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xalts2 {

	public static void main(String[] args) throws InterruptedException {
		//Failure Scenarios
		System.setProperty("webdriver.chrome.driver", "D:/Automation/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://xaltsocnportal.web.app/signin");
		driver.findElement(By.xpath("//button[text()='Already have an account? Click here to sign in.']")).click();
		String s="Veeranna@896";
		driver.findElement(By.id("outlined-basic")).sendKeys("saigowtham.bandi999@gmail.com");
		driver.findElement(By.xpath("(//input[@id='outlined-basic'])[2]")).sendKeys(s);
		driver.findElement(By.xpath("//button[text()='Sign In']")).click();
		Thread.sleep(2000);
		System.out.println(driver.switchTo().alert().getText());
        Thread.sleep(2000);
		driver.switchTo().alert().accept();
		 Thread.sleep(2000);
	    driver.navigate().refresh();
	    driver.findElement(By.xpath("//button[text()='Already have an account? Click here to sign in.']")).click();
		driver.findElement(By.id("outlined-basic")).sendKeys("saigowtham.bandi143@gmail.com");
		driver.findElement(By.xpath("(//input[@id='outlined-basic'])[2]")).sendKeys("Veeranna@143");
		driver.findElement(By.xpath("//button[text()='Sign In']")).click();
		Thread.sleep(2000);
		System.out.println(driver.switchTo().alert().getText());
		
		
		

	}

}

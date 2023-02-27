import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsIntro {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("bhargavi");
		driver.findElement(By.name("inputPassword")).sendKeys("Nirvi@123");
		driver.findElement(By.className("signInBtn")).click();
		
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		//<input type="text" placeholder="Name">
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("bhargavi");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("bhargavi");
	    driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
	    driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("reemter");
	    driver.findElement((By.xpath("//form/input[3]"))).sendKeys("90202");
	    //<button class="reset-pwd-btn">Reset Login</button>
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
	    System.out.println(driver.findElement(By.cssSelector("form p")).getText());
	    driver.findElement(By.cssSelector("button[class*='go']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector("input#inputUsername")).sendKeys("bhargavi");
	    driver.findElement(By.xpath("//input[contains(@name,'inputPassword')]")).sendKeys("rahulshettyacademy");
	    driver.findElement(By.xpath("//div[@class='checkbox-container']/span/input[@id='chkboxOne']")).click();
	    driver.findElement(By.cssSelector("form div button")).click();
				
	}
	

}

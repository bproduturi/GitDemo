import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestivedropdownexample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.cssSelector("input#autocomplete")).sendKeys("ind");
		Thread.sleep(2000);
	
		driver.findElement(By.cssSelector("input#autocomplete")).sendKeys(Keys.DOWN);
		driver.findElement(By.cssSelector("input#autocomplete")).sendKeys(Keys.DOWN);
		System.out.println(driver.findElement(By.cssSelector("input#autocomplete")).getAttribute("value"));
		
			}

}

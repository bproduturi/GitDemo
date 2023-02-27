import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		driver.findElement(By.xpath("//label[@class='customradio'][2]")).click();
		WebDriverWait w=new WebDriverWait(driver,Duration.ofMillis(7000));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
				//invisibilityOfElementLocated(By.cssSelector("button#okayBtn")));
				//elementToBeClickable(By.cssSelector("button#okayBtn")));
		driver.findElement(By.cssSelector("button#okayBtn")).click();
		WebElement dropdown=driver.findElement(By.cssSelector("select.form-control"));
 Select options=new Select(dropdown);
 options.selectByVisibleText("Consultant");
// options.selectByValue("Teacher");
 driver.findElement(By.id("signInBtn")).click();
 
 w.until((ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Checkout"))));
List<WebElement> products= driver.findElements(By.cssSelector("button[class='btn btn-info']"));
for (int i=0;i<products.size();i++)
{
	products.get(i).click();
	
}
	}

}

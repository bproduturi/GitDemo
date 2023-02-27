import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Calendardayselection {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companion/");
		driver.manage().window().maximize();
		//JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("window.scrollBy(0,800)");
//Thread.sleep(10000);
	//WebDriverWait w=new WebDriverWait(driver,Durationofseconds(30));
		//w.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[id='form-field-travel_comp_date']")));
	driver.findElement(By.cssSelector("input[id='form-field-travel_comp_date']")).click();
		while(!driver.findElement(By.cssSelector("div[class='flatpickr-current-month']")).getText().contains("April"))
		{
			driver.findElement(By.cssSelector("span[class='flatpickr-next-month']")).click();
		}
			driver.findElement(By.cssSelector("input[id='form-field-travel_comp_date']")).click();

		
		List<WebElement> datetobeselected=driver.findElements(By.cssSelector("span[class*='day']"));
   for(int i=0;i<datetobeselected.size();i++)
   {
	   String datereq=datetobeselected.get(i).getText();
	   if(datereq=="23")
	   {
		   datetobeselected.get(i).click();
	   }
   }
	}

	private static Duration Durationofseconds(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}

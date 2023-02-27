import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class DynamicDropdowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//<div class="css-1dbjc4n r-1awozwy r-1loqt21 r-18u37iz r-117bsoe r-1otgn73" data-focusable="true" tabindex="0" data-testid="round-trip-radio-button" style="margin-right: 20px;"><div class="css-1dbjc4n r-zso239"><svg data-testid="svg-img" viewBox="0 0 18 18" width="18" height="18" fill="#000" color="#000" preserveAspectRatio="none"><g fill="none" fill-rule="evenodd"><circle cx="9" cy="9" r="8" fill="#FFF" stroke="#F7941D" stroke-width="2"></circle><circle cx="9" cy="9" r="4" fill="#EDB16A"></circle></g></svg></div><div class="css-1dbjc4n"><div class="css-76zvg2 r-homxoj r-ubezar r-1ozqkpa" dir="auto" style="font-family: inherit;">round trip</div></div></div>
		//System.out.println(driver.findElement(By.cssSelector("div[data-testid='return-date-dropdown-label-test-id']")).isEnabled());
		System.out.println(driver.findElement(By.cssSelector("div[data-testid='return-date-dropdown-label-test-id']")).getAttribute("style"));
		driver.findElement(By.cssSelector("div[data-testid='round-trip-radio-button']" )).click();
		System.out.println(driver.findElement(By.cssSelector("div[data-testid='return-date-dropdown-label-test-id']")).getAttribute("style"));
		if (driver.findElement(By.cssSelector("div[data-testid='return-date-dropdown-label-test-id']")).getAttribute("style").contains("background-color"))
		{
			System.out.println("Its disabled");
			Assert.assertTrue(false);
		}
		else
		{
			System.out.println("It's enabled");
			Assert.assertTrue(true);
		}
		driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'AMD')]")).click();
		driver.findElement(By.xpath("//div[contains(text(),'DEL')]")).click();
		//<div class="css-1dbjc4n r-1awozwy r-16ru68a r-y47klf r-1loqt21 r-eu3ka r-1otgn73 r-1aockid" data-focusable="true" tabindex="0" data-testid="undefined-calendar-day-7"><div class="css-1dbjc4n r-1awozwy r-19m6qjp r-156aje7 r-y47klf r-1phboty r-1d6rzhh r-1pi2tsx r-1777fci r-13qz1uu"><div class="css-76zvg2 r-jwli3a r-ubezar r-16dba41" dir="auto" style="font-family: inherit;">7</div></div></div>
		driver.findElement(By.cssSelector("div[class=\"css-76zvg2 r-jwli3a r-ubezar r-16dba41\"]")).click();
		
	}

}

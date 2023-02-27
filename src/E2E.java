import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class E2E {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		//Thread.sleep(2000);

		driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']")).click();
		Thread.sleep(2000);
		// driver.findElement(By.cssSelector("div[data-testid='one-way-radio-button']")).click();
		driver.findElement(By.xpath("//div[contains(text(),'AMD')]")).click();
		driver.findElement(By.xpath("//div[contains(text(),'DEL')]")).click();
		// <div class="css-1dbjc4n r-1awozwy r-16ru68a r-y47klf r-1loqt21 r-eu3ka
		// r-1otgn73 r-1aockid" data-focusable="true" tabindex="0"
		// data-testid="undefined-calendar-day-7"><div class="css-1dbjc4n r-1awozwy
		// r-19m6qjp r-156aje7 r-y47klf r-1phboty r-1d6rzhh r-1pi2tsx r-1777fci
		// r-13qz1uu"><div class="css-76zvg2 r-jwli3a r-ubezar r-16dba41" dir="auto"
		// style="font-family: inherit;">7</div></div></div>
		driver.findElement(By.cssSelector("div[class=\"css-76zvg2 r-jwli3a r-ubezar r-16dba41\"]")).click();
		System.out.println(driver.findElement(By.cssSelector("div[data-testid='return-date-dropdown-label-test-id']"))
				.getAttribute("style"));
		// driver.findElement(By.cssSelector("div[data-testid='round-trip-radio-button']"
		// )).click();
		System.out.println(driver.findElement(By.cssSelector("div[data-testid='return-date-dropdown-label-test-id']"))
				.getAttribute("style"));
		if (driver.findElement(By.cssSelector("div[data-testid='return-date-dropdown-label-test-id']"))
				.getAttribute("style").contains("background-color")) {
			System.out.println("Its disabled");
			Assert.assertTrue(true);
		} else {
			System.out.println("It's enabled");
			Assert.assertTrue(false);
		}

		// <div class="css-1dbjc4n r-1awozwy r-z2wwpe r-1loqt21 r-18u37iz r-1777fci
		// r-1g94qm0 r-d9fdf6 r-1w50u8q r-ah5dr5 r-1otgn73" data-focusable="true"
		// tabindex="0" data-testid="home-page-flight-cta" style="background-image:
		// linear-gradient(rgb(252, 182, 62), rgb(247, 148, 29)); margin-left: 12px;
		// width: 162px;"><div class="css-76zvg2 r-jwli3a r-1b6yd1w r-1kfrs79"
		// dir="auto" style="font-family: inherit;">Search Flight</div><div
		// class="css-1dbjc4n r-1niwhzg r-1p0dtai r-1d2f490 r-1udh08x r-u8s1d r-zchlnj
		// r-ipm5af" style="border-radius:
		// 0px;"></div></div>driver.findElement(By.cssSelector("div[data-testid='home-page-flight-cta']")).click();
	}

}

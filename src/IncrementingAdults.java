import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IncrementingAdults {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		System.out.println(driver.findElement(By.cssSelector("div[class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep']")).getText());
		
		driver.findElement(By.cssSelector("div[class='css-1dbjc4n r-18u37iz r-19h5ruw r-184en5c']")).click();
		
		//class="r-1awozwy r-19m6qjp r-y47klf r-1loqt21 r-eu3ka r-1777fci r-1otgn73 r-1i6wzkk r-lrvibr r-1aockid css-1dbjc4n"
		
		int i=1;
		while(i<5)
		{
			driver.findElement(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']")).click();
			i++;
			//System.out.println(driver.findElement(By.cssSelector("div[class='css-1dbjc4n r-18u37iz r-19h5ruw r-184en5c']")).getText());
		}
		
		//System.out.println(driver.findElement(By.cssSelector("div[class='css-1dbjc4n r-18u37iz r-19h5ruw r-184en5c']")).getText());

	}

}

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Invokebrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webrdiver.chrome.driver", "C:\\Users\\sgopa\\eclipse-workspace\\SeleniumIntro\\chromedriver.exe");

		//ChromeDriver d=new ChromeDriver();
		
	/*	WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//driver.close();
		driver.quit();'*/
		
		
		//Firefox launch
	//	System.setProperty("webrdiver.gecko.driver", "C:\\Users\\sgopa\\eclipse-workspace\\SeleniumIntro\\geckodriver.exe");
		//WebDriver driver1= new FirefoxDriver();
		
		//EdgeLaunch

		System.setProperty("webrdiver.edge.driver", "C:\\Users\\sgopa\\eclipse-workspace\\SeleniumIntro\\msedgedriver.exe");
			WebDriver driver2= new EdgeDriver();
			driver2.get("https://rahulshettyacademy.com/");
			driver2.getPageSource();

	}

}

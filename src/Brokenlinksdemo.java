import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;



public class Brokenlinksdemo {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
 WebDriver driver=new ChromeDriver();
 driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
 //String url=driver.findElement(By.cssSelector("a[href*='soapui']")).getAttribute("href");
 //System.out.println(url);
 SoftAssert s=new SoftAssert();
 List<WebElement> links= driver.findElements(By.cssSelector("li[class='gf-li']"));
 for(WebElement link:links) {
	 String url=link.getAttribute("href");
	  HttpURLConnection conn=(HttpURLConnection)new URL(url).openConnection();
	  conn.setRequestMethod("HEAD");
	  conn.connect();
	  int respinsecode=conn.getResponseCode();
	  System.out.println(respinsecode);
	  s.assertTrue(respinsecode<400, "get me text of not working url"+link.getText());
	
	 
 }
 s.assertAll();

	}

}

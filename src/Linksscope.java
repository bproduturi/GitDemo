import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linksscope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	WebDriver driver=new ChromeDriver();
	driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
	System.out.println(driver.findElements(By.tagName("a")).size());
	WebElement footer=driver.findElement(By.cssSelector("div[id='gf-BIG'] table"));
	System.out.println(footer.findElements(By.tagName("a")).size());
	WebElement coloumn=footer.findElement(By.xpath("//ul"));
	System.out.println(coloumn.findElements(By.tagName("a")).size());
	for(int i=1;i<coloumn.findElements(By.tagName("a")).size();i++)
	{
		String newtab=Keys.chord(Keys.CONTROL,Keys.ENTER);
		coloumn.findElements(By.tagName("a")).get(i).sendKeys(newtab);
		Thread.sleep(5000);
					
		}
	Set<String> abc=driver.getWindowHandles();
	Iterator<String> it=abc.iterator();
	while(it.hasNext()) {
		
		
		driver.switchTo().window(it.next());
		
		System.out.println(driver.getTitle());
	}
	
	
	}

}

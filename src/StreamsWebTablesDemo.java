import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class StreamsWebTablesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.xpath("//tr/th[1]")).click();
		
		/*List<String> originallist=list.stream().map(s->s.getText()).collect(Collectors.toList());
		List<String> sorted=originallist.stream().sorted().collect(Collectors.toList());
		Assert.assertTrue(originallist.equals(sorted));*/
		List<String> price;
		
		do {
			List<WebElement> list=driver.findElements(By.xpath("//tr/td[1]"));
			 price=list.stream().filter(s->s.getText().contains("Rice")).map(s->getveggieprice(s)).collect(Collectors.toList());
			price.forEach(a->System.out.println(a));
			
		
		if(price.size()<1) {
			
			driver.findElement(By.cssSelector("a[aria-label='Next']")).click();
		}}while(price.size()<1);
	}

	public static String  getveggieprice(WebElement s)
			{
				String price=s.findElement(By.xpath("following-sibling::td[1]")).getText();
				return price;
			
				
			}

	}



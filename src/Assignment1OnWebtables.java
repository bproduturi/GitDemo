import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1OnWebtables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		//driver.findElements(By.cssSelector("table[name='courses'] tbody tr")).size();
		System.out.println(driver.findElements(By.cssSelector("table[name='courses'] tbody tr")).size());
		System.out.println(driver.findElements(By.xpath("//table[@name='courses'] /tbody/tr/th")).size());
		List<WebElement> rows=driver.findElements(By.cssSelector("table[name='courses'] tbody tr"));
		for(int i=0;i<rows.size();i++)
		{
			String ab=rows.get(i).getText();
			if(ab.contains("Rahul Shetty Learn SQL in Practical "))
			{
				System.out.println(ab);
			}
			
		}
		
		//System.out.println(driver.findElement(By.xpath("//table[@name='courses'] /tbody/tr[3]")).getText());
		
		}
        
	}



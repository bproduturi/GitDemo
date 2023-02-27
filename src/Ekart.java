import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ekart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] listOfProducts= {"Cucumber","Brocolli"};
		
		WebDriver driver=new ChromeDriver();
		WebDriverWait W=new WebDriverWait(driver,Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		//Implicitwait//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));
		//int i=0;
		addToCart(driver,listOfProducts);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		W.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy.com");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		W.until(ExpectedConditions.visibilityOfElementLocated(By.className("promoInfo")));
		W.until(ExpectedConditions.
		System.out.println(driver.findElement(By.className("promoInfo")).getText());
		
		
			}
	public static void addToCart(WebDriver driver,String[] listOfProducts) {
		List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));
		//int i=0;
		List<String> listOfProductsNeeded=Arrays.asList(listOfProducts);
		int j=0;
		for(int i=0;i<products.size();i++)
		{
			String[] name=products.get(i).getText().split("-");
			String formattedNme=name[0].trim();
			if(listOfProductsNeeded.contains(formattedNme))
			{
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				//.click();
			if(j==listOfProductsNeeded.size()) {
				break;
			}
				}
		}
		
	}
}

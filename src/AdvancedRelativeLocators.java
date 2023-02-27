import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static
org.openqa.selenium.support.locators.RelativeLocator.*;

public class AdvancedRelativeLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		WebElement Name=driver.findElement(By.name("name"));
		System.out.println(driver.findElement(with(By.tagName("label")).above(Name)).getText());
		System.out.println(driver.findElement(with(By.tagName("label")).below(By.cssSelector("label[for='exampleInputPassword1']"))).getText());
	}

}

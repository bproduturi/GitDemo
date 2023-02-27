import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutosuggestiveDropdowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	
	//<input type="text" id="autosuggest" class="inputs ui-autocomplete-input" placeholder="Type to Select" autocomplete="off">
	driver.findElement(By.id("autosuggest")).sendKeys("Ind");
	Thread.sleep(3000);
	
	List<WebElement> options=driver.findElements(By.cssSelector("li[class='ui-menu-item']"));

for (WebElement s:options) {
	
	if(s.getText().equalsIgnoreCase("India")){
	
		s.click();
		break;
	}
}
	}

}

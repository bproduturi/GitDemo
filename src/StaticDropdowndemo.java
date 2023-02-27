import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdowndemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		WebElement Staticdropdown= driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select object1=new Select(Staticdropdown);
		object1.selectByIndex(2);
		System.out.println(object1.getFirstSelectedOption().getText());
		object1.selectByValue("INR");
		System.out.println(object1.getFirstSelectedOption().getText());
		//System.out.println(object1.getAllSelectedOptions().get(1));
		
		//

	}

}

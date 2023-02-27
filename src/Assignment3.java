import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assignment3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		//driver.findElement(By.id("checkBoxOption2")).click();
		driver.findElement(By.xpath("//div[@id='checkbox-example']/fieldset/label[@for='benz']")).click();
		//WebElement selection=
		String option=driver.findElement(By.xpath("//div[@id='checkbox-example']/fieldset/label[@for='benz']")).getText();
		System.out.println(option);
		
	driver.findElement(By.id("dropdown-class-example")).click();
		WebElement dropdown1=driver.findElement(By.id("dropdown-class-example"));
		Select dropdown=new Select(dropdown1);
		Thread.sleep(1000);
		dropdown.selectByVisibleText(option);
		driver.findElement(By.cssSelector("input[id='name']")).sendKeys(option);
		driver.findElement(By.cssSelector("input[id='alertbtn']")).click();
		driver.switchTo().alert().getText();
		String alerttext=driver.switchTo().alert().getText();
		System.out.println(alerttext);
		String alerttext1=alerttext.split(",")[0].split(" ")[1];
		System.out.println(alerttext1);
		//Assert.assertEquals(option, alerttext1);
		if(alerttext.contains(option))
		{
			System.out.println("contains option2");
			
		}
		else
		{
			System.out.println("doesnt contains option2");
		}
		
	}

}

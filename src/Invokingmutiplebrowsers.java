import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Invokingmutiplebrowsers {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//switching window
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.switchTo().newWindow(WindowType.TAB);
		Set<String> windows=driver.getWindowHandles();
		Iterator<String> it=windows.iterator();
		String parentwindow=it.next();
		String childwindow=it.next();
		driver.switchTo().window(childwindow);
		driver.get("https://rahulshettyacademy.com/");
		String coursename=driver.findElements(By.cssSelector("div[class='upper-box'] h2")).get(1).getText();
		driver.switchTo().window(parentwindow);
		//driver.findElement(By.cssSelector("input[name='name']").sendKeys(coursename);
		WebElement name=driver.findElement(By.cssSelector("input[name='name']"));
		name.sendKeys(coursename);
		//screenshot
		File s=name.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(s, new File("C:\\Users\\sgopa\\s.png"));
		//height and width
		name.getRect().getDimension().getHeight();
		name.getRect().getDimension().getWidth();
		
		
		
		

	}

}

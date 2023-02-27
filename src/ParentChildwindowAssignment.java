import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParentChildwindowAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[text()='Multiple Windows']")).click();
		driver.findElement(By.xpath("//a[@href='/windows/new']")).click();
		Set<String> windows=driver.getWindowHandles();
		Iterator<String> it=windows.iterator();
	String parentwindows=it.next();
	String Childwindow=it.next();
	driver.switchTo().window(Childwindow);
	String one=driver.findElement(By.cssSelector("div[class='example'] h3")).getText().split(" ")[0];
	String two=driver.findElement(By.cssSelector("div[class='example'] h3")).getText().split(" ")[1].split(" ")[0];
	String value=one+" "+two;
	System.out.println(value);
	driver.switchTo().window(parentwindows);
	
	String[] valueinparentwindow=driver.findElement(By.xpath("//div[@class='example']/h3")).getText().split(" ");
	
	System.out.println(	valueinparentwindow[0]+" "+valueinparentwindow[1]+" "+valueinparentwindow[2]+" "+valueinparentwindow[3].trim());



}}
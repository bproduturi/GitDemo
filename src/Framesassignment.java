import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Framesassignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		Actions a=new Actions(driver);
		driver.switchTo().frame("frame-top");
		driver.switchTo().frame(driver.findElement(By.cssSelector("frame[src='/frame_middle']")));
		System.out.println(driver.findElement(By.cssSelector("div[id='content']")).getText());
		

	}

}

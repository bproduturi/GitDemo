import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Chromeoptionsdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options=new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		Proxy proxy=new Proxy();
		proxy.setHttpProxy("IPaddress:3323");
		options.setCapability("proxy", proxy);
		options.addEncodedExtensions("");
		
		
		WebDriver driver=new ChromeDriver(options);

	}

}

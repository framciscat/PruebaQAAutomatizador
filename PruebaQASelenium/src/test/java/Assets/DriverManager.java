package Assets;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManager {
	
	public static WebDriver open(String browserType) {
		if (browserType.equals("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			System.out.println("Está usando el navegador Firefox");
			return new FirefoxDriver();
		}
		else if(browserType.equals("Edge")) {
			WebDriverManager.edgedriver();
			System.out.println("Está usando el navegador Edge");
			return new EdgeDriver();	
		}
		else if(browserType.equals("Chrome")) {
			WebDriverManager.chromedriver();
			System.out.println("Está usando el navegador Chrome");
			return new ChromeDriver();
		} else {
			throw new IllegalArgumentException("Error en el navegador");
		}
			
	}
}
	


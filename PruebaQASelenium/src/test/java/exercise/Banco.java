package exercise;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Banco {

	String browser = "Chrome";
	WebDriver driver;
	String url = "http://www.bcentral.cl";

	@Given("^The browser is open$")
	public void openBrowser() {
		driver = Assets.DriverManager.open(browser);
	}

	@When("^I type the url of Banco Central web page$")
	public void getURL() {
		driver.get(url);

	}

	@And("^I get data from h1 tags$")
	public void h1Elements() {
		List<WebElement> h1Tags = driver.findElements(By.tagName("h1"));
		for (WebElement tags : h1Tags) {
			System.out.println("Texto obtenido de etiquetas <h1>: " + tags.getText());
		}
		int numberH1Tags = h1Tags.size();
		System.out.println("El número de etiquetas <h1> es: " + numberH1Tags);
	}

	@And("^I get data from p tags$")
	public void pElements() {
		List<WebElement> pTags = driver.findElements(By.tagName("p"));
		int numberPTags = pTags.size();
		System.out.println("El número de etiquetas <p> es: " + numberPTags);
	}

	@And("^I get site title from main page$")
	public void getTitle() {
		String actualTitle = driver.getTitle();
		if (actualTitle.equals("Inicio - Banco Central de Chile")) {
			System.out.println("¡Título correcto!");
		} else {
			System.out.println("Error en el título");
		}
	}

	@Then("^I can see the currency values of main page$")
	public void currencyValue() {
		String UFValue = driver.findElement(By.xpath(
				"//*[@id=\"_BcentralIndicadoresViewer_INSTANCE_pLcePZ0Eybi8_myTooltipDelegate\"]/div/div/div[1]/div/div/div[1]/div/p[2]"))
				.getText();
		String UTMValue = driver.findElement(By.xpath(
				"//*[@id=\"_BcentralIndicadoresViewer_INSTANCE_pLcePZ0Eybi8_myTooltipDelegate\"]/div/div/div[1]/div/div/div[2]/div/p[2]"))
				.getText();
		String DolarValue = driver.findElement(By.xpath(
				"//*[@id=\"_BcentralIndicadoresViewer_INSTANCE_pLcePZ0Eybi8_myTooltipDelegate\"]/div/div/div[1]/div/div/div[3]/div/p[2]"))
				.getText();
		String EuroValue = driver.findElement(By.xpath(
				"//*[@id=\"_BcentralIndicadoresViewer_INSTANCE_pLcePZ0Eybi8_myTooltipDelegate\"]/div/div/div[1]/div/div/div[4]/div/p[2]"))
				.getText();

		System.out.println("El valor actual de la UF es: " + UFValue);
		System.out.println("El valor actual de la UTM es: " + UTMValue);
		System.out.println("El valor actual del dólar es: " + DolarValue);
		System.out.println("El valor actual del Euro es: " + EuroValue);
	}

}
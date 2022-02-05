package d04_02_2022;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/*
 * 1.Zadatak
Napisti TestNg test koji:
Ucitava stranicu https://www.udemy.com/
U delu za pretragu ukucajte tekst “Selenium” i lupite enter
Sortirajte rezultate pretrage prema rejtingu (Highest Rated)
Dohvatite rejting prvog rezultata pretrage
Dohvatite rejting zadnjeg rezultata pretrage (HELP: trebace vam getText metoda)
	[HELP] Dohvatite rejting kao listu  pa iz liste izvucite prvi i zadnji element.
	//*[@data-purpose=\"rating-number\"]
Proverite da li je reting prvog veci od rejtinga zadnjeg rezultata
pretvaranje stringa u double link ce vam trebati za ovaj zadatak


Umesto prvog za Udemy imamo kupujem prodajem.
Ucitajte stranicu (ako treba gasite onaj dijalog sto iskace)
Ukucajte za pretragu iphone
postavice za valutu eure
Sortirajte prema ceni da bude najjefinije prvo
Onda izvrsite proveru sortiranja kao sto je bilo za udemy

 */

public class Zadatak1 {

	private WebDriver driver;
	private Actions actions;

	@BeforeMethod
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		driver = new ChromeDriver();
		actions = new Actions(driver);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}

	@Test
	public void KP() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		driver.get("https://www.kupujemprodajem.com/");

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class = 'kpBoxCloseButton']"))).click();

		driver.findElement(By.xpath("//*[@id = 'searchKeywordsInput']")).sendKeys("Iphone");
		driver.findElement(By.xpath("//*[@id = 'searchKeywordsInput']")).sendKeys(Keys.ENTER);

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id = 'priceSecondSelection']"))).click();

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@value = 'eur']"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id = 'orderSecondSelection']"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-text = 'Jeftinije']"))).click();

		driver.findElement(By.xpath("//*[@id = 'searchKeywordsInput']")).sendKeys(Keys.ENTER);

		List<WebElement> lista = driver.findElements(By.xpath("//*[@class = 'priceSec']/span"));

		ArrayList<Double> listaCenovnik = new ArrayList<Double>();

		for (int i = 0; i < lista.size(); i++) {

			String[] parts = lista.get(i).getText().split(" ");
			String part1 = parts[0];
			String part2 = parts[1];

			part1 = part1.replace(',', '.');
			double doublePart1 = Double.valueOf(part1);

			if (part2.equals("€")) {
				doublePart1 = doublePart1 * 118;
			}

			listaCenovnik.add(doublePart1);
		}

		for (int i = 1; i < listaCenovnik.size() - 1; i++) {

			if (listaCenovnik.get(i) >= listaCenovnik.get(i - 1) && listaCenovnik.get(i) <= listaCenovnik.get(i + 1)) {

			} else {
				System.out.println("GRESKA !!!!");
			}

		}

	}

}

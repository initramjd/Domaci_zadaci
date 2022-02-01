package d31_01_2022;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadatak1_1 {

	public static void main(String[] args) {
		
		
		/*
		 * Napisati program koji:
Ucitava stranicu https://s.bootsnipp.com/iframe/Dq2X
Klikce na svaki iks da ugasi obavestenje i proverava da li se nakon klika element obrisao sa stranice i ispisuje odgovarajuce poruke (OVO JE POTREBNO RESITI KORISCENJEM PETLJE)
POMOC: Brisite elemente odozdo.
(ZA VEZBANJE)Probajte da resite da se elemementi brisu i odozgo

		 */

		System.setProperty("webdriver.chrome.driver", "driver-lib/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://s.bootsnipp.com/iframe/Dq2X");

		List<WebElement> links = driver.findElements(By.xpath("//*[@class = 'close']"));

		boolean elementPostoji;
		
		for (int i = 0; i < links.size(); i++) {
		
			links.get(i).click();

			List<WebElement> links1 = driver.findElements(By.xpath("//*[@class = 'col-md-12']/div"));
			
			if (links1.size() >= links.size()-i) {
				elementPostoji = true;
			} else {
				elementPostoji = false;
			}

			if (elementPostoji) {
				System.out.println("ELEMENT JE TU, GRESKA");
			} else {
				System.out.println("ELEMENT " + (i+1) + " JE OBRISAN");
			}

		}

	}

}

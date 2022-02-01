package d28_01_2022;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadatak1 {

	public static void main(String[] args) {
		/**
		 * Zadatak Maksimizirati prozor Ucitati stranicu
		 * https://s.bootsnipp.com/iframe/WaXlr Od korisnika ucitati broj na koju
		 * zvezdicu je potrebno kliknuti (u rasponu od 1 do 5) I izvrsite akciju klik na
		 * odgovarajuci element Na kraju programa ugasite pretrazivac.
		 */

		Scanner s = new Scanner(System.in);

		System.setProperty("webdriver.chrome.driver", "driver-lib/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://s.bootsnipp.com/iframe/WaXlr");

		System.out.println("Unesti broj ( 1 - 5 ) koliko zvezdica zelite da date: ");
		int brZ = s.nextInt();

		driver.findElement(By.id("rating-star-" + brZ)).click();
		
		driver.close();
	}

}

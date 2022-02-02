package d01_02_2022;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Zadatak1 {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * Napisati program koji : Ucitava stranicu
		 * https://www.udemy.com/courses/search/?src=ukw&q=slksd Klikce na dugme za
		 * jezik i proverava da li se prikazuje dijalog za promenu jezika Stampa u
		 * konzoli tekst “Dijalog se prikazao”
		 */


		System.setProperty("webdriver.chrome.driver", "driver-lib/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		driver.get("https://www.udemy.com/courses/search/?src=ukw&q=slksd");

		wait.until(ExpectedConditions.elementToBeClickable(By.className("language-selector-button--button--1wgoL")));

		driver.findElement(By.xpath(
				"//*[contains (@class, 'udlite-btn udlite-btn-medium udlite-btn-white-outline udlite-text-md language-selector-button--button--1wgoL')]"))
				.click();

		wait.until(ExpectedConditions.attributeContains(By.className("udemy"), "style", "overflow: hidden;"));
		
		System.out.println("Dijalog se prikazao");

	}

}

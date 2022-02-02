package d01_02_2022;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Zadatak3 {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * Napisti program koji: Ucitava stranicu https://videojs.com/city Pusta video
		 * klikom na play dugme Cekamo da se video ucita Tako sto proveravamo da li vise
		 * to play dugme nije vidljivo
		 * 
		 * Probajte da napisete dopunite koji ceka da se zavrsi video i ispisuje u
		 * konzoli. Video je gotov.
		 * 
		 */

		System.setProperty("webdriver.chrome.driver", "driver-lib/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		driver.get("https://videojs.com/city");

		wait.until(ExpectedConditions.elementToBeClickable(By.className("vjs-big-play-button")));

		driver.findElement(By.xpath("//*[contains (@class, 'vjs-big-play-button')]")).click();

		WebElement btPlay = driver.findElement(By.xpath("//*[contains (@class, 'vjs-big-play-button')]"));

		wait.until(ExpectedConditions.invisibilityOf(btPlay));
		System.out.println("Video se reprodukuje !!!");

		wait.until(ExpectedConditions.attributeContains(By.className("vjs-play-control"), "title", "Replay"));
		System.out.println("Kraj Videa !!!");

	}

}

package d03_02_2022;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Zadatak2 {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * Napisati program koji: Ucitava stanicu https://www.wikipedia.org/ Sa stranice
		 * sakuplja sve linkove (jezike) i svaki link otvara u novom prozoru
		 * pretrazivaca Svaki link potrebno je otvoriti u novom tabu. Skripta:
		 * window.open(arguments[0]);
		 * 
		 */

		System.setProperty("webdriver.chrome.driver", "driver-lib/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;

		driver.manage().window().maximize();
		driver.get("https://www.wikipedia.org/");

		List<WebElement> langs = driver.findElements(By.xpath("//*[@class = 'central-featured']/div/a"));

		for (int i = 0; i < langs.size(); i++) {
			js.executeScript("window.open(arguments[0])", langs.get(i));
		}

	}

}

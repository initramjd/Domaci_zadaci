package d03_02_2022;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Zadatak1 {

	public static void main(String[] args) {
		/*
		 * Napisati program koji:
Ucitava stranicu https://www.google.com/
Hvata body element sa stranicu i njemu setuje atribut 
style na vrednost “background: nekaBoja”
Skripta: arguments[0].style=”background: black”;
(Za vezbanje) Setuje prosledjenu boju:
Skripta: arguments[0].style=”background:” + arguments[1];
Boje za testiranje - red, green, blue, …

		 */
		
		Scanner s = new Scanner(System.in);
		
		System.setProperty("webdriver.chrome.driver", "driver-lib/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		System.out.print("Unesite boju: ");
		String boja = s.next();
		
		WebElement element = driver.findElement(By.tagName("body"));
	
		js.executeScript("arguments[0].style='background:' + arguments[1];", element, boja);
		
	}

}

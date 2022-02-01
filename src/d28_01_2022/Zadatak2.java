package d28_01_2022;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadatak2 {

	public static void main(String[] args) throws InterruptedException {

		/*
		 * Zadatak Napisati program koji vrsi dodavanje 5 reda u tabelu. Maksimizirati
		 * prozor Ucitati stranicu
		 * https://www.tutorialrepublic.com/snippets/bootstrap/table-with-add-and-delete
		 * -row-feature.php Dodati red podataka - jedan red u jednoj iteraciji Kliknite
		 * na dugme Add New Unesite name,departmant i phone (mogu da budu uvek iste
		 * vrednost) Kliknite na zeleno Add dugme Na kraju programa ugasite pretrazivac.
		 */

		System.setProperty("webdriver.chrome.driver", "driver-lib/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.tutorialrepublic.com/snippets/bootstrap/table-with-add-and-delete-row-feature.php");

		String name = "Name";
		String dep = "Department";
		String phone = "Phone";

		for (int i = 1; i < 6; i++) {
			driver.findElement(By.xpath("//*[@type = 'button']")).click();

			WebElement n = driver.findElement(By.xpath("//*[@id = 'name']"));
			n.sendKeys(name + i);

			WebElement d = driver.findElement(By.xpath("//*[@id = 'department']"));
			d.sendKeys(dep + i);

			WebElement p = driver.findElement(By.xpath("//*[@id = 'phone']"));
			p.sendKeys(phone + i);

			List<WebElement> links = driver.findElements(By.xpath("//*[@class = 'add']"));
			links.get(links.size() - 1).click();

		}

		driver.close();

	}

}

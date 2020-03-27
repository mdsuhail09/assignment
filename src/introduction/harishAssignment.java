package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class harishAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\suhail\\\\Music\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.findElement(By.name("userName")).sendKeys("mercury");
		driver.findElement(By.name("password")).sendKeys("mercury");
		driver.findElement(By.name("login")).click();
		driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[2]")).click();
		Select dep = new Select(driver.findElement(By.name("fromPort")));
		dep.selectByIndex(2);
		Thread.sleep(2000L);
		Select mon = new Select(driver.findElement(By.name("fromMonth")));
		Thread.sleep(2000L);
		mon.selectByValue("4");
		Thread.sleep(2000L);
		Select arr = new Select(driver.findElement(By.name("toPort")));
		arr.selectByValue("New York");
		Select toda = new Select(driver.findElement(By.name("toMonth")));
		toda.selectByValue("5");
		Thread.sleep(2000L);
		driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/font/font/input[1]")).click();
		Thread.sleep(2000L);
		Select arrli = new Select(driver.findElement(By.name("airline")));
		arrli.selectByIndex(2);
		
		driver.findElement(By.name("findFlights")).click();
		
		System.out.println(driver.getTitle());
		
		driver.close();
		
		
		
		
		
	}

}

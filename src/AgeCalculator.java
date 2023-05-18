
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class AgeCalculator {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KPONNU\\Desktop\\Dummy\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.easycalculation.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@href='https://www.easycalculation.com/date-day/age-calculator.php' and text()='Age Calculator  ']")).click();
		//count number of links
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		System.out.println(allLinks.size());
		
		
		List<WebElement> allImages = driver.findElements(By.tagName("img"));
		System.out.println(allImages.size());
		
		Thread.sleep(10000);
		WebElement date =driver.findElement(By.id("i21"));
		date.sendKeys("15");
		WebElement month =driver.findElement(By.id("i22"));
		month.sendKeys("8");
		WebElement year =driver.findElement(By.id("i23']"));
		year.sendKeys("1947");
		driver.findElement(By.xpath("//*[@value='Go']")).click();
		WebElement age =driver.findElement(By.id("//input[@id='r1']"));
		age.getText();
		
		WebElement ageDays =driver.findElement(By.id("//input[@id='r4']"));
		ageDays.getText();
		
		WebElement ageHours =driver.findElement(By.id("//input[@id='r3']"));
		ageHours.getText();
	
		WebElement ageMinutes =driver.findElement(By.id("//input[@id='r2']"));
		ageMinutes.getText();
		
	}

}

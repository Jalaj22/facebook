import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Registration_Test {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","E:\\JAR\\SeleniumJAR\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.facebook.com/");
		
		WebElement element = driver.findElement(By.id("u_0_j"));
		element.sendKeys("xyz");
		
		element = driver.findElement(By.id("u_0_l"));
		element.sendKeys("abc");
		
		element = driver.findElement(By.id("u_0_o"));
		element.sendKeys("xyz78@gmail.com");
		
		
		element = driver.findElement(By.id("u_0_r"));
		element.sendKeys("xyz78@gmail.com");
		
		element = driver.findElement(By.id("u_0_v"));
		element.sendKeys("xyz12345");

		element = driver.findElement(By.id("day"));
		Select s = new Select(element);
		s.selectByVisibleText("8");
		
		
		element = driver.findElement(By.id("month"));
		Select s1 = new Select(element);
		s1.selectByIndex(2);
		
		element = driver.findElement(By.id("year"));
		Select s3 = new Select(element);
		s3.selectByValue("1990");
		
		element = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/div/div/div/div[2]/div[2]/div/div/div/div[1]/form/div[1]/div[7]/span/span[1]/label"));
		element.click();
		
		element = driver.findElement(By.id("u_0_11"));
		element.click();
		
		
	}

}

package webdriverPractice;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazonUsingEdgeBrowser {

public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.edge.driver","C:\\Automation Softwares\\edgedriver-v0.33.0-win64\\edgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
        driver.navigate().to("https://www.youtube.com");
		
		Thread.sleep(1000);
		
		driver.navigate().to("https://mail.google.com");
		
		/*
		WebElement ddown = driver.findElement(By.cssSelector("select#searchDropdownBox"));
		Select select = new Select(ddown);
		select.selectByVisibleText("Electronics");
		
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		TakesScreenshot tc = (TakesScreenshot)driver;
		File src= tc.getScreenshotAs(OutputType.FILE);
		File login = new File(".\\images\\Amazon.png");
		FileUtils.copyFile(src, login); */
	}

}

}

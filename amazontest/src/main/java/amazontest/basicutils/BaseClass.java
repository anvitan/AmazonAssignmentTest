package amazontest.basicutils;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class BaseClass implements IAutoConstant {
	
	public WebDriver driver;
	public FileUtils flib= new FileUtils();
	
	
	static {
		System.setProperty(CHROME_KEY,CHROME_PATH);
		System.setProperty(GECKO_KEY,GECKO_PATH);
	}

	@BeforeClass
	public void openBrowser() throws IOException
	{
		String browser=flib.getDataFromProperties("browser");
		String url=flib.getDataFromProperties("url1");
		
		if(browser.equals("chrome"))
			driver= new ChromeDriver();
		else if(browser.equals("firefox"))
			driver= new FirefoxDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	@AfterClass
	public void close()
	{
		driver.close();
	}

}

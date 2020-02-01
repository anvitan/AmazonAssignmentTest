package amazontest.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipKartHomePage {

WebDriver driver;
	
	@FindBy(name="q")
	private WebElement searchTextBox;
	
	public FlipKartHomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
    
	public FlipKartProductsListPage searchFor(String s)
	{
		searchTextBox.sendKeys(s,Keys.ENTER);
		return new FlipKartProductsListPage(driver);
	}
	
}

package amazontest.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonHomePage {
	
	WebDriver driver;
	
	@FindBy(id="twotabsearchtextbox")
	private WebElement searchTextBox;
	
	public AmazonHomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
    
	public AmazonProductsListPage searchFor(String s)
	{
		searchTextBox.sendKeys(s,Keys.ENTER);
		return new AmazonProductsListPage(driver);
	}
	
	
	
	
	
	
	

}

package amazontest.pages;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonProductsListPage {
	
	WebDriver driver;
	public AmazonProductsListPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	
	final String path="//a[contains(.,'XR (64GB) - Yellow')]/ancestor::div[contains(@class,'-of-20 sg-col-24')]/descendant::span[@class='a-price-whole']";
	@FindBy(xpath=path) private WebElement iphoneXRProductPrice;
	
	public int readPriceofProduct()
	{
		String s=iphoneXRProductPrice.getText();
		s=s.replaceAll("₹","").trim().replaceAll(",","");
		return Integer.parseInt(s);
	}
	
	
	
	
}

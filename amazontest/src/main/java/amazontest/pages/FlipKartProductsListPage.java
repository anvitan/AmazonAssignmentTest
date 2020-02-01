package amazontest.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipKartProductsListPage {
WebDriver driver;
	
final String path="//div[@class='col col-7-12']/div[contains(.,' 64 GB)')]/../../descendant::div[@class='_1vC4OE _2rQ-NK']";
	@FindBy(xpath=path)
	private WebElement iphoneXRProductPrice;
	
	public FlipKartProductsListPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
    
	public int readPriceofProduct()
	{
		String s=iphoneXRProductPrice.getText();
		s=s.replaceAll("₹","").replaceAll(",","").trim();
		return Integer.parseInt(s);
	}

}

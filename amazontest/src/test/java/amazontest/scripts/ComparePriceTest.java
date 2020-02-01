package amazontest.scripts;

import org.testng.annotations.Test;

import amazontest.basicutils.BaseClass;
import amazontest.pages.AmazonHomePage;
import amazontest.pages.AmazonProductsListPage;
import amazontest.pages.FlipKartHomePage;
import amazontest.pages.FlipKartProductsListPage;

public class ComparePriceTest extends BaseClass {
	
	
	@Test
	public void comparePriceTest()
	{
		AmazonHomePage ahp=new AmazonHomePage(driver);
		AmazonProductsListPage aplp = ahp.searchFor("iPhone XR (64GB)-yellow");
		int amazonprice=aplp.readPriceofProduct();
		driver.navigate().to("https://www.flipkart.com");
		FlipKartHomePage fhp=new FlipKartHomePage(driver);
		FlipKartProductsListPage fplp = fhp.searchFor("iPhone XR (64GB)-yellow");
		int flipkartprice=fplp.readPriceofProduct();
		
		if(amazonprice<flipkartprice)
			System.out.println("Amazon has lesser price than flipkart");
		else
			System.out.println("Flipkart has lesser price than Amazon");
		
	}

}

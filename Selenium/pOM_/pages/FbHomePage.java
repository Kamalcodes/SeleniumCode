package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FbHomePage
{
	WebDriver driver;
	public FbHomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	@FindBy(how=How.XPATH,using="//html[@id='facebook']//label[@id='loginbutton']/input[@value='Log In']")WebElement profileDropdown;
	@FindBy(how=How.XPATH,using="//text()[.='Log Out']/ancestor::span[1]")WebElement logoutLink;
	@FindBy(how=How.XPATH,using="//html[@id='facebook']//div[@id='universalNav']/ul/li[4]//div[@class='linkWrap noCount']")WebElement Marketplace;
	
	public void clickOnProfileDropdown()
	{
		profileDropdown.click();
	}
	
	public void ClickOnLogoutLink()
	{
		logoutLink.click();
	}
	
	public void ClickOnMarketplace()
	{
		Marketplace.click();
		//return userName;
				
	}
}

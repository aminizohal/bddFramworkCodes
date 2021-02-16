package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class TablestPageObj extends Base{

	public TablestPageObj() {
	   PageFactory.initElements(driver, this);
}
	//Accessing tablets menu
	@FindBy(xpath=" (//*[text()='Tablets'])[2]")
	private WebElement tabletsMenu;
	// accessing to tablets image
	@FindBy(xpath=" //img[@title='Samsung Galaxy Tab 10.1']")
	private WebElement samsungGalaxyTab;
	// click to tables and it opens a new page
	@FindBy(xpath=" //a[contains(text(),'Samsung Galaxy Tab 10.1')]")
	
	private WebElement samsungGalaxypage;
	//add to wish list tab
	@FindBy(xpath=" ((//button[@data-toggle= 'tooltip'])[3]")
	private WebElement addToWishListSamsung;

	//add to shopping cart
	@FindBy(xpath=" (//i[@class= 'fa fa-shopping-cart'])[3]")
	private WebElement addToShoppingCartSamsung;

	//compare this product for Samsung Tablet
	@FindBy(xpath=" (//button[@data-toggle= 'tooltip'])[4]")
	private WebElement compareThisProductSamsung;
	
}

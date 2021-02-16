package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.WebDriverUtility;

public class DesktopPageObj extends Base{
public static final String getPageTitle = null;
public DesktopPageObj() {
	PageFactory.initElements(driver, this);
}
//clicking to Desktop tab
@FindBy(xpath= "//body/div[1]/nav[1]/div[2]/ul[1]/li[1]/a[1] ")	
private WebElement desktopTab;

//show all desktop
@FindBy(xpath= "//a[contains(text(),'Show All Desktops')] ")
private WebElement showAllDesktopsOption;
// all items in desktop page present
@FindBy(xpath=" //body/div[@id='product-category']/div[1]/div[1]/div[4]")
private WebElement allItemsPresent;
//add to cart hp lp3065 computer
@FindBy(xpath=" //body/div[@id='product-category']/div[1]/div[1]/div[4]/div[3]/div[1]/div[2]/div[2]/button[1]/i[1]")
private WebElement addToCartOption;
//add quantiy 1
@FindBy(xpath="//input[@id='input-quantity']")
private WebElement enterQuantityToHp;
//click on add to cart button
@FindBy(xpath=" //body/div[@id='product-product']/div[1]")
private WebElement addToCartButton;
//success messege
@FindBy(xpath="//body/div[@id='product-product']/div[1] ")
private WebElement successMessage;
//we need to create public methods to perform required actions on each saved elements
public void clickonDesktpTab(String value) {
	WebDriverUtility.clickOnElement(desktopTab);
}

public void ShowAllDesktopsOption() {
	WebDriverUtility.clickOnElement(showAllDesktopsOption);
}
	// TODO Auto-generated method stub
	public boolean allDesktopItemsIsDisplayed() {
		if (allItemsPresent.isDisplayed())
			return true;
		else
			return false;
	}

public void addToCartOption(String value) {
	WebDriverUtility.clickOnElement(addToCartOption);
}
public void enterQuantityToHp(String value) {
	WebDriverUtility.clickOnElement(enterQuantityToHp);
}
public void clickOnAddToCartButton() {
WebDriverUtility.clickOnElement(addToCartButton);
}
public void successMessage(String value) {
	WebDriverUtility.isElementDisplayed(successMessage);
}

public void clickonDesktpTab() {
	// TODO Auto-generated method stub
	
}

	

}

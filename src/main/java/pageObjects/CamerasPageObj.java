package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class CamerasPageObj extends Base{

	public CamerasPageObj() {
		PageFactory.initElements(driver, this);
	}
	// xpath to cameraBar
	@FindBy(xpath = "//*[text()='Cameras']")
	 private WebElement camerasBar;
	
	//xpatch to select CanonCamera from dropdown
	@FindBy(linkText="Canon (1)")
	private WebElement canon1;
	//canonImage displayed in a new page
	@FindBy(xpath= "//img[@title = 'Canon EOS 5D']")
	private WebElement canonImage;
	//Canon EOS 5D Label
	@FindBy(linkText ="//a[contains(text(),'Canon EOS 5D')]")
	private WebElement canonEos5D;
	
	//Xpath to select NikonCamera from dropdown list
	@FindBy(linkText = "Nikon (1)")
	private WebElement nikon1;
	
	//Display nikonImage
	@FindBy(xpath="   //body/div[@id='product-category']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/a[1]/img[1]")
	private WebElement nikonImageDisplayed;
	//find Nikon label
	@FindBy(linkText="Nikon D300") 
	private WebElement nikonD300Label;
	
	//xpath to select showAllCameras from Dropdwon list
	@FindBy(xpath ="//a[contains(text(),'Show All Cameras')]")
	private WebElement showAllCameras;
	//find Canon Text 
	@FindBy(xpath="//h2[contains(text(),'Canon')]")
	private WebElement canonName;
	//ListDisplay
	@FindBy(xpath="//*[@class='fa fa-th-list']")
	private WebElement listDisplay;
	//GridDisplay
	@FindBy(xpath="//*[@class='btn btn-default']")
	private WebElement gridDisplay;
	//SortBy label
	@FindBy(xpath="//label[contains(text(),'Sort By:')]")
	private WebElement sortByLabel;
	@FindBy(css ="#input-sort")
	private WebElement inputSortDisplay;
	@FindBy(xpath= "//label[contains(text(),'Show:')]")
	private WebElement showLabel;
	//show 15 by default in show:
	@FindBy(xpath="//select[@id='input-limit']")
	private WebElement inputLimitBar;
	//oneClickCartAdd
	@FindBy(xpath= "//body/div[@id='product-category']/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/button[1]")
	private WebElement cartAdd;
	//Add to wishList
	@FindBy(xpath="//body/div[@id='product-category']/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/button[2]")
	private WebElement addToWishListButton;
	//compareThisProduct Tab
	@FindBy(xpath= "//body/div[@id='product-category']/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/button[3]")
	private WebElement compareThisProduct;
	
	
}

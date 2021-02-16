package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class ComponentsPageObj extends Base{
public ComponentsPageObj() {
	PageFactory.initElements(driver, this);
}
	
@FindBy(xpath= "//*[text()='Components' ] ")
private WebElement componentsBar;
//micAndTrackBalls
@FindBy(linkText=" Components")
private WebElement miceAndTrackballs;
//continue button for components
@FindBy(linkText="Continue")
private WebElement continueButtonForComponents;
//find monitor
@FindBy(xpath="//*[text()='Monitors (2)']")
private WebElement monitorsTab;
//Refine Search
@FindBy(xpath=" //h3[contains(text(),'Refine Search')]")
private WebElement refineSearch;
//test 1 of refine search
@FindBy(xpath=" //a[contains(text(),'test 1 (0)')]")
private WebElement test1RefineSearch;
// test 2 of refine search
@FindBy(xpath= " //a[contains(text(),'test 2 (0)')] ")
private WebElement test2RefineSearch;
//compareTotal tab
@FindBy(css= "#compare-total")
private WebElement compareTotalTab;
//sort by default
@FindBy(id ="input-sort")
private WebElement sortByDefault;
//input limit tab
@FindBy(id= "input-limit")
private WebElement inputLimitTab;
//Apple Cinema 30 image displayed
@FindBy(xpath= " //img[@title='Apple Cinema 30\"']")
private WebElement appleCinema30Image;
//apple nameplate is displayed
@FindBy(xpath= " //a[contains(text(),'Apple Cinema 30\"')]")
private WebElement appleCinema30Name;
//add to wish list tab
@FindBy(xpath=" (//button[@data-toggle= 'tooltip'])[3]")
private WebElement addToWishListApple;

//add to shopping cart
@FindBy(xpath=" (//i[@class= 'fa fa-shopping-cart'])[3]")
private WebElement addToShoppingCartApple;

//compare this product for apple cinema 30"
@FindBy(xpath=" (//button[@data-toggle= 'tooltip'])[4]")
private WebElement compareThisProductApple;

// Samsung tv image 
@FindBy(xpath=" //img[@title='Samsung SyncMaster 941BW']")
private WebElement samsungTvImage;
//Samsung tv Name
@FindBy(xpath=" //a[contains(text(),'Samsung SyncMaster 941BW')]")
private WebElement samsungTvName;
// add to shopping cart for Samsung tv
@FindBy(xpath=" (//i[@class= 'fa fa-shopping-cart'])[4]")
private WebElement addToShoppingCartSamsung;

//add to wish list for Samsung tv
@FindBy(xpath=" (//button[@data-toggle= 'tooltip'])[5]")
private WebElement addToWishListSamsung;
//compare this product for samsung tv
@FindBy(xpath=" (//button[@data-toggle= 'tooltip'])[6]")
private WebElement compareThisProductSamsung;

//Printers
@FindBy(xpath="//*[text()='Printers (0)']")
private WebElement printersTab;
//continue button for printers
@FindBy(xpath=" //a[contains(text(),'Continue')]")
private WebElement continueButtonForPrinters;
//Scanners
@FindBy(xpath= "(//a[contains(text(),'Scanner')])[1]")
private WebElement scannersTab;
//continue button for scanners
@FindBy(xpath="//a[contains(text(),'Continue')] ")
private WebElement continueButtonScanners;
//webcameras
@FindBy(xpath=" (//a[contains(text(),'Web Cameras')])[1]")
private WebElement webCameras;
//continue button for webcameras
@FindBy(xpath=" //a[contains(text(),'Continue')]")
private WebElement continueButtonWebCameras;
//show all components
@FindBy(xpath=" //a[contains(text(),'Show All Components')]")
private WebElement showAllElements;
//components tab opens after clicking the show all components
@FindBy(xpath="//h2[contains(text(),'Components')] ")
private WebElement components;


	
}

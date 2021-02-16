package stepDefinitions;

import org.openqa.selenium.By;

import core.Base;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.DesktopPageObj;
import utilities.WebDriverUtility;

public class DesktopStepDefinition extends Base {
   DesktopPageObj desktoppageobj= new DesktopPageObj();
	//**@Given("^User is on Retail website$")
	//public void user_is_on_Retail_website() throws Throwable {
	//	Base.initializeDriver();
		//logger.info("Retail page is opened");
		//String actualPageTitle = desktoppageobj.getPageTitle;
		//String expectedPageTitle = "TEK SCHOOL";
		//Assert.assertEquals(expectedPageTitle, actualPageTitle);
		//logger.info("Page title  is verified");
		//WebDriverUtility.screenShot();
		
	//}
  

	@When("^User click on Desktops tab$")
		public void user_click_on_desktops_tabs() throws Throwable{
		desktoppageobj.clickonDesktpTab();
		logger.info("User clicks on desktop tab");
		WebDriverUtility.screenShot();
		
	}
	@And("^User click on Show all desktops$")
       public void user_click_on_Show_all_desktops() throws Throwable {
			desktoppageobj.ShowAllDesktopsOption();
			WebDriverUtility.screenShot();
		}
	@Then("^User should see all items are present in Desktop page$")
	 public void user_should_see_all_items_are_present_in_desktop_page() throws Throwable{
		desktoppageobj.allDesktopItemsIsDisplayed();
		
		logger.info("user should be able to see show all desktop items");
		WebDriverUtility.screenShot();
	}
	// second scenario
	
	@And("^User click ADD TO CART option on '(.+)' item$")
	public void user_click_add_to_cart_option(String value) throws Throwable{
		desktoppageobj.addToCartOption(value);
		logger.info("user should be able to add items on shopping cart");
		WebDriverUtility.screenShot();
	}
	//@And("^User select quantity '(.+)'")
	//public void user_select_quantity_1() throws Throwable{
		//desktoppageobj.clickOnAddQuantityToHp();
		//logger.info("user selected the quantity ");
		//WebDriverUtility.screenShot();
		
	//}

	@And("^User select quantity '(.+)'$")
	public void user_select_quantity(String quantity) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  
	}
	
	@And("^User click add to cart button$")
	public void user_click_add_to_cart_button() throws Throwable{
		desktoppageobj.clickOnAddToCartButton();
		logger.info("User clicked on add to cart button");
		WebDriverUtility.screenShot();
	}
	
	@Then("^User should see a message 'Success: you have added HP LP 3065 to your shopping cart!'$")
	public void user_should_see_a_message_success_you_have_added_HP_Lp_to_your_shopping_cart() throws Throwable {
	String actualMessage= driver.findElement(By.xpath("//body/div[@id='product-product']/div[1]")).getText();
	if(actualMessage.contains("Success: You have added HP LP3065 to your shopping cart!")) {
		logger.info("success message is showing");
	}else {
		logger.info("something is not right");
		WebDriverUtility.screenShot();
	}
	
	}

}


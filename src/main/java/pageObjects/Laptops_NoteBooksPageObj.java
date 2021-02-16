package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class Laptops_NoteBooksPageObj extends Base{

	public Laptops_NoteBooksPageObj() {
		PageFactory.initElements(driver, this);
	}
	
	//laptop and notebook tab
	@FindBy(xpath=" //*[text()= 'Laptops & Notebooks']")
	private WebElement laptopAndNoteBook;
	//select mac
	@FindBy(xpath= "//a[contains(text(),'Macs (0)')] ")
	private WebElement Macs;
	//once select on Macs select continue
	@FindBy(xpath=" //a[contains(text(), 'Continue')]")
	private WebElement continueButtonForMacs;
	//Windows button click
	@FindBy(xpath=" //body/div[1]/nav[1]/div[2]/ul[1]/li[2]/div[1]/div[1]/ul[1]/li[2]/a[1]")
	private WebElement windowsButton;
	@FindBy(xpath= " //a[contains(text(),'Continue')]")
	private WebElement continueButtonForWindows;
	//show all laptops button
	@FindBy(xpath=" //a[contains(text(),'Show All Laptops & Notebooks')]")
	private WebElement showAllLaptopsNotebooks;
	
}

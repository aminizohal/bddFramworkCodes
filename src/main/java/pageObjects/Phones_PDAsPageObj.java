package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class Phones_PDAsPageObj extends Base {

public Phones_PDAsPageObj() {
	PageFactory.initElements(driver, this);
}
//click on phones and pDAs
@FindBy(linkText= " Phones & PDAs")
private WebElement phonesPDAs;
//HTC image
@FindBy(xpath= " //img[@title= 'HTC Touch HD']")
private WebElement htcTouchHd;
//iphone image
@FindBy(xpath= " //img[@title= 'iPhone']")
private WebElement iphoneImage;
//Palm Pro
@FindBy(xpath= " //img[@title= 'Palm Treo Pro']")
private WebElement palmTeoproImage;


}

package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class SoftwarePageObj extends Base{
public SoftwarePageObj() {
	PageFactory.initElements(driver, this);
}
	
	//Software tab
@FindBy(xpath=" (//*[text()= 'Software'])[2]")
private WebElement softwareTab;
//click on continue button
@FindBy(xpath=" //a[contains(text(),'Continue')]")
private WebElement continueButtonSoftware;



}

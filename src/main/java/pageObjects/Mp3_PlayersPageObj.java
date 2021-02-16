package pageObjects;

import org.openqa.selenium.support.PageFactory;

import core.Base;

public class Mp3_PlayersPageObj extends Base{
public Mp3_PlayersPageObj() {
	PageFactory.initElements(driver, this);
}
}

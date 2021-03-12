package pages;


import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basepage.TestBase;



public class login extends  TestBase {
	
}
@FindBy(name="username") 
WebElement  uname;

@FindBy(name="password") 
WebElement passw;

@FindBy(xpath="//input[@type='submit']")
WebElement login_btn;

@FindBy(xpath="//button[contains(text(), 'SignUp')]")
WebElement signup_btn;

@FindBy(xpath="//img[contains(@class,'img-responsive')]")
WebElement crmlogo;

//Initializing the PageObjects:

 public login() {
	PageFactory.initElements(driver, this);	
}

//Actions:

public String validateLoginPageTitle() {
	return driver.getTitle();
	
}

public boolean validateCRMImage() {
	return crmlogo.isDisplayed();
}

public homepage login(String un, String pw) {
	uname.sendKeys(un);
	passw.sendKeys(pw);
	login_btn.click();
	
	return new homepage();
}
{

}

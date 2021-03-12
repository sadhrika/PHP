package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import basepage.TestBase;

public class hotels extends TestBase {

	
	@FindBy(xpath="//a[@class='text-center hotels active']")
	WebElement hotelslink;
}

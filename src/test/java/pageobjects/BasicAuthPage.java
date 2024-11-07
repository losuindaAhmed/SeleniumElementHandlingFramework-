package pageobjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class BasicAuthPage extends BasePage {

	public BasicAuthPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//a[normalize-space()='Basic Auth']")
	private WebElement homepagebasicauth;

	@FindBy(xpath = "//p[contains(text(),'Congratulations! You must have the proper credenti')]")
	private WebElement bodytext;

	public void clickOnBasicAuth() throws InterruptedException {
		homepagebasicauth.click();
//		String username = "admin";
//		String password = "admin";
		String baseUrl = "http://the-internet.herokuapp.com/basic_auth";
		String authUrl = "http://"+"admin"+":" +"admin" + "@" + baseUrl;
		driver.get(authUrl);
		Thread.sleep(2000);
		String bodytxt = bodytext.getText();
		System.out.println(bodytxt);

		//Assert.assertTrue(bodytxt.contains("Congratulations!"), "Login failed or page content mismatch");

	}

}

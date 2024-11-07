package pageobjects;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class BrokenImagePage extends BasePage {

	public BrokenImagePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//a[normalize-space()='Broken Images']")
	private WebElement linkBrokenImage;

	@FindBy(tagName = "img")
	private List<WebElement> numberOfImages;

	public void clickOnBrokenImage() {
		linkBrokenImage.click();

	}

	public void testImageCount() {
		int totalImage = 4;

		Assert.assertEquals(numberOfImages.size(), totalImage, "Passed Testcases");
	}
	
	public boolean isImageBroken(String src) throws IOException {
		try {
	     URL url = new URL(src);
         HttpURLConnection http = (HttpURLConnection) url.openConnection();
         http.setRequestMethod("HEAD");
         http.connect();
		return http.getResponseCode()!=200;
		}
		catch(Exception e) {
			System.out.println("Exception for image: "+src+" _ "+e.getMessage());
			return true;
			
		}
	}

}

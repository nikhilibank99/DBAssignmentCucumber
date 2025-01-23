package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

public class HomePage {

	@FindBy(xpath="//a[text()='Live Scores']")
	@CacheLookup
	private WebElement LiveScoresLnk;
	
	@FindBy(xpath="//img[@alt='ESPNcricinfo']")
	@CacheLookup
	private WebElement espnCricInfoLogo;
	
	@FindBy(xpath="//a[text()='Series']")
	@CacheLookup
	private WebElement Serieslnk;
	
	@FindBy(xpath="//a[text()='News']")
	@CacheLookup
	private WebElement Newslnk;
	
	@FindBy(xpath="//a[text()='Features']")
	@CacheLookup
	private WebElement Featureslnk;
	
	@FindBy(xpath="//a[text()='Videos']")
	@CacheLookup
	private WebElement Videoslnk;
	
	@FindBy(xpath="//a[text()='Stats']")
	@CacheLookup
	private WebElement Statslnk;
	
	@FindBy(xpath="//div[text()='Edition IN']")
	@CacheLookup
	private WebElement EditionINbtn;
	
	@FindBy(xpath="//i[@class='icon-translate ds-text-icon-inverse ds-mr-1']")
	@CacheLookup
	private WebElement Translateicon;
	
	@FindBy(xpath="//i[@class='icon-dark_mode-filled ds-text-icon-inverse']")
	@CacheLookup
	private WebElement DarkModeIcon;
	
	@FindBy(xpath="//i[@class=\"icon-apps-filled ds-text-icon-inverse ci-nav-item ci-nav-hover ds-cursor-pointer\"]")
	@CacheLookup
	private WebElement Appsicon;
	
	@FindBy(xpath="//i[@class='icon-search-outlined ds-text-icon-inverse ci-nav-item ci-nav-hover']")
	@CacheLookup
	private WebElement Searchicon;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void espnCricInfoImg() {
		espnCricInfoLogo.isDisplayed();
	}
	
	public void verifyLiveScoresLink() {
		LiveScoresLnk.isDisplayed();
	}
	
	public void seriesLink() {
		Serieslnk.isDisplayed();
	}
	
	public void newsLink() {
		Newslnk.isDisplayed();
	}
	
	public void featuresLink() {
		Featureslnk.isDisplayed();
	}
	
	public void videosLink() {
		Videoslnk.isDisplayed();
	}
	
	public void statsLink() {
		Statslnk.isDisplayed();
	}
	
	public void editionINButton() {
		EditionINbtn.isDisplayed();
	}
	
	public void translateIcon() {
		Translateicon.isDisplayed();
	}
	
	public void darkModeIcon() {
		DarkModeIcon.isDisplayed();
	}
	
	public void appsIcon() {
		Appsicon.isDisplayed();
	}
	
	public void searchIcon() {
		Searchicon.isDisplayed();
	}
	
}

package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
public WebDriver ldriver;
	
	public HomePage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	@FindBy(xpath="//a[text()='Live Scores']")
	@CacheLookup
	WebElement LiveScoresLnk;
	
	@FindBy(xpath="//img[@alt='ESPNcricinfo']")
	@CacheLookup
	WebElement espnCricInfoLogo;
	
	@FindBy(xpath="//a[text()='Series']")
	@CacheLookup
	WebElement Serieslnk;
	
	@FindBy(xpath="//a[text()='News']")
	@CacheLookup
	WebElement Newslnk;
	
	@FindBy(xpath="//a[text()='Features']")
	@CacheLookup
	WebElement Featureslnk;
	
	@FindBy(xpath="//a[text()='Videos']")
	@CacheLookup
	WebElement Videoslnk;
	
	@FindBy(xpath="//a[text()='Stats']")
	@CacheLookup
	WebElement Statslnk;
	
	@FindBy(xpath="//div[text()='Edition IN']")
	@CacheLookup
	WebElement EditionINbtn;
	
	@FindBy(xpath="//i[@class='icon-translate ds-text-icon-inverse ds-mr-1']")
	@CacheLookup
	WebElement Translateicon;
	
	@FindBy(xpath="//i[@class='icon-dark_mode-filled ds-text-icon-inverse']")
	@CacheLookup
	WebElement DarkModeIcon;
	
	@FindBy(xpath="//i[@class=\"icon-apps-filled ds-text-icon-inverse ci-nav-item ci-nav-hover ds-cursor-pointer\"]")
	@CacheLookup
	WebElement Appsicon;
	
	@FindBy(xpath="//i[@class='icon-search-outlined ds-text-icon-inverse ci-nav-item ci-nav-hover']")
	@CacheLookup
	WebElement Searchicon;
	
	
	
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

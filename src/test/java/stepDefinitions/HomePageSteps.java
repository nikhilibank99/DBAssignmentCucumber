package stepDefinitions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageobjects.HomePage;
import stepDefinitions.HomePageSteps;

public class HomePageSteps {

	private static final Logger log = Logger.getLogger(HomePageSteps.class);
    public static WebDriver driver;
    ChromeOptions options_1;
    FirefoxOptions options_2;
    public HomePage hp;
    FileReader reader;
    Properties prop;

    
    @Given("I launch browser")
    public void i_launch_chrome_browser() throws FileNotFoundException,IOException {
    	reader=new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\config\\config.properties");
        prop = new Properties();
        try{
            prop.load(reader);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        
    	if(prop.getProperty("browser").equalsIgnoreCase("chrome")) {
    	WebDriverManager.chromedriver().setup();
		options_1 = new ChromeOptions();
		options_1.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(options_1);
		}
    	else if (prop.getProperty("browser").equalsIgnoreCase("firefox"))
    	{
    		WebDriverManager.firefoxdriver().setup();
    		options_2 = new FirefoxOptions();
    		options_2.addArguments("--remote-allow-origins=*");
    		driver = new FirefoxDriver(options_2);
    		
    	}
    	else
		{
		System.out.println("Please define the correct browser");
		}
        driver.manage().window().maximize();
        hp = new HomePage(driver);
        Properties props=new Properties();
        props.load(new FileInputStream(("log4j.properties")));
        PropertyConfigurator.configure(props);
        log.info("###Browser Launched###");
       
    }

        @When("I Entered Url")
        public void i_entered_url() {
            driver.navigate().to(prop.getProperty("url"));
            log.info("###Url Entered###");
            long time = 2000;
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
            WebElement poup= driver.findElement(By.xpath("//div[text()='Latest cricket updates']"));
            if(poup.isDisplayed()){
                driver.findElement(By.xpath("//button[text()=\"Yes! I'm in\"]")).click();
          }

        }
        @Then("I validate homepage title")
        public void i_validate_homepage_title() {
            String exp_title="Today's Cricket Match | Cricket Update | Cricket News | ESPNcricinfo";
            String act_title=driver.getTitle();
            Assert.assertEquals(exp_title, act_title);
            log.info("Page title Verified");
        }
        
        @Then("validate the header data")
        public void validate_the_header_data() {
        	hp.espnCricInfoImg();
        	log.info("logo is displayed");
        	hp.verifyLiveScoresLink();
        	log.info("Live Scores Link is displayed");
        	hp.seriesLink();
        	log.info("Series Link is displayed");
        	hp.newsLink();
        	log.info("News Link is displayed");
        	hp.featuresLink();
        	log.info("Feautures Link is displayed");
        	hp.videosLink();
        	log.info("Videos Link is displayed");
        	hp.statsLink();
        	log.info("Stats Link is displayed");
        	hp.editionINButton();
        	log.info("Edition IN is displayed");
        	hp.translateIcon();
        	log.info("Translate Icon is displayed");
        	hp.darkModeIcon();
        	log.info("Dark Mode Icon is displayed");
        	hp.appsIcon();
        	log.info("Apps Icon is displayed");
        	hp.searchIcon();
        	log.info("Search Icon is displayed");
        	
        }
         
        @Then("I close browser")
    public void i_close_browser() {
       driver.quit();
        log.info("$$$Browser Closed$$$");
    }
}

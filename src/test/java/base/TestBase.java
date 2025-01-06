package base;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageobjects.HomePage;

public class TestBase {
	public static WebDriver driver;
    static ChromeOptions options_1;
    static FirefoxOptions options_2;
    static FileReader reader;
    public static Properties prop;
    public static void openBrowser() throws FileNotFoundException,IOException {
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
	driver.manage().window().maximize();
	}
	else if (prop.getProperty("browser").equalsIgnoreCase("firefox"))
	{
		WebDriverManager.firefoxdriver().setup();
		options_2 = new FirefoxOptions();
		options_2.addArguments("--remote-allow-origins=*");
		driver = new FirefoxDriver(options_2);
		driver.manage().window().maximize();
		
	}
	else
	{
	System.out.println("Please define the correct browser");
	}}

    public static void tearDown() {
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(120));
		driver.quit();
	}

}

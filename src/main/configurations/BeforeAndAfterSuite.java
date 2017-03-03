package main.configurations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BeforeAndAfterSuite {
	static String driverPath = "/Applications/browsers/";
    public WebDriver driver;

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("*******************");
        System.setProperty("webdriver.chrome.driver", driverPath +"chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    
    @AfterSuite
    public void tearDown(){
    driver.quit();
    }


}

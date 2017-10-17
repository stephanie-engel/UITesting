package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import main.configurations.BeforeAndAfterSuite;
import main.pages.DownloadPage;
import main.pages.HomePage;
import main.pages.ProjectsPage;
import main.pages.DocumentationPage;
import main.pages.SupportPage;
import main.pages.AboutPage;


public class NavigationSmokeTests extends BeforeAndAfterSuite{

	    @BeforeTest
	    public void beforeTest(){
	        System.out.println("Launching: SeleniumHq Navigation Smoke Tests");
	    }

	    @Test(priority = 1)
	    public void accessProjectsPage(){
	        HomePage homePage = new HomePage(driver);
	        homePage.getProjectsPage();
	        
	        ProjectsPage projectsPage = new ProjectsPage(driver);
	        Assert.assertTrue(projectsPage.isElementPresent(By.linkText("many browsers")),
	                "[ErrMsg] User was not routed to the Projects page!");
	    }

	    @Test(priority = 2)
	    public void accessDownloadPage(){
	    	ProjectsPage projectsPage = new ProjectsPage(driver);
	    	projectsPage.getDownloadPage();
	    	
	    	DownloadPage downloadPage = new DownloadPage(driver);
	    	Assert.assertTrue(downloadPage.isElementPresent(By.linkText("previous releases")),
	    			"[ErrMsg] User was not routed to the Download page!");
	    	
	    }
	    
	    @Test(priority = 3)
	    public void accessDocumentationPage(){
	    	ProjectsPage projectsPage = new ProjectsPage(driver);
	    	projectsPage.getDocumentationPage();
	    	
	    	DocumentationPage documentationPage = new DocumentationPage(driver);
	    	Assert.assertTrue(documentationPage.isElementPresent(By.linkText("Selenium Documentation")),
	    			"[ErrMsg] User was not routed to the Documentation page!");
	    	
	    }
	    
	    @Test(priority = 4)
	    public void accessSupportPage(){
	    	ProjectsPage projectsPage = new ProjectsPage(driver);
	    	projectsPage.getSupportPage();
	    	
	    	SupportPage supportPage = new SupportPage(driver);
	    	Assert.assertTrue(supportPage.isElementPresent(By.xpath("//*[@id=\"CommercialSupport\"]")),
	    			"[ErrMsg] User was not routed to the Support page!");
	    	
	    }
	    
	    @Test(priority = 5)
	    public void accessAboutPage(){
	    	ProjectsPage projectsPage = new ProjectsPage(driver);
	    	projectsPage.getAboutPage();
	    	
	    	AboutPage aboutPage = new AboutPage(driver);
	    	Assert.assertTrue(aboutPage.isElementPresent(By.xpath("//*[@id=\"mainContent\"]")),
	    			"[ErrMsg] User was not routed to the About page!");
	    	
	    }
	    
	    @AfterTest
	    public void afterTest() {
	        driver.close();
	    }
}

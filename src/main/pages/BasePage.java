package main.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lombok.Getter;
import lombok.Setter;

public abstract class BasePage {

	protected WebDriver driver;
	
	public BasePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	//Lombok getters, setters, and locators all in 2 lines
	@Getter @Setter @FindBy(id = "menu_projects")
	private WebElement lnkProjects;

	@Getter @Setter @FindBy(id = "menu_download")
	public WebElement lnkDownload;
	
	@Getter @Setter @FindBy(id = "menu_documentation")
	public WebElement lnkDocumentation;
	
	@Getter @Setter @FindBy(id = "menu_support")
	public WebElement lnkSupport;
	
	@Getter @Setter @FindBy(id = "menu_about")
	public WebElement lnkAbout;
	
	@Getter @Setter @FindBy(id = "q")
	private WebElement txtSearchSelenium;
	
	//Methods
	public BasePage getProjectsPage(){
		lnkProjects.click();
        return this;
	}
	
	public BasePage getDownloadPage(){
		lnkDownload.click();
		return this;
	}
	
	public BasePage getDocumentationPage(){
		lnkDocumentation.click();
		return this;
	}
	
	public BasePage getSupportPage(){
		lnkSupport.click();
		return this;
	}
	
	public BasePage getAboutPage(){
		lnkAbout.click();
		return this;
	}

	
//// Method for finding an element for an assertion	
	public boolean isElementPresent(By by) {
	        try {
	            driver.findElement(by);
	            return true;
	        } catch (NoSuchElementException e) {
	            return false;
	        }
	    }


}

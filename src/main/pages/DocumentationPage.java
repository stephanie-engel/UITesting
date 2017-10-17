package main.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import lombok.AccessLevel;	//Need to efficiently use this
import lombok.Getter;
import lombok.Setter;

public class DocumentationPage {
	
	public static final String PAGE_URL = "http://www.seleniumhq.org/documentation/";
	public WebDriver driver;
	
	public DocumentationPage(WebDriver driver){
		this.driver = driver;
		driver.get(PAGE_URL);
		PageFactory.initElements(driver, this);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	//Methods
		public boolean isElementPresent(By by) {
		        try {
		            driver.findElement(by);
		            return true;
		        } catch (NoSuchElementException e) {
		            return false;
		        }
		    }

}

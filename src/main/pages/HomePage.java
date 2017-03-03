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

public class HomePage extends BasePage{
	
	public static final String PAGE_URL = "http://www.seleniumhq.org/";
	public WebDriver driver;
	
	public HomePage(WebDriver driver){
		super(driver);
		driver.get(PAGE_URL);
	}
	
	@Getter @Setter @FindBy(linkText = "Selenium blog")
	public WebElement lnkSeleniumBlog;
	
	public HomePage getSeleniumBlogPage(){
		lnkSeleniumBlog.click();
		return this;
	}
	
}

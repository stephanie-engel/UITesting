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

public class ProjectsPage extends BasePage {
	
	public static final String PAGE_URL = "http://www.seleniumhq.org/projects/";
	public WebDriver driver;
	
	public ProjectsPage(WebDriver driver){
		super(driver);
		driver.get(PAGE_URL);
	}

}

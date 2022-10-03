package pages;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// 1. Use of xPath locator
	@FindBy(xpath = "//button[@class= 'search-button']")
	WebElement searchTool;

	public void searchTool() throws InterruptedException {
		Thread.sleep(3000);
		searchTool.click();
		Thread.sleep(3000);
	}

	// 2. Use of Id attribute as locator
	@FindBy(id = "address")
	WebElement location;

	public void location() throws InterruptedException {
		Thread.sleep(3000);
		location.click();
		Thread.sleep(3000);
	}
	
	// 3. Use of how.xPath locator
	@FindBy(how = How.XPATH, using = "//button[@class= 'humburger']")
	WebElement showMenu;
	
	public void showMenu() throws InterruptedException {
		Thread.sleep(3000);
		showMenu.click();
		Thread.sleep(3000);
	}
	
	// 4. Use of "By" as locator
	By findDoctor = By.id("search-input");
	WebElement doctorName;
	public void doctor() throws InterruptedException {
		Thread.sleep(3000);
		doctorName.click();
		Thread.sleep(3000);
	}

	@FindBy(xpath = "//a[@class= 'logo']")
	WebElement logo;

	public boolean logoDisplayed() {
		boolean flag = logo.isDisplayed();
		System.out.println("The logo is displayed: " + flag);
		return flag;
	}

	

}

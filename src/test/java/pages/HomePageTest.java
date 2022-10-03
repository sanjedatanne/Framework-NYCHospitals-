package pages;

import org.testng.annotations.Test;

import java.awt.Dimension;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import hw_23.Base;
public class HomePageTest extends Base {

	@Test(enabled = false, priority = 1)
	public void logoDisplayed() {
		homePage.logoDisplayed();
	}
	@Test (enabled = false, priority = 2 )
	public void  logoDisplayed02 () {
		boolean flagDisplayed = driver.findElement(By.xpath("///a[@class= 'logo']")).isDisplayed();
		System.out.println("Is the logo displayed? Ans: " + flagDisplayed);
	}
	
	@Test(enabled = false, priority = 3)
	public void search () throws InterruptedException {
		homePage.searchTool();
	}
	
	@Test(enabled = false, priority = 4)
	public void location () throws InterruptedException {
		homePage.location();
		}
	
	@Test(enabled = true, priority = 5)
	public void showMenu() throws InterruptedException {
		homePage.showMenu();
	}
	
	@Test (enabled = false, priority = 6)
	public void doctorName() throws InterruptedException {
		homePage.doctor();
	
	}
	@Test(enabled = false, priority = 7)
	public void searchTool02() throws InterruptedException {
		boolean searchToolEnabled = driver.findElement(By.xpath("//button[@class= 'search-button']")).isEnabled();
		System.out.println("Is the Login Button Enable? Ans: " + searchToolEnabled);
		Thread.sleep(4000);
	}
	
	@Test(enabled = false)
	public void getURL() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.id("'header-menu']")).click();
		Thread.sleep(3000);
		System.out.println("This is the current URL of the page:" + driver.getCurrentUrl());

	}
	@Test(enabled = false)
	public void getTitle() {
		System.out.println("The title of the Page is: " + driver.getTitle());
	}
	@Test(enabled = false)
	public void getAttribute() {
		String value01 = driver.findElement(By.xpath("[//a[contains(text(), 'About NYC Health']")).getAttribute("title");
		System.out.println("The value of the id attribute is: " + value01);
		
}
	@Test(enabled = false)
	public void sendKeys() throws InterruptedException {
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id= 'search-input' and @name= 'search']")).sendKeys("sanjeda", Keys.ENTER);
		Thread.sleep(4000);
	}
	@Test(enabled = false)
	public void navigate() throws InterruptedException {
		Thread.sleep(4000);
		driver.navigate().to("https://www.toyota.com/");
		Thread.sleep(4000);
		driver.navigate().back();
		Thread.sleep(4000);
		driver.navigate().forward();
		Thread.sleep(4000);
		driver.navigate().refresh();
		Thread.sleep(4000);
	}
	
	@Test(enabled = false)
	public void setASpecificSizeOfWindow() throws InterruptedException {
		Dimension dimension = new Dimension(800, 500);
		//driver.manage().window().setSize(dimension);
		driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.com");
		Thread.sleep(5000);
		System.out.println("The size of the screen is: "+ driver.manage().window().getSize());
		driver.manage().window().maximize();
		Thread.sleep(5000);
		System.out.println("The size of the screen is: "+ driver.manage().window().getSize());
		Thread.sleep(5000);
		//driver.manage().window().setSize(dimension); 
		Thread.sleep(5000);
		System.out.println("The size of the screen is: "+ driver.manage().window().getSize());
	}
	
}
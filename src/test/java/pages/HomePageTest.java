package pages;

import org.testng.Assert;
import org.testng.annotations.Test;

import hw_23.Base;

import java.awt.Dimension;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
public class HomePageTest extends Base {

	@Test(enabled = false)
	public void logoDisplayed() {
		homePage.logoDisplayed();
	}

	@Test (enabled = true)
	public void  logoDisplayed02 () {
		WebElement logoElement = driver.findElement(By.xpath("//a[@class= 'logo']"));
		boolean flag = logoElement.isDisplayed();
		Assert.assertTrue(true, "Application Logo is not displayed");// passed 
	}
	
	@Test (enabled = false)
	public void  logoDisplayed04 () {
		WebElement logoElement = driver.findElement(By.xpath("//a[@class= 'logo']"));
		boolean flag = logoElement.isDisplayed();
		Assert.assertTrue(false, "Application Logo is not displayed"); // error message will be shown, expect (true) but found false.
	}
	
	@Test (enabled = false)
	public void  logoDisplayed03 () {
		boolean flagDisplayed = driver.findElement(By.xpath("///a[@class= 'logo']")).isDisplayed();
		System.out.println("Is the logo displayed? Ans: " + flagDisplayed);
	}
	
	@Test(enabled = false)
	public void search () throws InterruptedException {
		homePage.searchTool();
	}
	
	@Test(enabled = false)
	public void location () throws InterruptedException {
		homePage.location();
		}
	
	@Test(enabled = false)
	public void showMenu() throws InterruptedException {
		homePage.showMenu();
	}
	
	@Test (enabled = false)
	public void doctorName() throws InterruptedException {
		homePage.doctor();
	
	}
	@Test(enabled = false)
	public void searchTool02() throws InterruptedException {
		boolean searchToolEnabled = driver.findElement(By.xpath("//button[@class= 'search-button']")).isEnabled();
		System.out.println("Is the Login Button Enable? Ans: " + searchToolEnabled);
		Thread.sleep(4000);
	}
	
	@Test(enabled = false)
	public void getURL() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class ='logo']")).click();
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

@Test(enabled = false)
	public void dropdown_selectByIndex_Method() throws InterruptedException {
	//WebElement dropElement= driver.findElement(By.className("goog-te-combo"));
	WebElement dropElement= driver.findElement(By.className("jcf-select jcf-unselectable jcf-select-notranslate jcf-select-language jcf-drop-active"));
	Select select = new Select(dropElement);
	Thread.sleep(3000);
	select.selectByIndex(6);
	Thread.sleep(3000);
	
}

@Test(enabled = false )
public void dropdown_selectByVisisbleText_method () throws InterruptedException {
	WebElement dropElement = driver.findElement(By.className("jcf-select jcf-unselectable jcf-select-notranslate jcf-select-language jcf-drop-active"));
	Select select2 = new Select(dropElement);
	select2.selectByVisibleText("Bengali");
	Thread.sleep(5000);		
}


@Test(enabled=false)
public void dropdown_selectByValue_method () throws InterruptedException {
	WebElement dropElement = driver.findElement(By.name("jcf-select jcf-unselectable jcf-select-notranslate jcf-select-language jcf-drop-active"));
	Select select3 = new Select(dropElement);
	select3.selectByValue("bn");		
	Thread.sleep(5000);
}

@Test (enabled=false)
public void mouseHoverAction() throws InterruptedException {
	Actions actions = new Actions(driver);
	WebElement aboutUs= driver.findElement(By.xpath("//li[@class= 'object menu-item menu-item-type-custom menu-item-object-custom menu-item-3755 has-dropdown']"));
	Thread.sleep(2000);
	actions.moveToElement(aboutUs).build().perform();
	Thread.sleep(6000);	
	System.out.println("\nThe text of this web element is: "+ aboutUs.getText());
	
	
}






}
	

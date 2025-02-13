package pages;
//another base class that other classes will inherit from

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import utils.Links;

public class Page {
	
	public static void main (String [] args) {
		
		
			WebDriver driver = new ChromeDriver();
			driver.get(Links.HOME);
			
			//provide username
			WebElement username = driver.findElement(By.id("user-name"));
			username.isDisplayed();
			username.isEnabled();
			username.sendKeys("standard_user");
			
			//provide password
			WebElement password = driver.findElement(By.id("password"));
			password.isDisplayed();
			password.isEnabled();
			password.sendKeys("secret_sauce");
			
			//provide login button
			WebElement loginButton = driver.findElement(By.id("login-button"));
			loginButton.click();
			
			//find item
			driver.findElement(By.linkText("Sauce Labs Backpack")).click();
			
			//add to cart
			WebElement addToCartButton = driver.findElement(By.id("add-to-cart"));
			addToCartButton.click();
			
			//shopping cart
			WebElement cartButton = driver.findElement(By.id("shopping_cart_container"));
			cartButton.click();
			
			//check out
			WebElement checkOutButton = driver.findElement(By.id("checkout"));
			checkOutButton.click();
			
			//check out first name
			WebElement firstname = driver.findElement(By.id("first-name"));
			firstname.isDisplayed();
			firstname.isEnabled();
			firstname.sendKeys("Fred");
			
			//check out last name
			WebElement lastname = driver.findElement(By.id("last-name"));
			lastname.isDisplayed();
			lastname.isEnabled();
			lastname.sendKeys("Krueger");
			
			//zip code
			WebElement zipcode = driver.findElement(By.id("postal-code"));
			zipcode.isDisplayed();
			zipcode.isEnabled();
			zipcode.sendKeys("12345");
			
			//continue
			WebElement continueButton = driver.findElement(By.id("continue"));
			continueButton.click();
			
			//finish
			WebElement finishButton = driver.findElement(By.id("finish"));
			finishButton.click();
	}
	

}

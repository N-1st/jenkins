package stepDefinations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Lab1Login {
	WebDriver driver;
	
	@Before
	public void driverDetails() {
		driver = new ChromeDriver();
		
	}
	
	@Given("User is an herokuapp page")
	public void user_is_an_herokuapp_page() {
	    // Write code here that turns the phrase above into concrete actions
		driver.get("https://the-internet.herokuapp.com/login");
//	    throw new io.cucumber.java.PendingException();
	}
	@When("User enters {string} and {string} and clicklogin")
	public void user_enters_and_and_clicklogin(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("username")).sendKeys(string);
		driver.findElement(By.id("password")).sendKeys(string2);
		driver.findElement(By.cssSelector(".radius")).click();
//	    throw new io.cucumber.java.PendingException();
	}
	@Then("Message displayed Login Successfully")
	public void message_displayed_login_successfully() {
	    // Write code here that turns the phrase above into concrete actions
		new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".icon-2x.icon-signout")));
//	    throw new io.cucumber.java.PendingException();
		System.out.println("logge din with valid credentials");
	    
	}
	@After
	public void close() {
		driver.close();
	}

}

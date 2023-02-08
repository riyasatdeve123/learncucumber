package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefination {
 public static WebDriver driver;
	@Before
	public void setup()
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
	}
	
	@After
	public void tearDown()
	{
		driver.quit();
	}
	

	@Given("User navigate to OrangeHRM website  {string}")
	public void user_navigate_to_orange_hrm_website(String string) {
	    driver.get(string);
	}

	@And("User is on login page")
	public void user_is_on_login_page() {
	   String expected_title = "OrangeHRM";
	   String actual_title= driver.getTitle();
	   
	   Assert.assertEquals(actual_title, expected_title);
	}

	@When("User enter valid username as {string}")
	public void user_enter_valid_username_as(String string) {
	    driver.findElement(By.xpath("//input[@name='username']")).sendKeys(string);
	}

	@And("User enter valid password as {string}")
	public void user_enter_valid_password_as(String string) {
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(string);
	}

	@And("User click on OrangeHRM login button")
	public void user_click_on_orange_hrm_login_button() {
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@Then("Dash  Board should be displayed")
	public void dash_board_should_be_displayed() {
	   String text = driver.findElement(By.xpath("//h6[text() ='Dashboard']")).getText();
	   System.out.println(text);
	}
}

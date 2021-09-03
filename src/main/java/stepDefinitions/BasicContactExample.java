package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class BasicContactExample {WebDriver driver;
@Before
public void openBrowser() {
	System.setProperty("webdriver.chrome.driver",
			System.getProperty("user.dir") + "\\drivers\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
}
@After
public void closeBrowser() {
	driver.close();
	
	
}
@Given("^User is on homepage of myContactForm$")
public void user_is_on_homepage_of_my_contact_form() {
    driver.get("https://www.mycontactform.com/samples/basiccontact.php");
}
@Then("^enter the \"(.*)\" and \"(.*)\"$")
public void enter_the_and(String name, String email) {
	driver.findElement(By.name("q[1]")).sendKeys(name);
	driver.findElement(By.name("email")).sendKeys(email);
   
}
@Then("^enter the message in the textbox$")
public void enter_the_message_in_the_textbox(){
	driver.findElement(By.name("q[2]")).sendKeys("This is messsage");
		}

@Then("^after giving details submit the form$")
public void after_giving_details_submit_the_form() {
	driver.findElement(By.name("submit")).click();
}



}

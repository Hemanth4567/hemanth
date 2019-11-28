package case_study1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Case_study1 {
	WebDriver driver;
	 
	@Given("Open Site in browser")
	 
	public void site() {
	 
	System.setProperty("webdriver.chrome.driver","src/test/resources/Drivers/chromedriver.exe");
	 
	driver =new ChromeDriver();
	 
	driver.manage().window().maximize();
	 
	driver.get("http://10.232.237.143:443/TestMeApp/");
	 
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


	 
	driver.findElement(By.partialLinkText("SignUp")).click();

	}
	 
	@And("Click on Sign up and fill Registeration Details")
	 
	public void Details() {
	 
	driver.findElement(By.id("userName"));


	 
	Actions act1=new Actions(driver);
	 
	driver.findElement(By.id("userName")).sendKeys("Amrit3129");
	 
	driver.findElement(By.id("firstName")).click();
	 
	WebDriverWait wait=new WebDriverWait(driver,10);
	 
	wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("err"))));
	 
	String name1=driver.findElement(By.id("err")).getText();
	 
	System.out.println(name1);
	 
	Assert.assertEquals(name1, "Available");


	 
	driver.findElement(By.id("firstName")).sendKeys("Amit");
	 
	driver.findElement(By.id("lastName")).sendKeys("Singh");


	 
	driver.findElement(By.id("password")).sendKeys("Amit123");
	 
	driver.findElement(By.id("pass_confirmation")).sendKeys("Amit123");


	 
	driver.findElement(By.cssSelector("input[value='Male']")).click();
	 
	driver.findElement(By.id("emailAddress")).sendKeys("Amit123@email.com");


	 
	driver.findElement(By.id("mobileNumber")).sendKeys("8210456491");


	 
	driver.findElement(By.cssSelector("img[src='images/calendar.png']")).click();
	 
	Assert.assertTrue(driver.findElement(By.id("ui-datepicker-div")).isDisplayed());


	 
	driver.findElement(By.className("ui-datepicker-month")).click();
	 
	Select month=new Select(driver.findElement(By.className("ui-datepicker-month")));
	 
	month.selectByVisibleText("Aug");
	 
	driver.findElement(By.className("ui-datepicker-year")).click();
	 
	Select year=new Select(driver.findElement(By.className("ui-datepicker-year")));
	 
	year.selectByVisibleText("1997");
	 
	driver.findElement(By.linkText("8")).click();
	 
	driver.findElement(By.id("address")).sendKeys("RajputColony");
	 
	driver.findElement(By.id("securityQuestion")).click();
	 
	Select question=new Select(driver.findElement(By.id("securityQuestion")));
	 
	question.selectByVisibleText("What is your Nick Name?");
	 
	driver.findElement(By.id("answer")).sendKeys("amy");

	}
	 
	@When("I click on Register")
	 
	public void click() {
	 
	driver.findElement(By.xpath("//input[@value='Register']")).click();

	}
	 
	@Then("Validity is shown")
	 
	public void validation() {
	 
	String res=driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[8]")).getText();
	 
	System.out.println(res);
	 
	Assert.assertEquals(res, "User Registered Succesfully!!! Please login");

	}
	 
	@And("Close")
	 
	public void browserClose() {
	 
	driver.quit();

	}
}

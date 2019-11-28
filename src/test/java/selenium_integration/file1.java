package selenium_integration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class file1 {
	
	public WebDriver browser;
	
	//WebDriver driver=new ChromeDriver();
	
	@Given("Load the firefox driver jar")
	public void method1()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Training_b6b.00.07\\eclipse-workspace\\hemanth\\src\\test\\resources\\Drivers\\chromedriver.exe");
	}
    @And("create object and open testme_app")
    public void method2()
    {
    	browser=new ChromeDriver();
    	browser.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
    	
    }
    @Then("maximize the window")
    public void method3()
    {
    	browser.manage().window().maximize();
    }
    @And("click the signin link")
    public void method4()
    {
    	browser.findElement(By.linkText("SignIn")).click();
    }
    
    @Then("Enter the username in the username field")
    public void method5()
    {
    	browser.findElement(By.id("userName")).sendKeys("Lalitha");
        //driver.findElement(By.id("userName")).sendKeys("Hemanth5");
    }
    @And("Enter the password in the password field")
    public void method6()
    {
    	browser.findElement(By.id("password")).sendKeys("Password123");
    }
    @And("click the Login button")
    public void method7()
    {
    	browser.findElement(By.name("Login")).click();
    }
    @Then("click on signout link")
    public void method8()
    {
    	browser.findElement(By.linkText("SignOut")).click();
    }
    @And("close the chrome browser")
    public void method9()
    {
    	browser.close();
    }

}

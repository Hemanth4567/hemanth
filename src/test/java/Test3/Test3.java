package Test3;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test3 {
	
	@Given("I enter 20 in the calculator")
	public void I_enter_20_in_the_calculator()
	{
		System.out.println("I enter 20 in the calculator");
	}
    @And("I press add")
    public void I_press_add()
    {
    	System.out.println("I press add");
    }
    @Then("I have entered 20 in the calculator")
    public void I_have_entered_20_in_the_calculator()
    {
    	System.out.println("I have entered 20 in the calculator");
    }
    @When("I press equal symbol")
    public void I_press_equal_symbol()
    {
    	System.out.println("I press equal symbol");
    }
    @Then("The result should be 40 in the screen")
    public void The_result_should_be_40_in_the_screen()
    {
    	System.out.println("The result should be 40 in the screen");
    }
    
    
    @Given("I enter 200 in the calculator")
	public void I_enter_200_in_the_calculator()
	{
		System.out.println("I enter 200 in the calculator");
	}
    @And("I press subtract")
    public void I_press_subtract()
    {
    	System.out.println("I press subtract");
    }
    @Then("I have entered 50 in the calculator")
    public void I_have_entered_50_in_the_calculator()
    {
    	System.out.println("I have entered 50 in the calculator");
    }
    @When("I press equal symbol1")
    public void I_press_equal_symbol1()
    {
    	System.out.println("I press equal symbol");
    }
    @Then("The result should be 150 in the screen")
    public void The_result_should_be_150_in_the_screen()
    {
    	System.out.println("The result should be 150 in the screen");
    }
}
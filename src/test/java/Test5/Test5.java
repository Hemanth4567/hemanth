package Test5;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test5 {
	@Given("^I enter \"([0-9]+)\" in the calculator$")
	public void I_enter_20_in_the_calculator(int num)
	{
		System.out.println("I enter "+num+" in the calculator");
	}
    @And("^I press \"([a-zA-Z]{1,})\"$")
    public void I_press_add(String operator )
    {
    	System.out.println("I press "+operator);
    }
	
    @Then("^I have entered \"([0-9]+)\" in the calculator$")
    public void I_have_entered_20_in_the_calculator(int num)
    {
    	System.out.println("I have entered "+num+" in the calculator");
    }
    @When("^I press \"([a-zA-Z]{1,})\" symbol$")
    public void I_press_equal_symbol(String operator)
    {
    	System.out.println("I press "+operator+" symbol");
    }
    @Then("^The result should be \"([0-9]+)\" in the screen$")
    public void The_result_should_be_40_in_the_screen(int num)
    {
    	System.out.println("The result "+num+" should display in the screen");
    }

}

package Test4;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test4 {
	@Given("^I enter [0-9]+ in the calculator$")
	public void I_enter_20_in_the_calculator()
	{
		System.out.println("I enter 1St number in the calculator");
	}
    @And("^I press [a-zA-Z]+$")
    public void I_press_add()
    {
    	System.out.println("I press add");
    }
	
    @Then("^I have entered [0-9]+ in the calculator$")
    public void I_have_entered_20_in_the_calculator()
    {
    	System.out.println("I have entered 2nd number in the calculator");
    }
    @When("^I press equal symbol$")
    public void I_press_equal_symbol()
    {
    	System.out.println("I press equal symbol");
    }
    @Then("^The result should be [0-9]+ in the screen$")
    public void The_result_should_be_40_in_the_screen()
    {
    	System.out.println("The result should display in the screen");
    }
}

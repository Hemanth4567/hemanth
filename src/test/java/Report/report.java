package Report;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class report {
	@Given("I am a {word} tester")
	public void I_am_a_good_developer(String word)
	{
		System.out.println("**********************");
		System.out.println("I am a "+word+" tester");
	}
	@When("I go to work")
	public void I_go_to_work()
	{
		System.out.println("I go to work");
	}
	@Then("I {word} it")
	public void I_completes_it_up(String word)
	{
		System.out.println("I "+word+" it up");
	}
	@And("My boss {word} me")
	public void My_boss_salutes_me(String word)
	{
		System.out.println("My boss "+word+" me");
	}
	@But("The developer {word} me")
	public void The_tester_hates_me(String word)
	{
		System.out.println("The developer "+word+" me");
	}
}

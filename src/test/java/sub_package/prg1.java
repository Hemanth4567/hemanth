package sub_package;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class prg1 {
	@Given("I am a {word} developer")
	public void I_am_a_good_developer(String s)
	{
		//System.out.println("**********************");
		System.out.println("I am a "+s+" developer");
	}
	@When("I go to {word}")
	public void I_go_to_work(String s)
	{
		System.out.println("I go to "+s+"");
	}
	@Then("I {word} it {word}")
	public void I_completes_it_up(String s1,String s2)
	{
		System.out.println("I "+s1+" it "+s2+"");
	}
	@And("My boss {word} {word}")
	public void My_boss_salutes_me(String s1,String s2)
	{
		System.out.println("My boss "+s1+" "+s2+"");
	}
	@But("The tester {word} {word}")
	public void The_tester_hates_me(String s1,String s2)
	{
		System.out.println("The tester "+s1+" "+s2+"");
	}
	
}

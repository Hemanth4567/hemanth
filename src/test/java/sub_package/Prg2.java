package sub_package;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Prg2 {
	@Given("I am a {word} tester")
	public void I_am_a_good_tester(String s)
	{
		System.out.println("**********************");
		System.out.println("I am a "+s+" tester");
	}
	@When("I go to {word}")
	public void I_go_to_work(String s)
	{
		System.out.println("I go to "+s+"");
	}
	@Then("I mess it {word}")
	public void I_completes_it_up(String s1)
	{
		System.out.println("I mess it up");
	}
	@And("My boss fires {word}")
	public void My_boss_salutes_me(String s)
	{
		System.out.println("My boss fires me");
	}
	@But("The developer {word} {word}")
	public void The_tester_hates_me(String s1,String s2)
	{
		System.out.println("The developer "+s1+" "+s2+"");
	}
}

package seperate_execution;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class seperate {
	
	  @Given("I am a good developer") public void I_am_a_good_developer() {
	  System.out.println("**********************");
	  System.out.println("I am a good developer"); }
	  
	  @When("I go to work") public void I_go_to_work() {
	  System.out.println("I go to work"); }
	  
	  @Then("I completes it up") public void I_completes_it_up() {
	  System.out.println("I completes it up"); }
	  
	  @And("My boss salutes me") public void My_boss_salutes_me() {
	  System.out.println("My boss salutes me"); }
	  
	  @But("The tester hates me") public void The_tester_hates_me() {
	  System.out.println("The tester hates me"); }
	 
	
	
	  @Given("I am a bad developer") public void I_am_a_bad_developer() {
	  System.out.println("I am a bad developer"); }
	  
	  @When("I go to work1") public void I_go_to_work1() {
	  System.out.println("I go to work"); }
	  
	  @Then("I mess it up") public void I_mess_it_up() {
	  System.out.println("I mess it up"); }
	  
	  @And("My boss fires me") public void My_boss_fires_me() {
	  System.out.println("My boss fires me"); }
	  
	  @But("The tester likes me") public void The_tester_likes_me() {
	  System.out.println("The tester likes me");
	  System.out.println("**********************"); }
	  
	 

}

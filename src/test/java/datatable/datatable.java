package datatable;

import java.util.List;
import java.util.Map;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class datatable {
	
	@Given("There are {word} fruits")
	public void step1(String f, DataTable t)
	{
        List<Map<String,String>> data=t.asMaps(String.class, String.class);
		
		System.out.println("There are "+f+" fruits with "+data.get(0).get("with")); 
		System.out.println("There are "+f+" fruits with "+data.get(1).get("with")); 
		System.out.println("There are "+f+" fruits with "+data.get(2).get("with")); 
	}
	@When("I eat {int} fruits")
	public void step2(int n)
	{
		System.out.println("I eat "+n+" fruits");
	}
	@Then("I have {int} fruits")
	public void step3(int n1)
	{
		System.out.println("I have "+n1+" fruits");
	}
}

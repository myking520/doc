package jbehave.myking520.github.junit.steps.ls2;

import org.jbehave.core.annotations.Alias;
import org.jbehave.core.annotations.Aliases;
import org.jbehave.core.annotations.Composite;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Pending;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class S2Step {
	@Given("a pen")
	@Composite(steps={"When an apple","Then pineapple"})
	public void pen(){
		System.out.println("I have a pen");
	}
	
	@When("an apple")
	@Aliases(values={"a big apple","a small apple"})
	public void apple(){
		System.out.println("I have an apple");
	}
	@Then("pineapple")
	public void pineapple(){
		System.out.println("I have pineapple");
	}
	@Pending
	public void eat(){
		
	}
}

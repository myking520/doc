package jbehave.myking520.github.junit.steps.ls1;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;

public class S1Step {
	@Given("a pen")
	public void pen(){
		System.out.println("I have a pen");
	}
	@Given("an apple")
	public void apple(){
		System.out.println("I have an apple");
	}
	@Then("pineapple")
	public void pineapple(){
		System.out.println("I have pineapple");
	}
}

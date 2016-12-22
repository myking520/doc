package jbehave.myking520.github.junit.steps.ls3;

import org.jbehave.core.annotations.When;

public class S3Step {
	@When("the {item |}{price|cost} is $price")
	public void theItemPriceIs(double price) {
	   System.out.println(price);
	}
}

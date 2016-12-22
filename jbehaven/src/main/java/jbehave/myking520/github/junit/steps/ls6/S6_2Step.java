package jbehave.myking520.github.junit.steps.ls6;

import org.jbehave.core.annotations.Alias;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class S6_2Step {
	@Given("a stock of symbol $symbol and a threshold of $threshold") // standalone

	@Alias("a stock of <symbol> and a <threshold>") // examples table

	public void aStock(@Named("symbol") String symbol, @Named("threshold") double threshold) {
		System.out.println("分隔符----------------------------");
		System.out.println(symbol+"--->"+threshold);
	}
	@When("the stock is traded at $price")
	public void traded(@Named("price") double price){
		System.out.println("traded-->"+price);
	}
	@Then("the alert status should be $status")
	public void state(String status){
		System.out.println("status--->"+status);
	}
}

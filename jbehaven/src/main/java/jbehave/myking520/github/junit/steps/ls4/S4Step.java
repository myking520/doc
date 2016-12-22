package jbehave.myking520.github.junit.steps.ls4;

import org.jbehave.core.annotations.Given;

public class S4Step {
	@Given("a stock of symbol $symbol and a threshold of $threshold")
	public void aStock(String sym2bol, double threshold) {
	  System.out.println(sym2bol+"-->"+threshold);
	}
}

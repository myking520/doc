package jbehave.myking520.github.junit.steps.ls6;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;

public class S6_3Step {
	@Given("a stock of symbol <symbol> and a threshold of <threshold>") // standalone
	public void aStock(@Named("symbol") String symbol, @Named("threshold") double threshold) {
		System.out.println(symbol+"--->"+threshold);
	}
	
}

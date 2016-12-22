package jbehave.myking520.github.junit.steps.ls5;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;

public class S5Step {
	@Given("a stock of symbol $symbol and a threshold of $threshold")
	public void aStock(@Named("symbol") String aSymbol, @Named("threshold") double aThreshold) {
	    System.out.println(aSymbol+"---->"+aThreshold);
	}
}

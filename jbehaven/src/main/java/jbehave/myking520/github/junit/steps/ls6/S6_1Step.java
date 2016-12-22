package jbehave.myking520.github.junit.steps.ls6;

import java.util.Arrays;
import java.util.List;

import org.jbehave.core.annotations.Given;

public class S6_1Step {
	@Given("a stock of symbols $symbols and thresholds of  $thresholds")
	public void aStock(List<String> symbols, List<Double> thresholds) {
		
		System.out.println(Arrays.toString(symbols.toArray(new String[symbols.size()]))+"-->"+Arrays.toString(thresholds.toArray(new Double[thresholds.size()])));
	}
}

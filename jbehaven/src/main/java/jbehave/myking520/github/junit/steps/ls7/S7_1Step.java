package jbehave.myking520.github.junit.steps.ls7;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.model.ExamplesTable;

public class S7_1Step {
	@Given("that Larry has done <trades> trades")
	public void dotraders(@Named("trades")String trade){
		System.out.println(trade);
	}
	@Then("the traders activity is: $table")
	public void theTraders(ExamplesTable table) {
		System.out.println("--------------theTraders-----------------------");
		  boolean replaceNamedParameters = true;
		    int trades = table.getRowAsParameters(0, replaceNamedParameters).valueAs("trades", int.class);
		    System.out.println(trades);
	}

	
}

package jbehave.myking520.github.junit.steps.ls7;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.model.ExamplesTable;

public class S7Step {
	
	@Given("the traders: $ranksTable")

	public void theTraders(ExamplesTable ranksTable) {
		System.out.println("--------------------theTraders----------------");
		 List traders= toTraders(ranksTable);
	}
	private List toTraders(ExamplesTable table) {

	    List traders = new ArrayList();

	    for (Map<String,String> row : table.getRows()) {

	        String name = row.get("name");

	        String rank = row.get("rank");
	        System.out.println(name+"-->"+rank);
	    }

	    return traders;

	}
	
}

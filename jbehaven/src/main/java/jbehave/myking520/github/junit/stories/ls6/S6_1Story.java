package jbehave.myking520.github.junit.stories.ls6;

import java.util.ArrayList;
import java.util.List;

import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.junit.JUnitStory;
import org.jbehave.core.steps.InjectableStepsFactory;
import org.jbehave.core.steps.InstanceStepsFactory;
import org.jbehave.core.steps.ParameterConverters;
import org.jbehave.core.steps.ParameterConverters.NumberListConverter;
import org.jbehave.core.steps.ParameterConverters.ParameterConverter;
import org.jbehave.core.steps.ParameterConverters.StringListConverter;

import jbehave.myking520.github.junit.steps.ls6.S6_1Step;

public class S6_1Story extends JUnitStory{
	@Override
	public InjectableStepsFactory stepsFactory() {
		return new InstanceStepsFactory(this.configuration(),new S6_1Step());
	}

	@Override
	public Configuration configuration() {
		Configuration configuration = new MostUsefulConfiguration()

	            .useParameterConverters(

	                    new ParameterConverters().addConverters(customConverters()));

	    return configuration;
	}
	private ParameterConverter[] customConverters() {

	    List<ParameterConverter> converters = new ArrayList<ParameterConverter>();
	   	converters.add(new StringListConverter());
	    converters.add(new NumberListConverter());
	    return converters.toArray(new ParameterConverter[converters.size()]);

	}
}

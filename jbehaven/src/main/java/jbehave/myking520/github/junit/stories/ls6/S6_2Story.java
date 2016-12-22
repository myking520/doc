package jbehave.myking520.github.junit.stories.ls6;

import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.junit.JUnitStory;
import org.jbehave.core.steps.InjectableStepsFactory;
import org.jbehave.core.steps.InstanceStepsFactory;

import jbehave.myking520.github.junit.steps.ls6.S6_2Step;

public class S6_2Story extends JUnitStory{
	@Override
	public InjectableStepsFactory stepsFactory() {
		return new InstanceStepsFactory(this.configuration(),new S6_2Step());
	}

	@Override
	public Configuration configuration() {
		Configuration configuration = new MostUsefulConfiguration();
	    return configuration;
	}

}

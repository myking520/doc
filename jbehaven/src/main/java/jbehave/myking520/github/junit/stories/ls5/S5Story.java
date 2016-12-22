package jbehave.myking520.github.junit.stories.ls5;

import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.junit.JUnitStory;
import org.jbehave.core.steps.InjectableStepsFactory;
import org.jbehave.core.steps.InstanceStepsFactory;

import jbehave.myking520.github.junit.steps.ls5.S5Step;

public class S5Story extends JUnitStory{
	@Override
	public InjectableStepsFactory stepsFactory() {
		return new InstanceStepsFactory(this.configuration(),new S5Step());
	}

	@Override
	public Configuration configuration() {
		return new MostUsefulConfiguration();
	}
}

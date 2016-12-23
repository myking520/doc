package jbehave.myking520.github.junit.stories.ls7;

import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.junit.JUnitStory;
import org.jbehave.core.steps.InjectableStepsFactory;
import org.jbehave.core.steps.InstanceStepsFactory;

import jbehave.myking520.github.junit.steps.ls7.S7_1Step;

public class S7_1Story extends JUnitStory{
	@Override
	public InjectableStepsFactory stepsFactory() {
		return new InstanceStepsFactory(this.configuration(),new S7_1Step());
	}

	@Override
	public Configuration configuration() {
		MostUsefulConfiguration c= new MostUsefulConfiguration();
		return c;
	}
}

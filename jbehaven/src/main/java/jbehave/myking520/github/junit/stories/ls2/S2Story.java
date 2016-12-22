package jbehave.myking520.github.junit.stories.ls2;

import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.junit.JUnitStory;
import org.jbehave.core.steps.InjectableStepsFactory;
import org.jbehave.core.steps.InstanceStepsFactory;

import jbehave.myking520.github.junit.steps.ls2.S2Step;

public class S2Story extends JUnitStory{
	@Override
	public InjectableStepsFactory stepsFactory() {
		return new InstanceStepsFactory(this.configuration(),new S2Step());
	}

	@Override
	public Configuration configuration() {
		return new MostUsefulConfiguration();
	}
}

package jbehave.myking520.github.junit.stories.ls1;

import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.junit.JUnitStory;
import org.jbehave.core.steps.InjectableStepsFactory;
import org.jbehave.core.steps.InstanceStepsFactory;

import jbehave.myking520.github.junit.steps.ls1.S1Step;

public class S1Story extends JUnitStory{
	@Override
	public InjectableStepsFactory stepsFactory() {
		return new InstanceStepsFactory(this.configuration(),new S1Step());
	}

	@Override
	public Configuration configuration() {
		return new MostUsefulConfiguration();
	}
}

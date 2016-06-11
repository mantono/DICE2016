package dice.b1.enums;

import dice.b1.NameFormatter;

public enum Infamy implements NameFormatter
{
	NICE, UGLY, PRETTY, AWESOME, ANXIOUS, WRECKLESS, TIRED, CRAZY, THOUGHTFUL, RESTLESS;
	
	@Override
	public String toString()
	{
		return "The " + capitalize();
	}

	
}

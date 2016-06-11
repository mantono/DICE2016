package dice.b1.enums;

import dice.b1.NameFormatter;

public enum Title implements NameFormatter
{
	DOCTOR, MISTER, MISS, MISSIS, PROFESSOR, PROGRAMMER, BUS_DRIVER, SALESMAN, NINJA, ROCK_STAR;
	
	public String toString()
	{
		return withSpaces(capitalize());
	}
}

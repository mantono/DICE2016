package dice.b1.enums;

import dice.b1.NameFormatter;

public enum Origin implements NameFormatter
{
	KNIVSÖDER, LAPPLAND, SKÅNE, GERMANY, SVEG, KILSMO, UNDERJORDEN, FJÄLLEN, GLASGOW, MORROWIN, STOCKHOLM;
	
	public String toString()
	{
		return "of " + capitalize();
	}
}

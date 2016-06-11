package dice.b1.enums;

import dice.b1.NameFormatter;

public enum LastName implements NameFormatter
{
	LOVELACE, DIJSKTRA, TURING, KNUTH, BABBAGE, TORVALDS, BERNERS_LEE, THOMPSON, VAN_ROSSUM, GOSLING, GATES;
	
	public String toString()
	{
		return withSpaces(capitalize());
	}
}

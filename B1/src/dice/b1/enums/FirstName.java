package dice.b1.enums;

import dice.b1.NameFormatter;

public enum FirstName implements NameFormatter
{
	ADA, EDGAR, ALAN, DONALD, CHARLES, LINUS, JAMES, BILL, GUIDO, KEN, TIM;
	
	public String toString()
	{
		return capitalize();
	}
}

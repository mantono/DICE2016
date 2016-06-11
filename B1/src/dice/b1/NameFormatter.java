package dice.b1;

public interface NameFormatter
{	
	default String capitalize()
	{
		String input = name();
		input = input.toLowerCase();
		char first = input.charAt(0);
		first = Character.toUpperCase(first);
		final String capitalized = first + input.substring(1, input.length());
		return capitalized;
	}
	
	default String withSpaces(String input)
	{
		return input.replaceAll("_", " ");
	}
	
	String name();
}

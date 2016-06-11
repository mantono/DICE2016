package dice.b1;

import java.security.SecureRandom;
import java.util.Random;

import dice.b1.enums.FirstName;
import dice.b1.enums.Infamy;
import dice.b1.enums.LastName;
import dice.b1.enums.Origin;
import dice.b1.enums.Title;

public class NameRandomizer {

	/**
	 * Generate a random name with
	 * <ol>
	 * 		<li>Infamy</li>
	 * 		<li>Title</li>
	 * 		<li>First Name</li>
	 * 		<li>Last Name</li>
	 * 		<li>Title</li>
	 * </ol>
	 * @param args Not read
	 */
	public static void main(String[] args)
	{
		Random rand = new SecureRandom();
		
		String[] fullName = new String[5];
		int i = 0;
		
		fullName[i++] = getRandEnum(Infamy.class, rand);
		fullName[i++] = getRandEnum(Title.class, rand);
		fullName[i++] = getRandEnum(FirstName.class, rand);
		fullName[i++] = getRandEnum(LastName.class, rand);
		fullName[i++] = getRandEnum(Origin.class, rand);
		
		for(String namePart : fullName)
			System.out.print(namePart + " ");
	}

	private static String getRandEnum(Class<? extends Enum<?>> enumClass, Random rand)
	{
		final Enum<?>[] enums = enumClass.getEnumConstants();
		final int max = enums.length;
		assert max >= 10 : "All enums must be at least ten elements, you lazy fuck... (Hint: " + enumClass.getCanonicalName() + ")";
		final int index = rand.nextInt(max);
		final Enum<?> foundEnum = enums[index];
		return foundEnum.toString();
	}

}

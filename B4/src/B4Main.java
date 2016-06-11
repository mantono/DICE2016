import java.io.IOException;
import java.nio.file.Paths;

/**
 * Created by Taco on 2016-06-11.
 */
public class B4Main {
    public static void main(String[] args) {
    	final int size = 100_000;
        GenerateIntegers generateIntegers = new GenerateIntegers();
        generateIntegers.generate(size);

        BigFileSorter bigFileSorter = new BigFileSorter(size);
        try {
            bigFileSorter.sort(Paths.get("input.txt"));
        } catch (IOException e ) {
            e.printStackTrace();
        }

    }
}

import java.io.IOException;
import java.nio.file.Paths;

/**
 * Created by Taco on 2016-06-11.
 */
public class B4Main {
    public static void main(String[] args) {
        GenerateIntegers generateIntegers = new GenerateIntegers();
        generateIntegers.generate();

        BigFileSorter bigFileSorter = new BigFileSorter(100_000);
        try {
            bigFileSorter.sort(Paths.get("output.txt"));
        } catch (IOException e ) {
            e.printStackTrace();
        }

    }
}

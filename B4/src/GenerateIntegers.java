import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Taco on 2016-06-11.
 */
public class GenerateIntegers {


    public void generate() {
        try {
            Random random = new Random();
            FileWriter writer = new FileWriter("output.txt");
            for (int i = 0; i < 100000; i++) {
                writer.write(random.nextInt(Integer.MAX_VALUE) + "\n");
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

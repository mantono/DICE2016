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
        try (FileWriter writer = new FileWriter("output.txt")){
            Random random = new Random();
            
            for (int i = 0; i < 100000; i++) {
                writer.write(random.nextInt(Integer.MAX_VALUE) + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Taco on 2016-06-11.
 */
public class SetIO {

    public static void write(Set<Integer> integers, String filePath) throws IOException {
        FileWriter writer = new FileWriter(filePath);
        for (Integer integer : integers) {

            writer.write(integer + "\n");
        }
        writer.close();
    }

    public static List<Integer> read(int numberOfInts, String filePath) throws IOException {
        List<Integer> ret = new ArrayList<>();
        Kattio kattio = new Kattio(new FileInputStream(filePath));
        for (int i = 0; i < numberOfInts; i++) {
            ret.add(kattio.getInt());
        }
        return ret;
    }

    public static List<Integer> read(int numberOfInts, int startLine, String filePath) throws IOException {
        List<Integer> ret = new ArrayList<>();
        Kattio kattio = new Kattio(new FileInputStream(filePath));
        for (int i = 0; i < startLine; i++) {
            kattio.getInt();
        }

        for (int i = 0; i < numberOfInts; i++) {
            ret.add(kattio.getInt());
        }
        return ret;
    }
}

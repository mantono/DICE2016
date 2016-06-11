import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Taco on 2016-06-11.
 */
public class SetIO {

    public static void append(List<Integer> integers, String filePath) throws IOException {
        PrintWriter pw = new PrintWriter(new FileOutputStream(
                new File(filePath),
                true ));
        for (Integer integer : integers) {

            pw.append(integer + "\n");
        }
        pw.close();
    }

    public static void write(Set<Integer> integers, String filePath) throws IOException {
        FileWriter writer = new FileWriter(filePath);
        for (Integer integer : integers) {

            writer.write(integer + "\n");
        }
        writer.close();
    }


    public static Bucket createFiles(int numberOfInts, int fileNumber, String filePath) throws IOException {
        Bucket bucket = new Bucket(
        		fileNumber);
        Kattio kattio = new Kattio(new FileInputStream(filePath));
        for (int i = 0; i < numberOfInts; i++) {
            bucket.add(kattio.getInt());
        }
        return bucket;
    }

    public static Bucket read(int numberOfInts, Bucket bucket, String filePath) throws IOException {
        Kattio kattio = new Kattio(new FileInputStream(filePath));
        for (int i = 0; i < bucket.currentLine(); i++) {
            if(kattio.hasMoreTokens())
                kattio.getInt();
            else
                break;
        }

        for (int i = 0; i < numberOfInts; i++) {
        	if(kattio.hasMoreTokens())
        		bucket.add(kattio.getInt());
        	else
        		break;
        }
        return bucket;
    }
}

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Created by Taco on 2016-06-11.
 */
public class Main {

    public static void main(String[] args) throws IOException {
        Kattio kattio = new Kattio(new FileInputStream("output.txt"));
        SortedSet<Integer> integers = new TreeSet<>();
        while(kattio.hasMoreTokens()){
            integers.add(kattio.getInt());
        }
        System.out.println(integers.first()+ "   " + integers.last() );
    }
}

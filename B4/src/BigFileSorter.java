import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.util.*;

/**
 * Created by Taco on 2016-06-11.
 */
public class BigFileSorter {

    private PriorityQueue<Bucket> buckets = new PriorityQueue<Bucket>(new ListSorter());
    private List<Integer> output = new ArrayList<>();

    public BigFileSorter() {
        for (int i = 0; i < 9; i++) {
            buckets.add(new Bucket(0,i));
        }
    }

    public void sort(Path path) throws IOException {
        readAndSortToFiles(path);
        initBuckets();
        mergeSort();
    }

    //TODO mergeSort
    private void mergeSort() throws IOException {

        Bucket bucket = buckets.poll();
        System.out.println(bucket);
    }

    private Bucket loadBucket(Bucket bucket) throws IOException {

        bucket.addOneToBucketNumber();
        List<Integer> next1000Integers = SetIO.read(1000, bucket.getNumber() * 1000, bucket.getBucketNumber() + ".txt");
        bucket.addAllnext1000Integers;
        return bucket;
    }

    private void initBuckets() throws IOException {
        int i = 0;
        for (Bucket bucket : buckets) {
            bucket.setIntegers(SetIO.read(1000, i + ".txt"));
        }
    }

    private void readAndSortToFiles(Path path) throws IOException {
        Set<Integer> integers = new TreeSet<>();

        Kattio kattio = new Kattio(new FileInputStream(path.toString()));
        for (int i = 0; i < 10; i++) {

            integers.addAll(SetIO.read(10000,i*10000, "output.txt"));
            SetIO.write(integers, i + ".txt");
            integers.clear();
        }

    }
}

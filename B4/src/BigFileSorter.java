import dice.b4.ListSorter;

import java.io.IOException;
import java.nio.file.Path;
import java.util.*;

/**
 * Created by Taco on 2016-06-11.
 */
public class BigFileSorter {

    public static final int MAX_MEMORY = 1024 * 10;
    private final int amountOfLists, listSize, dataSize, intLimit;
    private PriorityQueue<Bucket> bucketQueue = new PriorityQueue<Bucket>(new ListSorter());
    private List<Integer> output = new ArrayList<>();

    public BigFileSorter(final int dataSize) {
        this.dataSize = dataSize;
        this.intLimit = MAX_MEMORY / (Integer.SIZE / Byte.SIZE);
        final double lists = (dataSize / (double) intLimit);
        this.amountOfLists = (int) Math.ceil(lists) + 1;

        this.listSize = intLimit / amountOfLists;
    }

    public void sort(Path path) throws IOException {
        readAndSortToFiles(path);
        initBuckets();
        mergeSort();
    }

    //TODO mergeSort
    private void mergeSort() throws IOException {
        while (!bucketQueue.peek().isEmpty()) {
            Bucket bucket = bucketQueue.poll();
            output.add(bucket.remove(0));

            if (output.size() == listSize) {
                SetIO.append(output, "SortedFile.txt");
                output.clear();
            }

            if (bucket.isEmpty()) {
                loadBucket(bucket);
            }

            bucketQueue.add(bucket);

        }
    }

    private Bucket loadBucket(Bucket bucket) throws IOException {
        if (bucket.getFileNumber() > amountOfLists - 1) {
            return SetIO.read(listSize, bucket.getFileNumber() * listSize, bucket.getBucketNumber(), bucket.getBucketNumber() + ".txt");
        } else {
            return new Bucket(0, 0);
        }
    }

    private void initBuckets() throws IOException {

        for (int j = 0; j < amountOfLists - 1; j++) {

            bucketQueue.add(SetIO.read(listSize, j, j + ".txt"));
        }
    }

    private void readAndSortToFiles(Path path) throws IOException {
        Set<Integer> integers = new TreeSet<>();


        for (int i = 0; i < amountOfLists - 1; i++) {

            integers.addAll(SetIO.read(intLimit, i * intLimit, i, path.toString()));
            SetIO.write(integers, i + ".txt");
            integers.clear();
        }

    }
}

import java.util.ArrayList;

/**
 * Created by Taco on 2016-06-11.
 */
public class Bucket extends ArrayList<Integer>{
    private int bucketNumber;
    private int fileNumber;


    public Bucket(int fileNumber,int bucketNumber) {
        this.fileNumber = fileNumber;

        this.bucketNumber = bucketNumber;
    }

    public int getBucketNumber(){
        return bucketNumber;
    }

    public int getFileNumber() {
        return fileNumber;
    }

    public void addOneToBucketNumber() {
        fileNumber++;
    }



    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        for(Integer integer : this){
            stringBuffer.append(integer +"\n");
        }
        return stringBuffer.toString();
    }


}

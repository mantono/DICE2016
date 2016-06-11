import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Created by Taco on 2016-06-11.
 */
public class Bucket extends ArrayList<Integer>{
    private int bucketNumber;
    private int number;


    public Bucket(int number,int bucketNumber) {
        this.number = number;

        this.bucketNumber = bucketNumber;
    }

    public int getBucketNumber(){
        return bucketNumber;
    }

    public int getNumber() {
        return number;
    }

    public void addOneToBucketNumber() {
        number++;
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

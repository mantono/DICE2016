import java.util.ArrayList;

/**
 * Created by Taco on 2016-06-11.
 */
public class Bucket extends ArrayList<Integer>{
    private final int fileNumber;
    private int currentLine = 0;

    public Bucket(int fileNumber) {
        this.fileNumber = fileNumber;
    }

    public Bucket(Bucket bucket) {
		this.fileNumber = bucket.fileNumber;
		this.currentLine = bucket.currentLine;
	}

	public int getFileNumber() {
        return fileNumber;
    }
    
    public int currentLine()
    {
    	return currentLine;
    }
    
    @Override
    public boolean add(Integer index)
    {
    	if(super.add(index))
    		currentLine++;
    	return true;
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

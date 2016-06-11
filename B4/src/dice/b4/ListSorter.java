package dice.b4;

import java.util.Comparator;
import java.util.List;

public class ListSorter implements Comparator<List<Integer>>
{
	@Override
	public int compare(List<Integer> e1, List<Integer> e2)
	{
		if(e1.isEmpty() && e2.isEmpty())
			return 0;
		if(e1.isEmpty() && !e2.isEmpty())
			return 1;
		if(!e1.isEmpty() && e2.isEmpty())
			return -1;
		final int elementFirstList = e1.get(0);
		final int elementSecondList = e2.get(0);
		
		if(elementFirstList == elementSecondList)
			return 0;
		return elementFirstList - elementSecondList;
	}
	
}

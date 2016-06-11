package dice.b4;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

import org.junit.Test;

public class ListSorterTest {

	@Test
	public void test()
	{
		List<Integer> first = new ArrayList<Integer>(4);
		List<Integer> second = new ArrayList<Integer>(4);


		first.add(0);
		first.add(1);
		first.add(2);
		first.add(3);

		assertEquals(4, first.size());
		
		second.add(2);
		second.add(3);
		second.add(4);
		second.add(5);

		assertEquals(4, second.size());
		
		PriorityQueue<List<Integer>> queue = new PriorityQueue<List<Integer>>(new ListSorter());
		queue.add(second);
		queue.add(first);
		
		assertEquals(2, queue.size());
		
		assertEquals(first, queue.poll());
		assertEquals(second, queue.peek());
		
		first.remove(0);
		first.remove(0);
		first.remove(0);
		
		queue.add(first);
		
		assertEquals(2, queue.size());
		assertEquals(second, queue.peek());
	}
	
	@Test
	public void testEmptyIsLast()
	{
		List<Integer> first = new ArrayList<Integer>(4);
		List<Integer> emptyList = new ArrayList<Integer>(4);

		first.add(0);
		
		PriorityQueue<List<Integer>> queue = new PriorityQueue<List<Integer>>(new ListSorter());
		queue.add(emptyList);
		queue.add(first);
		
		assertEquals(first, queue.peek());
	}

}

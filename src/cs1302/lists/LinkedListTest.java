package cs1302.lists;

import static org.junit.Assert.*;

import org.junit.Test;

public class LinkedListTest {
	

	
	@Test
	public void testLifecyble() {
		LinkedList<Integer> list = new LinkedList<>();
		assertEquals(0, list.size());
		
		list.append(42);
		assertEquals(1, list.size());
		assertEquals(42, list.get(0).intValue());
		
		list.append(60);
		assertEquals(2, list.size());
		assertEquals(42, list.get(0).intValue());
		assertEquals(60, list.get(1).intValue());
		
		list.append(100);
		assertEquals(3, list.size());
		assertEquals(42, list.get(0).intValue());
		assertEquals(60, list.get(1).intValue());
		assertEquals(100, list.get(2).intValue());
		list.add(3, 30);
		assertEquals(4, list.size());
		list.remove(1);
		assertEquals(3, list.size());
		
		
		
	}
	

}

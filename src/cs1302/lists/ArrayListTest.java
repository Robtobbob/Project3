package cs1302.lists;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArrayListTest {

	@Test
	public void test() {
		ArrayList<Integer>dList = new ArrayList<Integer>();
		assertEquals(0, dList.size());
				
				dList.append(42);
				assertEquals(1, dList.size());
				assertEquals(42, dList.get(0).intValue());
				
				dList.append(60);
				assertEquals(2, dList.size());
				assertEquals(42, dList.get(0).intValue());
				assertEquals(60, dList.get(1).intValue());
				
				dList.append(100);
				assertEquals(3, dList.size());
				assertEquals(42, dList.get(0).intValue());
				assertEquals(60, dList.get(1).intValue());
				assertEquals(100, dList.get(2).intValue());
				dList.add(2, 30);
				assertEquals(4, dList.size());
				dList.remove(1);
				assertEquals(3, dList.size());
				dList.add(2, 50);
				assertEquals(4, dList.size());
				dList.prepend(69);
				assertEquals(5, dList.size());
				int idx = dList.search(50, 0, 6);
				System.out.println(idx);
	}

}

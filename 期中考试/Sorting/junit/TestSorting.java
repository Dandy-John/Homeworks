import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TestSorting {
	
	private Sorting s;
	
	@Before
	public void before(){
		s = new Sorting();
	}

	@Test
	public void testInsertionSort() {
		int[] temp = {4,3,2,1};
		assertFalse(s.isSorted(temp));
		s.insertionSort(temp);
		assertTrue(s.isSorted(temp));
	}
	
	@Test
	public void testQuickSort(){
		int[] temp = {1000,3,2,6,8,3,65,8,25,62,856,235,4,3673,37,375,1};
		assertFalse(s.isSorted(temp));
		Sorting.quicksort(temp);
		assertTrue(s.isSorted(temp));
		Sorting.swapReferences(new Object[]{
				1,2
		}, 0, 1);
	}
}

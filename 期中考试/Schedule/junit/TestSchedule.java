import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;


public class TestSchedule {
	
	private Schedule s;
	private List<Double> l;
	private List<Work> works;
	
	@Before
	public void init(){
		s = new Schedule();
	}

	@Test
	public void testFCFS() {
		works = new ArrayList<Work>();
		works.add(new Work("w1",1,1));
		works.add(new Work("w2",2,1));
		works.add(new Work("w3",3,1));
		l = s.FCFS(works);
		
		assertEquals(1, l.get(0), 0);
		assertEquals(1, l.get(1), 0);
		assertEquals(2, works.get(0).getEndTime());
		assertEquals(3, works.get(1).getEndTime());
		assertEquals(4, works.get(2).getEndTime());
		
		
	}
	
	@Test
	public void testSJF(){
		works = new ArrayList<Work>();
		works.add(new Work("w1", 1, 8));
		works.add(new Work("w2", 2, 4));
		works.add(new Work("w3", 3, 4));
		works.add(new Work("w4", 2, 3));
		l = s.SJF(works);
		
		assertEquals(12.25, l.get(0), 0);
		assertEquals(3.02, l.get(1), 0.01);
		assertEquals(9, works.get(0).getEndTime());
		assertEquals(16, works.get(1).getEndTime());
		assertEquals(20, works.get(2).getEndTime());
		assertEquals(12, works.get(3).getEndTime());
		
		Work work = new Work("test", 1, 3);
		assertEquals(0, work.getPriority());
	}
}

import static org.junit.Assert.*;

import org.junit.Test;


public class TestTriangle {
	
	private Triangle t;

	@Test
	public void testGetType() {
		t = new Triangle(1,2,3);
		assertEquals("Illegal", t.getType(t));
		t = new Triangle(-1,2,3);
		assertEquals("Illegal", t.getType(t));
		t = new Triangle(4,2,3);
		assertEquals("Scalene", t.getType(t));
		t = new Triangle(2,2,3);
		assertEquals("Isosceles", t.getType(t));
		t = new Triangle(3,2,2);
		assertEquals("Isosceles", t.getType(t));
		t = new Triangle(3,2,3);
		assertEquals("Isosceles", t.getType(t));
		t = new Triangle(2,2,2);
		assertEquals("Regular", t.getType(t));
	}

	@Test
	public void testGetBorders(){
		t = new Triangle(3,4,5);
		long[] l = t.getBorders();
		assertEquals(3, l[0]);
		assertEquals(4, l[1]);
		assertEquals(5, l[2]);
	}
}

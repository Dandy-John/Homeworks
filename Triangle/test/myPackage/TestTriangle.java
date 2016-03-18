package myPackage;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class TestTriangle {
	private double a;
	private double b;
	private double c;
	private String expected;
	
	public TestTriangle(double a, double b, double c, String expected){
		this.a = a;
		this.b = b;
		this.c = c;
		this.expected = expected;
	}
	
	@Parameters
	public static Collection<Object[]> getData(){
		return Arrays.asList(new Object[][]{
				{5,1,2,"Not a triangle"},
				{1,1,1,"Equilateral"},
				{5,3,4,"Scalene"},
				{6,6,5,"Isosceles"},
				{2,2,3,"Isosceles"}
		});
	}

	@Test
	public void test() {
		assertEquals(expected, Triangle.test(a, b, c));
	}

}

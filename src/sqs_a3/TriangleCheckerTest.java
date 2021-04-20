package sqs_a3;

import static org.junit.Assert.*;

import org.junit.Test;


//TriangleChecker.checkTriangle(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE)
public class TriangleCheckerTest {

	@Test
	public void checkScaleneTriangleTest() {
		TriangleChecker scaleneTriangleChecker = new TriangleChecker();
		
		TriangleType scaleneTriangle = scaleneTriangleChecker.checkTriangle(5,4,3);
		assertEquals(TriangleType.SCALENE_TRIANGLE, scaleneTriangle);
		scaleneTriangle = scaleneTriangleChecker.checkTriangle(4,3,5);
		assertEquals(TriangleType.SCALENE_TRIANGLE, scaleneTriangle);
		scaleneTriangle = scaleneTriangleChecker.checkTriangle(3,4,5);
		assertEquals(TriangleType.SCALENE_TRIANGLE, scaleneTriangle);
	}
	
	@Test
	public void checkNotScaleneTriangleTest() {
		TriangleChecker scaleneTriangleChecker = new TriangleChecker();
		
		TriangleType scaleneTriangle = scaleneTriangleChecker.checkTriangle(1,2,3);
		scaleneTriangle = scaleneTriangleChecker.checkTriangle(0,1,2);
		assertNotEquals(TriangleType.SCALENE_TRIANGLE, scaleneTriangle);
		scaleneTriangle = scaleneTriangleChecker.checkTriangle(-1,0,0);
		assertNotEquals(TriangleType.SCALENE_TRIANGLE, scaleneTriangle);
		scaleneTriangle = scaleneTriangleChecker.checkTriangle(3,3,3);
		assertNotEquals(TriangleType.SCALENE_TRIANGLE, scaleneTriangle);
		scaleneTriangle = scaleneTriangleChecker.checkTriangle(3,2,3);
		assertNotEquals(TriangleType.SCALENE_TRIANGLE, scaleneTriangle);
		scaleneTriangle = scaleneTriangleChecker.checkTriangle(-1,2,3);
		assertNotEquals(TriangleType.SCALENE_TRIANGLE, scaleneTriangle);
	}
	
	@Test
	public void checkIsoscelesTriangleTest()
	{
		TriangleChecker isoscelesTriangleChecker = new TriangleChecker();
		
		TriangleType isoscelesTriangle = isoscelesTriangleChecker.checkTriangle(5,5,4);
		assertEquals(TriangleType.ISOSCELES_TRIANGLE, isoscelesTriangle);
		isoscelesTriangle = isoscelesTriangleChecker.checkTriangle(2,2,1);
		assertEquals(TriangleType.ISOSCELES_TRIANGLE, isoscelesTriangle);
		isoscelesTriangle = isoscelesTriangleChecker.checkTriangle(6,2,6);
		assertEquals(TriangleType.ISOSCELES_TRIANGLE, isoscelesTriangle);
	}
	
	@Test
	public void checkNotIsoscelesTriangleTest()
	{
		TriangleChecker isoscelesTriangleChecker = new TriangleChecker();
		
		TriangleType isoscelesTriangle = isoscelesTriangleChecker.checkTriangle(1,1,3);
		isoscelesTriangle = isoscelesTriangleChecker.checkTriangle(1,2,3);
		assertNotEquals(TriangleType.ISOSCELES_TRIANGLE, isoscelesTriangle);
		isoscelesTriangle = isoscelesTriangleChecker.checkTriangle(2,3,1);
		assertNotEquals(TriangleType.ISOSCELES_TRIANGLE, isoscelesTriangle);
		isoscelesTriangle = isoscelesTriangleChecker.checkTriangle(2,2,2);
		assertNotEquals(TriangleType.ISOSCELES_TRIANGLE, isoscelesTriangle);
		isoscelesTriangle = isoscelesTriangleChecker.checkTriangle(0,3,1);
		assertNotEquals(TriangleType.ISOSCELES_TRIANGLE, isoscelesTriangle);
		isoscelesTriangle = isoscelesTriangleChecker.checkTriangle(2,-1,2);
		assertNotEquals(TriangleType.ISOSCELES_TRIANGLE, isoscelesTriangle);
	}
	
	@Test
	public void checkEquilateralTriangleTest()
	{
		TriangleChecker equilateralTriangleChecker = new TriangleChecker();
		
		TriangleType equilateralTriangle = equilateralTriangleChecker.checkTriangle(1,1,1);
		assertEquals(TriangleType.EQUILATERAL_TRIANGLE, equilateralTriangle);
		equilateralTriangle = equilateralTriangleChecker.checkTriangle(2,2,2);
		assertEquals(TriangleType.EQUILATERAL_TRIANGLE, equilateralTriangle);
		equilateralTriangle = equilateralTriangleChecker.checkTriangle(3,3,3);
		assertEquals(TriangleType.EQUILATERAL_TRIANGLE, equilateralTriangle);
	}
	
	@Test
	public void checkNotEquilateralTriangleTest()
	{
		TriangleChecker equilateralTriangleChecker = new TriangleChecker();
		
		TriangleType equilateralTriangle = equilateralTriangleChecker.checkTriangle(1,1,1);
		equilateralTriangle = equilateralTriangleChecker.checkTriangle(1,2,3);
		assertNotEquals(TriangleType.EQUILATERAL_TRIANGLE, equilateralTriangle);
		equilateralTriangle = equilateralTriangleChecker.checkTriangle(2,2,3);
		assertNotEquals(TriangleType.EQUILATERAL_TRIANGLE, equilateralTriangle);
		equilateralTriangle = equilateralTriangleChecker.checkTriangle(1,2,0);
		assertNotEquals(TriangleType.EQUILATERAL_TRIANGLE, equilateralTriangle);
		equilateralTriangle = equilateralTriangleChecker.checkTriangle(-1,-1,-1);
		assertNotEquals(TriangleType.EQUILATERAL_TRIANGLE, equilateralTriangle);
	}
	
	@Test
	public void checkNoTriangleTestSuccess()
	{
		TriangleChecker noTriangleChecker = new TriangleChecker();
		
		TriangleType noTriangle = noTriangleChecker.checkTriangle(0,0,0);
		assertEquals(TriangleType.NO_TRIANGLE, noTriangle);
		noTriangle = noTriangleChecker.checkTriangle(1,-1,3);
		assertEquals(TriangleType.NO_TRIANGLE, noTriangle);
		noTriangle = noTriangleChecker.checkTriangle(1,0,1);
		assertEquals(TriangleType.NO_TRIANGLE, noTriangle);
		noTriangle = noTriangleChecker.checkTriangle(1,1,2);
		assertEquals(TriangleType.NO_TRIANGLE, noTriangle);	
	}
	
	@Test
	public void checkNoTriangleTestFailure()
	{
		TriangleChecker noTriangleChecker = new TriangleChecker();
		
		TriangleType noTriangle = noTriangleChecker.checkTriangle(0,0,0);
		noTriangle = noTriangleChecker.checkTriangle(4,2,3);
		assertNotEquals(TriangleType.NO_TRIANGLE, noTriangle);
		noTriangle = noTriangleChecker.checkTriangle(6,2,6);
		assertNotEquals(TriangleType.NO_TRIANGLE, noTriangle);
		noTriangle = noTriangleChecker.checkTriangle(3,3,3);
		assertNotEquals(TriangleType.NO_TRIANGLE, noTriangle);
	}

}

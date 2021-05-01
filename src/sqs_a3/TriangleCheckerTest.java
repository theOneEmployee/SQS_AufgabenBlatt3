package sqs_a3;

import static org.junit.Assert.*;

import org.junit.Test;


//TriangleChecker.checkTriangle(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE)
public class TriangleCheckerTest {

	@Test
	public void checkScaleneTriangleTest() {
		
		TriangleType scaleneTriangle = TriangleChecker.checkTriangle(5,4,3);
		assertEquals(TriangleType.SCALENE_TRIANGLE, scaleneTriangle);
		scaleneTriangle = TriangleChecker.checkTriangle(4,3,5);
		assertEquals(TriangleType.SCALENE_TRIANGLE, scaleneTriangle);
		scaleneTriangle = TriangleChecker.checkTriangle(3,4,5);
		assertEquals(TriangleType.SCALENE_TRIANGLE, scaleneTriangle);
	}
	
	@Test
	public void checkNotScaleneTriangleTest() {
		
		TriangleType scaleneTriangle = TriangleChecker.checkTriangle(1,2,3);
		scaleneTriangle = TriangleChecker.checkTriangle(0,1,2);
		assertNotEquals(TriangleType.SCALENE_TRIANGLE, scaleneTriangle);
		scaleneTriangle = TriangleChecker.checkTriangle(-1,0,0);
		assertNotEquals(TriangleType.SCALENE_TRIANGLE, scaleneTriangle);
		scaleneTriangle = TriangleChecker.checkTriangle(3,3,3);
		assertNotEquals(TriangleType.SCALENE_TRIANGLE, scaleneTriangle);
		scaleneTriangle = TriangleChecker.checkTriangle(3,2,3);
		assertNotEquals(TriangleType.SCALENE_TRIANGLE, scaleneTriangle);
		scaleneTriangle = TriangleChecker.checkTriangle(-1,2,3);
		assertNotEquals(TriangleType.SCALENE_TRIANGLE, scaleneTriangle);
	}
	
	@Test
	public void checkIsoscelesTriangleTest()
	{
		
		TriangleType isoscelesTriangle = TriangleChecker.checkTriangle(5,5,4);
		assertEquals(TriangleType.ISOSCELES_TRIANGLE, isoscelesTriangle);
		isoscelesTriangle = TriangleChecker.checkTriangle(2,2,1);
		assertEquals(TriangleType.ISOSCELES_TRIANGLE, isoscelesTriangle);
		isoscelesTriangle = TriangleChecker.checkTriangle(6,2,6);
		assertEquals(TriangleType.ISOSCELES_TRIANGLE, isoscelesTriangle);
	}
	
	@Test
	public void checkNotIsoscelesTriangleTest()
	{
		
		TriangleType isoscelesTriangle = TriangleChecker.checkTriangle(1,1,3);
		isoscelesTriangle = TriangleChecker.checkTriangle(1,2,3);
		assertNotEquals(TriangleType.ISOSCELES_TRIANGLE, isoscelesTriangle);
		isoscelesTriangle = TriangleChecker.checkTriangle(2,3,1);
		assertNotEquals(TriangleType.ISOSCELES_TRIANGLE, isoscelesTriangle);
		isoscelesTriangle = TriangleChecker.checkTriangle(2,2,2);
		assertNotEquals(TriangleType.ISOSCELES_TRIANGLE, isoscelesTriangle);
		isoscelesTriangle = TriangleChecker.checkTriangle(0,3,1);
		assertNotEquals(TriangleType.ISOSCELES_TRIANGLE, isoscelesTriangle);
		isoscelesTriangle = TriangleChecker.checkTriangle(2,-1,2);
		assertNotEquals(TriangleType.ISOSCELES_TRIANGLE, isoscelesTriangle);
	}
	
	@Test
	public void checkEquilateralTriangleTest()
	{
		
		TriangleType equilateralTriangle = TriangleChecker.checkTriangle(1,1,1);
		assertEquals(TriangleType.EQUILATERAL_TRIANGLE, equilateralTriangle);
		equilateralTriangle = TriangleChecker.checkTriangle(2,2,2);
		assertEquals(TriangleType.EQUILATERAL_TRIANGLE, equilateralTriangle);
		equilateralTriangle = TriangleChecker.checkTriangle(3,3,3);
		assertEquals(TriangleType.EQUILATERAL_TRIANGLE, equilateralTriangle);
	}
	
	@Test
	public void checkNotEquilateralTriangleTest()
	{
		
		TriangleType equilateralTriangle = TriangleChecker.checkTriangle(1,1,1);
		equilateralTriangle = TriangleChecker.checkTriangle(1,2,3);
		assertNotEquals(TriangleType.EQUILATERAL_TRIANGLE, equilateralTriangle);
		equilateralTriangle = TriangleChecker.checkTriangle(2,2,3);
		assertNotEquals(TriangleType.EQUILATERAL_TRIANGLE, equilateralTriangle);
		equilateralTriangle = TriangleChecker.checkTriangle(1,2,0);
		assertNotEquals(TriangleType.EQUILATERAL_TRIANGLE, equilateralTriangle);
		equilateralTriangle = TriangleChecker.checkTriangle(-1,-1,-1);
		assertNotEquals(TriangleType.EQUILATERAL_TRIANGLE, equilateralTriangle);
	}
	
	@Test
	public void checkNoTriangleTestSuccess()
	{		
		TriangleType noTriangle = TriangleChecker.checkTriangle(0,0,0);
		assertEquals(TriangleType.NO_TRIANGLE, noTriangle);
		noTriangle = TriangleChecker.checkTriangle(1,-1,3);
		assertEquals(TriangleType.NO_TRIANGLE, noTriangle);
		noTriangle = TriangleChecker.checkTriangle(1,0,1);
		assertEquals(TriangleType.NO_TRIANGLE, noTriangle);
		noTriangle = TriangleChecker.checkTriangle(1,1,2);
		assertEquals(TriangleType.NO_TRIANGLE, noTriangle);	
	}
	
	@Test
	public void checkNoTriangleTestFailure()
	{
		
		TriangleType noTriangle = TriangleChecker.checkTriangle(0,0,0);
		assertEquals(TriangleType.NO_TRIANGLE, noTriangle);
		noTriangle = TriangleChecker.checkTriangle(4,2,3);
		assertNotEquals(TriangleType.NO_TRIANGLE, noTriangle);
		noTriangle = TriangleChecker.checkTriangle(6,2,6);
		assertNotEquals(TriangleType.NO_TRIANGLE, noTriangle);
		noTriangle = TriangleChecker.checkTriangle(3,3,3);
		assertNotEquals(TriangleType.NO_TRIANGLE, noTriangle);
	}

}

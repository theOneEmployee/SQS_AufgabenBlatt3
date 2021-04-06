package sqs_a3;

import static org.junit.Assert.*;

import org.junit.Test;

public class TriangleCheckerTest {

	@Test
	public void checkScaleneTriangleTest() {
		TriangleChecker scaleneTriangleChecker = new TriangleChecker();
		
		TriangleType scaleneTriangle = scaleneTriangleChecker.checkTriangle(1,2,3);
		assertEquals(TriangleType.SCALENE_TRIANGLE, scaleneTriangle);
		scaleneTriangle = scaleneTriangleChecker.checkTriangle(1,3,2);
		assertEquals(TriangleType.SCALENE_TRIANGLE, scaleneTriangle);
		scaleneTriangle = scaleneTriangleChecker.checkTriangle(2,1,3);
		assertEquals(TriangleType.SCALENE_TRIANGLE, scaleneTriangle);
		
		scaleneTriangle = scaleneTriangleChecker.checkTriangle(0,1,1);
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
	
	public void checkIsoscelesTriangleTest()
	{
		TriangleChecker isoscelesTriangleChecker = new TriangleChecker();
		
		TriangleType isoscelesTriangle = isoscelesTriangleChecker.checkTriangle(1,1,3);
		assertEquals(TriangleType.ISOSCELES_TRIANGLE, isoscelesTriangle);
		isoscelesTriangle = isoscelesTriangleChecker.checkTriangle(1,2,2);
		assertEquals(TriangleType.ISOSCELES_TRIANGLE, isoscelesTriangle);
		isoscelesTriangle = isoscelesTriangleChecker.checkTriangle(3,2,3);
		assertEquals(TriangleType.ISOSCELES_TRIANGLE, isoscelesTriangle);
		
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
	
	public void checkEquilateralTriangleTest()
	{
		TriangleChecker equilateralTriangleChecker = new TriangleChecker();
		TriangleType equilateralTriangle = equilateralTriangleChecker.checkTriangle(1,1,1);
		assertEquals(TriangleType.EQUILATERAL_TRIANGLE, equilateralTriangle);
		equilateralTriangle = equilateralTriangleChecker.checkTriangle(2,2,2);
		assertEquals(TriangleType.EQUILATERAL_TRIANGLE, equilateralTriangle);
		equilateralTriangle = equilateralTriangleChecker.checkTriangle(3,3,3);
		assertEquals(TriangleType.EQUILATERAL_TRIANGLE, equilateralTriangle);
		
		equilateralTriangle = equilateralTriangleChecker.checkTriangle(1,2,3);
		assertNotEquals(TriangleType.EQUILATERAL_TRIANGLE, equilateralTriangle);
		equilateralTriangle = equilateralTriangleChecker.checkTriangle(2,2,3);
		assertNotEquals(TriangleType.EQUILATERAL_TRIANGLE, equilateralTriangle);
		equilateralTriangle = equilateralTriangleChecker.checkTriangle(1,2,0);
		assertNotEquals(TriangleType.EQUILATERAL_TRIANGLE, equilateralTriangle);
		equilateralTriangle = equilateralTriangleChecker.checkTriangle(-1,-1,-1);
		assertNotEquals(TriangleType.EQUILATERAL_TRIANGLE, equilateralTriangle);
	}
	
	public void checkNoTriangleTest()
	{
		TriangleChecker noTriangleChecker = new TriangleChecker();
		TriangleType noTriangle = noTriangleChecker.checkTriangle(0,0,0);
		assertEquals(TriangleType.NO_TRIANGLE, noTriangle);
		noTriangle = noTriangleChecker.checkTriangle(1,-1,3);
		assertEquals(TriangleType.NO_TRIANGLE, noTriangle);
		noTriangle = noTriangleChecker.checkTriangle(1,0,1);
		assertEquals(TriangleType.NO_TRIANGLE, noTriangle);
		
		noTriangle = noTriangleChecker.checkTriangle(1,2,3);
		assertNotEquals(TriangleType.NO_TRIANGLE, noTriangle);
		noTriangle = noTriangleChecker.checkTriangle(1,2,1);
		assertNotEquals(TriangleType.NO_TRIANGLE, noTriangle);
		noTriangle = noTriangleChecker.checkTriangle(3,3,3);
		assertNotEquals(TriangleType.NO_TRIANGLE, noTriangle);
	}

}

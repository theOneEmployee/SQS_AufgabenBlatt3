package sqs_a3;

import static org.junit.Assert.*;

import org.junit.Test;

public class TriangleCheckerWhiteboxTests {
	
	@Test
	public void checkNoTriangleTestSuccess()
	{
		TriangleType noTriangle = TriangleChecker.checkTriangle(2, 2, 10);
		assertEquals(TriangleType.NO_TRIANGLE, noTriangle);
	}
	
	@Test
	public void checkScaleneTriangleTest() {
		TriangleType scaleneTriangle = TriangleChecker.checkTriangle(2, 3, 4);
		assertEquals(TriangleType.SCALENE_TRIANGLE, scaleneTriangle);
	}
	
	@Test
	public void checkIsoscelesTriangleTest()
	{
		TriangleType isoscelesTriangle = TriangleChecker.checkTriangle(4, 4, 5);
		assertEquals(TriangleType.ISOSCELES_TRIANGLE, isoscelesTriangle);
	}
	
	@Test
	public void checkEquilateralTriangleTest()
	{
		TriangleType equilateralTriangle = TriangleChecker.checkTriangle(1, 1, 1);
		assertEquals(TriangleType.EQUILATERAL_TRIANGLE, equilateralTriangle);
	}

}

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
	public void checkScaleneTriangleTestSuccess() {
		TriangleType scaleneTriangle = TriangleChecker.checkTriangle(2, 3, 4);
		assertEquals(TriangleType.SCALENE_TRIANGLE, scaleneTriangle);
	}
	
	@Test
	public void checkIsoscelesTriangleTestSuccess()
	{
		TriangleType isoscelesTriangle = TriangleChecker.checkTriangle(4, 4, 5);
		assertEquals(TriangleType.ISOSCELES_TRIANGLE, isoscelesTriangle);
	}
	
	@Test
	public void checkEquilateralTriangleTestSuccess()
	{
		TriangleType equilateralTriangle = TriangleChecker.checkTriangle(1, 1, 1);
		assertEquals(TriangleType.EQUILATERAL_TRIANGLE, equilateralTriangle);
	}
	//-------------------------------------------------------------------
	
	@Test
	public void checkNoTriangleTestFailureAndSucess()
	{
		TriangleType noTriangle = TriangleChecker.checkTriangle(2, 2, 10);
		assertEquals(TriangleType.NO_TRIANGLE, noTriangle);
		noTriangle = TriangleChecker.checkTriangle(2, 9, 10);
		assertNotEquals(TriangleType.NO_TRIANGLE, noTriangle);
	}
	
	@Test
	public void checkScaleneTriangleTestFailureAndSucess() {
		TriangleType scaleneTriangle = TriangleChecker.checkTriangle(3, 3, 4);
		assertNotEquals(TriangleType.SCALENE_TRIANGLE, scaleneTriangle);
		scaleneTriangle = TriangleChecker.checkTriangle(2, 3, 4);
		assertEquals(TriangleType.SCALENE_TRIANGLE, scaleneTriangle);
	}
	
	@Test
	public void checkIsoscelesTriangleTestFailureAndSucess()
	{
		TriangleType isoscelesTriangle = TriangleChecker.checkTriangle(3, 4, 5);
		assertNotEquals(TriangleType.ISOSCELES_TRIANGLE, isoscelesTriangle);
		isoscelesTriangle = TriangleChecker.checkTriangle(4, 4, 5);
		assertEquals(TriangleType.ISOSCELES_TRIANGLE, isoscelesTriangle);
	}
	
	@Test
	public void checkEquilateralTriangleTestFailureAndSucess()
	{
		TriangleType equilateralTriangle = TriangleChecker.checkTriangle(2, 3, 2);
		assertNotEquals(TriangleType.EQUILATERAL_TRIANGLE, equilateralTriangle);
		equilateralTriangle = TriangleChecker.checkTriangle(1, 1, 1);
		assertEquals(TriangleType.EQUILATERAL_TRIANGLE, equilateralTriangle);
	}

}
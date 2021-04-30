package sqs_a3;

import static org.junit.Assert.*;

import org.junit.Test;

public class TriangleCheckerWhiteboxTest_DefinierteBedingungen {
	
	@Test
	public void noTriangleTests() {
		assertNotEquals(TriangleChecker.checkTriangle(2,4,5), TriangleType.NO_TRIANGLE);
		assertEquals(TriangleChecker.checkTriangle(10,4,5), TriangleType.NO_TRIANGLE);
		assertEquals(TriangleChecker.checkTriangle(2,9,5), TriangleType.NO_TRIANGLE);
		assertEquals(TriangleChecker.checkTriangle(2,4,20), TriangleType.NO_TRIANGLE);
	}
	
	@Test
	public void scaleneTriangleTests() {
		assertEquals(TriangleChecker.checkTriangle(2,4,5), TriangleType.SCALENE_TRIANGLE);
		assertNotEquals(TriangleChecker.checkTriangle(4,4,5), TriangleType.SCALENE_TRIANGLE);
		assertNotEquals(TriangleChecker.checkTriangle(2,5,5), TriangleType.SCALENE_TRIANGLE);
		assertNotEquals(TriangleChecker.checkTriangle(5,4,5), TriangleType.SCALENE_TRIANGLE);
	}
	
	@Test
	public void isosceleTringaleTests_partA() {
		assertEquals(TriangleChecker.checkTriangle(3,3,4), TriangleType.ISOSCELES_TRIANGLE);
		assertNotEquals(TriangleChecker.checkTriangle(3,3,3), TriangleType.ISOSCELES_TRIANGLE);
		assertNotEquals(TriangleChecker.checkTriangle(3,5,4), TriangleType.ISOSCELES_TRIANGLE);
	}
	
	@Test
	public void isosceleTringaleTests_partB() {
		assertEquals(TriangleChecker.checkTriangle(3,4,4), TriangleType.ISOSCELES_TRIANGLE);
		assertNotEquals(TriangleChecker.checkTriangle(4,4,4), TriangleType.ISOSCELES_TRIANGLE);
		assertNotEquals(TriangleChecker.checkTriangle(3,4,5), TriangleType.ISOSCELES_TRIANGLE);
	}
	
	@Test
	public void isosceleTringaleTests_partC() {
		assertEquals(TriangleChecker.checkTriangle(3,4,3), TriangleType.ISOSCELES_TRIANGLE);
		assertNotEquals(TriangleChecker.checkTriangle(5,5,5), TriangleType.ISOSCELES_TRIANGLE);
		assertNotEquals(TriangleChecker.checkTriangle(6,5,4), TriangleType.ISOSCELES_TRIANGLE);
	}
	
	@Test
	public void isosceleTriangleTests_Combined() {
		assertNotEquals(TriangleChecker.checkTriangle(3,3,3), TriangleType.ISOSCELES_TRIANGLE);
		assertEquals(TriangleChecker.checkTriangle(3,3,4), TriangleType.ISOSCELES_TRIANGLE);
		assertEquals(TriangleChecker.checkTriangle(3,4,4), TriangleType.ISOSCELES_TRIANGLE);
		assertEquals(TriangleChecker.checkTriangle(3,4,3), TriangleType.ISOSCELES_TRIANGLE);
	}
	
}

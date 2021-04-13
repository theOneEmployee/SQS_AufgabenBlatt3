package sqs_a3;

public class TriangleChecker {
	public static TriangleType checkTriangle(int a, int b, int c) {
		
		if((long)a + (long)b <= c || (long)a + (long)c <= b || (long)b + (long)c <= a)
		{
			return TriangleType.NO_TRIANGLE;
		}
		
		if(a != b && a != c && b != c) 
		{
			return TriangleType.SCALENE_TRIANGLE;
		}
		else if((a == b && a!= c) || (a == c && a != b) || (b == c && a != c))
		{
			return TriangleType.ISOSCELES_TRIANGLE;
		}
		else if(a == b && b == c)
		{
			return TriangleType.EQUILATERAL_TRIANGLE;
		}
		
		return TriangleType.NO_TRIANGLE;
	}
}


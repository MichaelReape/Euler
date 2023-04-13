/*Project Euler challenge 6
  Sum square difference
  To find the difference between the sum of the squares of the first 100 numbers
  And the square of the sum of the first 100 numbers*/

//import java.util.Math;
public class euler6{
	public static void main(String[] args){
		long sumSquare = 0l, squareSum = 0l;
		for(int i = 1; i <= 100; i++){
			sumSquare += (long)Math.pow(i, 2);
			squareSum += i;
		}	
		squareSum = (long)Math.pow(squareSum, 2);
		System.out.println((long)Math.abs(squareSum - sumSquare));	
	}
}

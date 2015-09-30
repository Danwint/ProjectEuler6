/* 
	A program to calculate the difference between the square of the sum 
	of the first one hundred natural numbers and the sum of the squares 
	of the first one hundred natural numbers
*/
public class ProjectEuler6 {
	public static void main(String[] args) {
		int sumOfNatNum = 0;
		int sumOfSquares = 0;
		for (int i=1; i <= 100; i++){
			sumOfNatNum = sumOfNatNum + i;
		}
		int squareOfSum = sumOfNatNum * sumOfNatNum;
		for (int i=1; i <=100; i++){
			sumOfSquares = sumOfSquares + (i * i);
		}
		System.out.println("");
		System.out.println("Square of the sum of all natural numbers up to 100:");
		System.out.println(squareOfSum);
		System.out.println("");
		System.out.println("Sum of the squares of all natural numbers up to 100:");
		System.out.println(sumOfSquares);
		System.out.println("");
		System.out.println("Square of the sum minus the sum of the squares:");
		System.out.println(squareOfSum - sumOfSquares);
		System.out.println("");
		
	}
}
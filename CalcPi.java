// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    // Replace this comment with your code
		int numOfCalcs = Integer.parseInt(args[0]);
		double calculatedPi = 0;

		// Calcs PI/4 approx based on the formula, a number of calcs equal to the input num
		for (int i = 0; i < numOfCalcs; i++) {
			if (i % 2 == 0) {
				calculatedPi += 1.0 / (2 * i + 1);
			}
			else {
				calculatedPi -= 1.0 / (2 * i + 1);
			}
		}
		calculatedPi *= 4;

		System.out.println("pi according to java: " + Math.PI);
		System.out.println("pi, approximated:     " + calculatedPi);
	}
}
 
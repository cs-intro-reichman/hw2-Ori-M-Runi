// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    // Replace this comment with your code
		int maxSeed = Integer.parseInt(args[0]);
		char mode = args[1].charAt(0);

		// Checks (and outputs if mode is 'v') each hailstone sequence from 1 to the inputed num
		for (int i = 0; i < maxSeed; i++) {
			int currentNum = i + 1;
			int numOfSteps = 1;
			String output = currentNum + " ";

			// In order do the operation once so if current num starts at 1 it doesn't end immediately
			do {
				if (currentNum % 2 == 0) {	currentNum /= 2; }
				else {	currentNum = currentNum * 3 + 1; }
				numOfSteps++;
				output += currentNum + " ";
			}
			while (currentNum != 1);
			
			output += "(" + numOfSteps + ")";
			// prints the hailstone sequence only if mode is 'v'
			if (mode == 'v') {
				System.out.println(output);
			}
		}
		// Prints the message that the program succeded, regardless of mode
		System.out.printf("Every one of the first %d hailstone sequences reached 1.%n", maxSeed);
	}
}

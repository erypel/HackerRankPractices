package Recursion;

import java.io.*;
import java.util.*;

public class DavisStaircase {

	// Complete the stepPerms function below.
	static int stepPerms(int n) {
		/*
		 *** 
		 * Exponential time solution, but recursive***
		 * 
		 * if(n < 0) { return 0; } 
		 * if(n == 0) { return 1; } 
		 * if (n == 2) { return 2; } 
		 * if (n == 3) { return 4; } 
		 * return (stepPerms(n-1) + stepPerms(n-2) +
		 * 		stepPerms(n-3));
		 */

		// Non-recursive, but solves problem in O(n) time

		if (n == 1)
			return 1;
		if (n == 2)
			return 2;
		if (n == 3)
			return 4;

		int x1 = 1;
		int x2 = 2;
		int x3 = 4;
		int i = 4;
		int sum = 0;

		while (i <= n) {
			sum = x1 + x2 + x3;
			x1 = x2;
			x2 = x3;
			x3 = sum;
			i += 1;
		}

		return sum;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int s = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int sItr = 0; sItr < s; sItr++) {
			int n = scanner.nextInt();
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			int res = stepPerms(n);

			bufferedWriter.write(String.valueOf(res));
			bufferedWriter.newLine();
		}

		bufferedWriter.close();

		scanner.close();
	}
}

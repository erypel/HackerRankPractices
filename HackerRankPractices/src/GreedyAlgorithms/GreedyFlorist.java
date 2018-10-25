package GreedyAlgorithms;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class GreedyFlorist
{
	
	// Complete the getMinimumCost function below.
	static int getMinimumCost(int k, int[] c)
	{
		Arrays.sort(c); // sort from lowest to highest
		int i = c.length - 1; // start from the most expensive flower
		int bought = 0;
		int total = 0;
		// start at the most expensive flower, stop when there is no more flowers left
		while(i >= 0)
		{
			// Calculate total:
			// increase bought by 1 when everyone in the group has bought equal number of
			// flowers
			for(int j = 0; j < k && i >= 0; j++)
			{
				total += (bought + 1) * c[i];
				i--;
			}
			bought++;
		}
		return total;
	}
	
	private static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) throws IOException
	{
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
		
		String[] nk = scanner.nextLine().split(" ");
		
		int n = Integer.parseInt(nk[0]);
		
		int k = Integer.parseInt(nk[1]);
		
		int[] c = new int[n];
		
		String[] cItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		
		for(int i = 0; i < n; i++)
		{
			int cItem = Integer.parseInt(cItems[i]);
			c[i] = cItem;
		}
		
		int minimumCost = getMinimumCost(k, c);
		
		bufferedWriter.write(String.valueOf(minimumCost));
		bufferedWriter.newLine();
		
		bufferedWriter.close();
		
		scanner.close();
	}
}

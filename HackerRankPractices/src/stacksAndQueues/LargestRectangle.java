package stacksAndQueues;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class LargestRectangle
{
	
	// Complete the largestRectangle function below.
	static long largestRectangle(int[] h)
	{
		Stack<Integer> stack = new Stack<Integer>();
		int top = 0; // top of the stack
		long maxArea = 0;
		long areaWithTop = 0; // the area of the rectangle w/ top as the smallest value
		int n = h.length;
		int i = 0; // bar count
		while(i < n)
		{
			// if this bar is taller than the one on the top of the stack,
			// push it
			if(stack.isEmpty() || h[stack.peek()] <= h[i])
			{
				// i will be the bar count
				stack.push(i++);
			}
			else
			{
				/*
				 * If this bar is lower than top of stack, calculate the area of the rectangle
				 * with the stack top as the shortest bar. 'i' is 'right index' for the top and
				 * element before top in stack is 'left index'
				 */
				top = stack.peek();
				stack.pop();
				
				areaWithTop = h[top] * (stack.empty() ? i : i - stack.peek() - 1);
				
				if(areaWithTop > maxArea)
					maxArea = areaWithTop;
			}
		}
		
		// pop the remaining bars and calculate their areas, using the respective popped
		// bar
		// as the smallest one
		while(stack.empty() == false)
		{
			top = stack.peek();
			stack.pop();
			areaWithTop = h[top] * (stack.empty() ? i : i - stack.peek() - 1);
			
			if(maxArea < areaWithTop)
				maxArea = areaWithTop;
		}
		return maxArea;
	}
	
	private static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) throws IOException
	{
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
		
		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		
		int[] h = new int[n];
		
		String[] hItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		
		for(int i = 0; i < n; i++)
		{
			int hItem = Integer.parseInt(hItems[i]);
			h[i] = hItem;
		}
		
		long result = largestRectangle(h);
		
		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();
		
		bufferedWriter.close();
		
		scanner.close();
	}
}
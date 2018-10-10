package SortingExercises;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class FraudulentActivityNotifications {

   
   // Function for calculating median 
    public static double findMedian(int a[], int n) 
    { 
        // First we sort the array 
    	// would be quicker to do some sort of quick select
        Arrays.sort(a); 
  
      double median = (a[n / 2] + a[(n - 1) / 2]) / 2.0;
    return median;
    } 

    // Complete the activityNotifications function below.
    static int activityNotifications(int[] expenditure, int d) {
        if(d > expenditure.length)
            return 0;
        int count = 0;
        int[] trailingDays = new int[d];
        for(int i = 1; i < expenditure.length; i++) {
            trailingDays[i%d] = expenditure[i-1];
            if(i+1>d)
            {
                if(expenditure[i] >= findMedian(trailingDays, trailingDays.length) * 2.0){
                    count++;
                }
            }
        }
        return count;
        

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] expenditure = new int[n];

        String[] expenditureItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int expenditureItem = Integer.parseInt(expenditureItems[i]);
            expenditure[i] = expenditureItem;
        }

        int result = activityNotifications(expenditure, d);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

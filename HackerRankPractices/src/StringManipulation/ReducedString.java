package StringManipulation;

import java.io.*;

public class ReducedString {

    // Complete the superReducedString function below.
    static String superReducedString(String s) {
        for (int i = 1; i < s.length(); i++) 
        {
            if (s.charAt(i) == s.charAt(i-1)) 
            {
                s = s.substring(0, i-1) + s.substring(i+1);
                i = 0;
            }
        }
        return s.length() == 0 ? "Empty String" : s;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = superReducedString(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

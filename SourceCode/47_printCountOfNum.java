import java.io.*;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long a = Long.parseLong(br.readLine());
        long b = Long.parseLong(br.readLine());
        long c = Long.parseLong(br.readLine());
        int[] myArray = new int[10];
        String result = String.valueOf(a*b*c);
        for (int i = 0; i < result.length(); i++) {
            myArray[result.charAt(i) - '0'] += 1;
        }
        
        for (int j = 0; j < myArray.length; j++) {
            bw.write(myArray[j]+"\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
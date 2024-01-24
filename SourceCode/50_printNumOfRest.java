import java.io.*;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int div = 42;
        int[] restArray = new int[42];
        String T = "";
        int count = 0;
        int num = 0;
        while((T = br.readLine()) != null) {
            num = Integer.parseInt(T);
            if (restArray[num % div] == 0) {
                restArray[num % div] += 1;
                count++;
            }
        }
        
        bw.write(count+"");
        bw.flush();
        bw.close();
        br.close();
    }
}
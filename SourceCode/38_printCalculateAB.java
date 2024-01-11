import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String T = br.readLine();
        String[] myArray = T.split(" ");
        
        long a = Integer.parseInt(myArray[0]);
        long b = Integer.parseInt(myArray[1]);
        
        bw.write((a+b)*(a-b)+"");
        bw.flush();
        bw.close();
        br.close();
    }
}
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String T = br.readLine();
        String[] myArray = T.split(" ");
        
        int one = Integer.parseInt(myArray[0]);
        int two = Integer.parseInt(myArray[1]);
        int three = Integer.parseInt(myArray[2]);
        int four = Integer.parseInt(myArray[3]);
        int five = Integer.parseInt(myArray[4]);
        
        
        bw.write((one*one + two*two + three*three + four*four + five*five) % 10 + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String T = "";
        int max = Integer.parseInt(br.readLine());
        int count = 1;
        int temp = 0;
        int index = 1;
        while((T = br.readLine()) != null) {
            temp = Integer.parseInt(T);
            count += 1;
            if (max < temp) {
                max = temp;
                index = count;
            }
        }
        
        
        bw.write(max+"\n");
        bw.write(index+"");
        bw.flush();
        bw.close();
        br.close();
    }
}
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int num = Integer.parseInt(br.readLine());
        String T = br.readLine();
        String[] myArray = T.split(" ");
        
        long min = Integer.parseInt(myArray[0]);
        long max = Integer.parseInt(myArray[0]);
        long temp;
        
        for (int i = 0; i < num; i++) {
            temp = Integer.parseInt(myArray[i]);
            if (temp > max) {
                max = temp;
            }
            if (temp < min) {
                min = temp;
            }
        }
        bw.write(min + " " + max);
        bw.flush();
        bw.close();
        br.close();
    }
}
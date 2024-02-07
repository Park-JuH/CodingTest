import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long num = Long.parseLong(br.readLine());
        long count = 1;
        long temp = 1;
        while(temp < num) {
            temp += 6*count;
            count++;
        }

        bw.write(""+count);
        bw.flush();
        bw.close();
        br.close();
    }
}
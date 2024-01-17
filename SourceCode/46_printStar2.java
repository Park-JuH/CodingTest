import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        int count = num;
        for (int i = 0; i < num; i++) {
            for (int j = 1; j <= num; j++) {
                if (j >= count) {
                bw.write("*");
                }
                else {
                    bw.write(" ");
                }
            }
            bw.write("\n");
            count--;
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
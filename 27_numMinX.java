import java.io.*;
import java.util.StringTokenizer;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int max_num = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine(), " ");
        int temp;
        for (int i = 0; i < n; i++) {
             temp = Integer.parseInt(st.nextToken());
             if (max_num > temp) {
                 bw.write(temp + " ");
             }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
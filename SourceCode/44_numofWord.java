import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String T = br.readLine().trim();
        String[] myArray = T.split("\\s+");
        
        if (T.isEmpty()) {
            bw.write("0");
        } else {
            bw.write(myArray.length + "");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
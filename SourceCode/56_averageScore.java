import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        double num = Double.parseDouble(br.readLine());
		String T = br.readLine().trim();
        String[] myArray = T.split("\\s+");
        double max = 0;
        double sum = 0;
        double[] numArray = new double[(int)num];
        for (int i = 0; i < num; i++) {
            numArray[i] = Double.parseDouble(myArray[i]);
            if (max < numArray[i]) {
               max = numArray[i];
            }
        }
        for (int j = 0; j < num; j++) {
            sum += numArray[j]/max*100;
        }
        sum /= num;
        bw.write(""+sum);
        bw.flush();
        bw.close();
        br.close();
	}
}
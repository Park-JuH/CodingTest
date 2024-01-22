import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));    
		String[] myArray = br.readLine().split(" ");
        String result = "";
        int count = 0;
        if (Integer.parseInt(myArray[1]) - Integer.parseInt(myArray[0]) > 0) {
            result = "ascending";
            count = 1;
        }
        else {
            result = "descending";
            count = -1;
        }
        for (int i = 1; i < myArray.length - 1; i++) {
            if (Integer.parseInt(myArray[i + 1]) - Integer.parseInt(myArray[i]) != count) {
                result = "mixed";
                break;
            }
        }
        
        bw.write(result);
        bw.flush();
        bw.close();
        br.close();
	}
}
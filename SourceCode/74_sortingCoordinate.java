import java.io.*;
import java.util.*;

class User implements Comparable<User> {
    int x;
    int y;

    public User(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(User other) {
        if (this.x - other.x == 0)
            return this.y - other.y;
        
        return this.x - other.x;
    }
}


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        List<User> xy_array = new ArrayList<>();
        
        String[] myArray = new String[2];
        for (int i = 0; i < T; i++) {
            myArray = br.readLine().split(" ");
            xy_array.add(new User(Integer.parseInt(myArray[0]), Integer.parseInt(myArray[1])));
        }
        
        Collections.sort(xy_array);

        for (User user : xy_array) {
            bw.write(user.x + " " + user.y + "\n");
        }
        
        bw.flush();
        bw.close();
        br.close();
    }
}
import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] myArray = br.readLine().split(" ");
        int x = Integer.parseInt(myArray[0]);
        int y = Integer.parseInt(myArray[1]);
        String[] chessArray = new String[x];
        int minChanges = 64; // 최대 변경 가능 수는 8x8 체스판에서 모든 칸을 변경하는 경우
        
        for (int i = 0; i < x; i++) {
            chessArray[i] = br.readLine();
        }

        for (int row = 0; row <= x - 8; row++) {
            for (int col = 0; col <= y - 8; col++) {
                minChanges = Math.min(minChanges, findMinChanges(chessArray, row, col));
            }
        }

        bw.write(minChanges + "");
        bw.flush();
        bw.close();
        br.close();
    }

    private static int findMinChanges(String[] chessArray, int startRow, int startCol) {
        int endRow = startRow + 8;
        int endCol = startCol + 8;
        int changesForW = 0; // 'W'로 시작하는 경우의 변경 수
        int changesForB = 0; // 'B'로 시작하는 경우의 변경 수

        for (int i = startRow; i < endRow; i++) {
            for (int j = startCol; j < endCol; j++) {
                if ((i + j) % 2 == 0) { // 'W'로 시작하는 패턴에서의 기대 색
                    if (chessArray[i].charAt(j) != 'W') changesForW++;
                    if (chessArray[i].charAt(j) != 'B') changesForB++;
                } else { // 'B'로 시작하는 패턴에서의 기대 색
                    if (chessArray[i].charAt(j) != 'B') changesForW++;
                    if (chessArray[i].charAt(j) != 'W') changesForB++;
                }
            }
        }

        return Math.min(changesForW, changesForB); // 두 경우 중 최소 변경 수 반환
    }
}

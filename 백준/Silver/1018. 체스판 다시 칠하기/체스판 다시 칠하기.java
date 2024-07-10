import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] NM = br.readLine().split(" ");
        int N = Integer.parseInt(NM[0]);
        int M = Integer.parseInt(NM[1]);

        char[][] chess = new char[N][M];
        for (int i = 0; i < N; i++) {
            String color = br.readLine();
            for (int j = 0; j < M; j++) {
                chess[i][j] = color.charAt(j);
            }
        }
        br.close();

        String[] board1 = {"WBWBWBWB", "BWBWBWBW"};
        String[] board2 = {"BWBWBWBW", "WBWBWBWB"};
        int count = Integer.MAX_VALUE;
        for (int i = 0; i < N - 7; i++) {
            for (int j = 0; j < M - 7; j++) {
                int count1 = 0;
                int count2 = 0;
                for (int k = i; k < 8+i; k++) {
                    for (int z = j; z < 8+j; z++) {
                        if (chess[k][z] != board1[k%2].charAt(z-j)) {
                            count1 ++;
                        }
                        if (chess[k][z] != board2[k%2].charAt(z-j)) {
                            count2 ++;
                        }
                    }
                }
                count = Math.min(count, Math.min(count1, count2));
            }
        }
        System.out.println(count);
    }
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[][] input = new String[N][2];
        for(int i = 0; i < N; i++){
            String[]temp = br.readLine().split(" ");
            input[i][0] = temp[0];
            input[i][1] = temp[1];
        }
        Arrays.sort(input, Comparator.comparingInt(o -> Integer.parseInt(o[0])));
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<N;i++){
            for(int j=0;j<2;j++){
                sb.append(input[i][j]).append("\n");
            }
        }
        System.out.println(sb);
    }
}
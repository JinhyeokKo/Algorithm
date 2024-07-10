import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer sizeST = new StringTokenizer(br.readLine());
        String[] TP = br.readLine().split(" ");
        int T = Integer.parseInt(TP[0]);
        int P = Integer.parseInt(TP[1]);

        int totalT = 0;
        while(sizeST.hasMoreTokens()){
            int tSize = Integer.parseInt(sizeST.nextToken());
            totalT += (tSize + T - 1) / T;
        }
        System.out.println(totalT);
        System.out.print(N/P + " " + N%P);
        br.close();
    }
}
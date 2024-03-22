import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        ArrayList<Integer> A = new ArrayList<>(N);
        for(int i = 0; i < N; i++) {
            A.add(i+1);
        }
        StringBuilder sb = new StringBuilder();
        int index = 0;
        sb.append("<");
        while (!A.isEmpty()) {
            index = (index + K - 1) % A.size();
            sb.append(A.remove(index));
            if (!A.isEmpty()) sb.append(", ");
        }
        sb.append(">");
        System.out.println(sb);
    }

}
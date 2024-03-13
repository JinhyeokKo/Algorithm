import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        boolean[] count = new boolean[2000001];
        for(int i = 0; i<N; i++){
            count[Integer.parseInt(br.readLine())+1000000] = true;
        }
        for(int i= 0; i<count.length;i++){
            if (count[i]){
                sb.append(i-1000000).append('\n');
            }
        }
        System.out.println(sb);
    }
}
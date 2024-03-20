import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] N = br.readLine().split("");
        int answer = 1;
        for(int i = 0, j = N.length-1; i < N.length-1;i++, j--){
                if(!N[i].equals(N[j])){
                    answer = 0;
                    break;
                }
        }
        System.out.println(answer);

    }
}
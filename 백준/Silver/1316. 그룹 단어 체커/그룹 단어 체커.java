import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int answer = 0;
        for (int i = 0; i < N; i++) {
            String input = br.readLine();
            if (isGroupWord(input)) {
                answer++;
            }
        }
        System.out.println(answer);

    }

    private static boolean isGroupWord(String input) {
        boolean[] check = new boolean[26];
        for(int i = 0; i<input.length(); i++){
            char c = input.charAt(i);
            if(i>0 && input.charAt(i-1)!=c){
                if(check[c-'a']){
                    return false;
                }
            }
            check[c-'a']=true;
        }
        return true;
    }

}
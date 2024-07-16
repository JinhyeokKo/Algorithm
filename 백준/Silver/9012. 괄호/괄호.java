import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.EmptyStackException;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
        int T = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < T; i++) {
            String ps = br.readLine();
            for(int j = 0; j < ps.length(); j++) {
                try{
                    if(String.valueOf(ps.charAt(j)).equals("(")){
                        stack.push(j);
                    }else{
                        stack.pop();
                    }
                }catch(EmptyStackException e){
                    System.out.println("NO");
                    stack.clear();
                    break;
                }
                if(j == ps.length()-1) {
                    if(stack.isEmpty()){
                        System.out.println("YES");
                    }else{
                        System.out.println("NO");
                        stack.clear();
                    }
                }
            }
        }
        br.close();
    }
}
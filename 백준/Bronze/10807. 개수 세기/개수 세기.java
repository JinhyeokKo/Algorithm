import java.util.Scanner;
public class Main {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            int []A = new int[N];
            for (int i = 0; i < N; i++) {
                int r = sc.nextInt();
                A[i] = r;
            }
            int T = 0;
            int v = sc.nextInt();
            for(int i : A){
                if(i == v){
                    T++;
                }
            }
            System.out.println(T);
        }
}

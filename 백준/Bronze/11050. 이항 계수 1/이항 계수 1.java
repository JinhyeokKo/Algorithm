import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int M = 1;
        for(int i = N; i > N-K; i--) {
            M *= i;
        }
        for(int i = 2; i <=K; i++){
            M /= i;
        }
        System.out.println(M);
    }
}
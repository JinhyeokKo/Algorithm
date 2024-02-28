import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] A = new int[3];
        while (true){
            A[0] = sc.nextInt();
            A[1] = sc.nextInt();
            A[2] = sc.nextInt();

            Arrays.sort(A);
            if (A[0] == 0 && A[1] == 0 && A[2] == 0) break;

            System.out.println(A[2]*A[2] == A[0]*A[0] + A[1]*A[1]? "right" : "wrong");
        }
    }
}
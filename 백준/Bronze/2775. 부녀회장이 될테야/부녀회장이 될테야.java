import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i = 0; i < T; i ++){
            int k = sc.nextInt();
            int n = sc.nextInt();
            int [] arr = new int[n];
            for(int j = 0; j<n;j++){
                arr[j] = j+1;
            }
            for(int j = 1; j<=k;j++){
                for(int q = 1; q<n; q++){
                    arr[q] = arr[q-1] + arr[q];
                }
            }
            System.out.println(arr[n-1]);
        }
        sc.close();
    }
}
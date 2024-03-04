import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        String A = sc.next();
        sc.close();
        long R = 0;
        for(int i = 0; i < L; i++){
            R += (long)((A.charAt(i) - 'a' + 1) * Math.pow(31, i));
        }
        System.out.println(R);
    }
}
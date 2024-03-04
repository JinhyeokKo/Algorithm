import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        String A = sc.next();
        sc.close();
        long R = 0;
        long P = 1;
        for(int i = 0; i < L; i++){
            R += ((A.charAt(i) - 'a' + 1) * P);
            P = (P*31)%1234567891;
        }
        System.out.println(R%1234567891);
    }
}
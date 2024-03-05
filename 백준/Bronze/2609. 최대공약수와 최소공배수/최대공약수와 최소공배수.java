import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a = n;
        int b = m;
        sc.close();
        int r;
        if(n>m){
            r=m;
            m=n;
            n=r;
        }
        while(m!=0){
            r = n%m;
            n = m;
            m = r;
        }
        System.out.println(n);
        System.out.println(a*b/n);
    }
}
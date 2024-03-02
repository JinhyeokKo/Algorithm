import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();
        int N2 = N;
        int M = 0;
        while(N2!=0){
            N2/=10;
            M++;
        }

        boolean C = false;
        for(int i = N-M*9;i<N;i++){
            int B = 0;
            String[] A = Integer.toString(Math.abs(i)).split("");
            for(String a:A){
                B+=Integer.parseInt(a);
            }
            if(i+B==N){
                System.out.println(i);
                C = true;
                break;
            }
        }if(!C){
            System.out.println(0);
        }
    }
}
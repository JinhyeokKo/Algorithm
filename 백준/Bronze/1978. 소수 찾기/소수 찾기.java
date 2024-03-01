import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int C = 0;

        for(int i = 0; i< N; i++){
            int M = sc.nextInt();
            if(M>1){
                boolean isPrime = true;
                for(int j =2; j<=Math.sqrt(M); j++){
                    if(M%j == 0){
                        isPrime = false;
                        break;
                    }
                }
                if(isPrime){
                    C++;
                }
            }
        }
        System.out.println(C);
        sc.close();
    }
}

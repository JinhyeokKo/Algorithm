import java.util.Scanner;

public class Main {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int []A = new int[30];
            for (int i = 0; i < 28; i++){
                int submit = sc.nextInt();
                A[submit -1] = 1;
            }
            for(int i = 0; i < A.length; i++){
                if (A[i] != 1){
                    System.out.println(i + 1);
                }
            }
            sc.close();
         }
}

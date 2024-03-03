import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] S = sc.nextLine().split(" ");
        String[] S1 = sc.nextLine().split(" ");
        sc.close();
        int N = Integer.parseInt(S[0]);
        int M = Integer.parseInt(S[1]);
        int R = 0;
        for(int i = 0; i < N-2; i++){
            for(int j = i+1; j<N-1;j++){
                for(int k = j+1; k<N;k++){
                    int temp = Integer.parseInt(S1[i])+Integer.parseInt(S1[j])+Integer.parseInt(S1[k]);
                    if (temp <= M && temp >= R){
                        R = temp;
                    } else if(temp == M){
                        System.out.println(M);
                        break;
                    }
                }
            }
        }
        System.out.println(R);
    }
}
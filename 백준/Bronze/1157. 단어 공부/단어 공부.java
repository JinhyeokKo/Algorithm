import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] S =sc.next().split("");
        int[] A = new int[26];
        for (String s : S) {
            int SN = s.charAt(0);
            if (SN > 96) {
                SN -= 32;
            }
            A[SN - 65]++;
        }
        int Max = 0;
        int MaxIndex = 0;
        int MaxEqual = 0;
        for(int i=0;i<A.length;i++){
            if(Max < A[i]){
                Max = A[i];
                MaxIndex = i;
                MaxEqual = 0;
            }
            else if(Max == A[i]){
                MaxEqual = 1;
            }
        }
        System.out.println((MaxEqual==0?(char)(MaxIndex + 65):"?"));
    }
}
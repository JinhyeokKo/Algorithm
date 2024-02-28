import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] S = sc.nextLine().split(" ");
        String result = "";

        boolean ascending = true;
        boolean descending = true;

        for (int i = 0; i < S.length; i++) {
            int A = Integer.parseInt(S[i]);

            if (A != i + 1) {
                ascending = false;
            }

            if (A != 8 - i) {
                descending = false;
            }
        }

        if (ascending) {
            result = "ascending";
        } else if (descending) {
            result = "descending";
        } else {
            result = "mixed";
        }

        System.out.println(result);
    }
}
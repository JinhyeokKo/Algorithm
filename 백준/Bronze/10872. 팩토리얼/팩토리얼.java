import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextInt();
		if (N == 0|| N==1) {
			N = 1;
		} else {
			for (int i = ((int)N - 1); i > 0; i--) {
				N *= i;
			}
		}
		System.out.println(N);
	}

}

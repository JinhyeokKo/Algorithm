import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];
        String[] ASet = br.readLine().split(" ");
        for(int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(ASet[i]);
        }
        Arrays.sort(A);

        int M = Integer.parseInt(br.readLine());
        int[] B = new int[M];
        String[] BSet = br.readLine().split(" ");
        br.close();
        for(int i = 0; i < M; i++) {
            B[i] = Integer.parseInt(BSet[i]);
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < M; i++) {
            if (binarySearch(A, B[i])) {
                bw.write(1 + "\n");
            } else {
                bw.write(0 + "\n");
            }
        }
        bw.flush();
        bw.close();
    }

    private static boolean binarySearch(int[] A, int key) {
        int start = 0;
        int end = A.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (key < A[mid]) {
                end = mid - 1;
            } else if (key > A[mid]) {
                start = mid + 1;
            } else {
                return true;
            }
        }
        return false;

    }
}
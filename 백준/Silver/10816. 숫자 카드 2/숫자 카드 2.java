import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(list);

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            int key = Integer.parseInt(st.nextToken());
            sb.append(upperBound(list, key) - lowerBound(list, key)).append(' ');
        }
        System.out.println(sb);
    }

    private static int lowerBound(ArrayList<Integer> list, int key) {
        int low = 0;
        int high = list.size();

        while (low < high) {
            int mid = (low + high) / 2;
            if (list.get(mid) >= key) {
                high = mid;
            }else{
                low = mid + 1;
            }
        }
        return low;
    }

    private static int upperBound(ArrayList<Integer> list, int key) {
        int low = 0;
        int high = list.size();
        while (low < high) {
            int mid = (low + high) / 2;
            if (list.get(mid) > key) {
                high = mid;
            }else{
                low = mid + 1;
            }
        }
        return low;
    }
}

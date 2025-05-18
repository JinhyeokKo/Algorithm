import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        
        if(arr == null || arr.length == 0){
            return new int[0];
        }
        
        ArrayList<Integer> arrayList = new ArrayList<>();
        
        arrayList.add(arr[0]);
        
        for (int i = 1; i < arr.length; i++) {
            if (arrayList.get(arrayList.size() - 1) != arr[i]) {
                arrayList.add(arr[i]);
            }
        }
        
        int[] answer = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            answer[i] = arrayList.get(i);
        }
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}
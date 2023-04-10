import java.util.*;

public class Solution {
    public static int[] solution(int[] arr) {


        List<Integer> arrList = new ArrayList<>();

        arrList.add(arr[0]);//arr의 첫번째 원소는 무조건 추가.
        int idx = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arrList.get(Integer.valueOf(idx))) {
                arrList.add(arr[i]);
                idx++;
            }
        }
        int[] answer = new int[arrList.size()];
        for (int i = 0; i < arrList.size(); i++) {
            answer[i] = arrList.get(Integer.valueOf(i));
        }
        return answer;
    }
}
//List를 사용하여 arr의 첫번째 원소를 무조건 추가시켜준다.
//if문을 통해 이전 원소와 다음 원소가 다르면 담고 같으면 담지 않는 식을 추가해줌 

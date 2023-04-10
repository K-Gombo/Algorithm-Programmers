import java.util.*;

class Solution {
    public static int[] solution(int[] numbers) {
        Set<Integer> numAddList = new HashSet<>();

        for(int i= 0 ; i< numbers.length; i++){
            for(int j = i+1; j<numbers.length; j++ ){
                numAddList.add(numbers[i]+numbers[j]);
            }
        }

        int[] answer = new int[numAddList.size()];
        for (int i = 0; i < numAddList.size(); i++) {
            answer[i] = (int) numAddList.toArray()[i];
        }
        Arrays.sort(answer);
        return answer;
    }
}

// 중첩반복을 통해 두 수를 더해주는 for문을 짜준다.
// 크기만큼 반복하여 해당 원소들을 계속 하는 반복문을 짜주는데 Set에는 get이 없으므로 toArray를 사용하여 값을 불러온다.
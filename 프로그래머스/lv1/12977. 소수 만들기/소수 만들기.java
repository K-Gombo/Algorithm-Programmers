import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(int[] nums) {
        int answer = -1;
        int numLen = nums.length;

        List<Integer> sumList = new ArrayList<>();
        for(int i=0; i< numLen-2; i++){
            for(int j=i+1; j<numLen-1; j++){
                for(int k=j+1; k<numLen; k++) {
                    sumList.add(nums[i]+nums[j]+nums[k]);
                }
            }
        }

        System.out.println("sumList = " + sumList);
        //sumList에 있는 숫자들을 소수인지 아닌지 판별하여 카운트
        int count = 0;
        for (Integer integer : sumList) {
            int numcount = 0;
            for(int i = 2; i<integer;i++){
                if(integer%i == 0) {
                    numcount++;
                }
            }
            if(numcount == 0) count++;
        }

        answer = count;


        return answer;
    }
}

//숫자 3개 서로 달라야 한다
//3개숫자 더했을때 소수가 되어야한다.
//
//배열안에 숫자 3개를 고른다.
//각각의 숫자의 합의 배열을 새로 만든다.
//그 배열에서 소수만 count 한다.
//소수 : 약수가 1과 자기자신(1
// 에라토스테네스의체 => 소수판별, 장점: 빠르다. 단점 : 범위제한이있다.
// 우리가 직접구현 => 장점 : 범위제한이 없다. 단점: 느리다.
// isPrime

//{1 , 2, 3, 3, 4, 5, 6,7, 8, 9, 10, ....}
//1. 1을 제거한다.
//{0, 2, 3, 4, 5, 6, 7,8,9,10, ....}
//2. 2를 제외한 배수를 제거한다.
//{0, 2, 3, 0, 5, 0, 7, 0 , 9, 0 , ....}
//3. 3을 제외한 3의 배수를 제거한다.
//{0, 2, 3, 0, 5, 0, 7, 0, 0, 0 , 0 , ..
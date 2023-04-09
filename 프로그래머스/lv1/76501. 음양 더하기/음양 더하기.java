class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        int i = 0;
        for(int absolute : absolutes){
            answer += (signs[i])  ? 1 * absolute : -1 * absolute;
            i++;
            //i += 1;
        }
        return answer;
    }
}

//절대값
//[4, 7, 12]
//사인 (부호)
//[true, false, true] => [4, -7, 12 ] => 총합 :9
// ture : +
// false : -
// 삼항연산자를 통해 signs[i]값이 true일떄 양수값을 answer에 넣고 false면 음수값을 넣어서 계산
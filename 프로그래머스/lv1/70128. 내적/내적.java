class Solution {
    public int solution(int[] a, int[] b) {
        int answer = 0;

        for(int i=0; i<a.length; i++){
            answer += a[i]*b[i];
        }
        return answer;
    }
}
// for문 사용
// answer += a[i]*b[i];
//내적 : a배열원소랑 b배열 원소를 곱한것을 더해준것
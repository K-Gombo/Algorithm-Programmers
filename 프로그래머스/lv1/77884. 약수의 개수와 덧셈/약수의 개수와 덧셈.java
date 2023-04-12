class Solution {
    public int solution(int left, int right) {
        int answer = 0;

        for(int i= left; i<=right; i++){
            int count = 1; //본인도 본인의 약수로 카운트 될 수 있어서
            for(int j=1; j<=i/2; j++){
                if(i % j == 0) {
                    count++;
                }
            }

            if(count % 2 == 0) {
                answer += i;
            } else {
                answer -= i;
            }
                
        }


        return answer;
    }
}
//left ~ right 범위 => 반복문
//1부터 자기자신까지 순차적으로 나눠서 0이 되면 약수이다.
//약수의 개수 파악
//홀수 : 빼기
//짝수 : 더하기
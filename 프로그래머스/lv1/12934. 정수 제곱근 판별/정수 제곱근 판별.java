class Solution {
    public long solution(long n) {
        long answer;

        long sqrt = (long) Math.sqrt(n);

        if(sqrt * sqrt == n){
            answer = (sqrt+1)*(sqrt+1);
        }else {
            answer = -1;
        }
        return answer;
    }
}

//sqrt를 사용하는 제곱근 반환하기.
// Math.sqrt(25) = 루트25 = 5
// Math.pow(a,b) = a^b
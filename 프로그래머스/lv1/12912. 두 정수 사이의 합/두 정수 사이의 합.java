class Solution {
    public long solution(int a, int b) {
        long answer = 0;


        if(a < b) {
            for (int i = a; i <= b; i++) {
                answer = answer + i;
                // 0 = 0 + 3;
                // 3 = 3 + 4;
                // 7 = 7 + 5;
                // 12
            }
        }
        else  {
            for (int i = a; i >= b; i--) {
                answer = answer + i;
                // 0 = 0 + 3;
                // 3 = 3 + 4;
                // 7 = 7 + 5;
                // 12
            }
        }

        return answer;
    }
}
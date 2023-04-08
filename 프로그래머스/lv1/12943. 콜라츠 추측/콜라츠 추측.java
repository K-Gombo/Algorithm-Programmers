class Solution {
    public int solution(int num) {
        int answer = 0;

        while (num != 1) {
            switch (num % 2) {
                case 0:
                    num /= 2;
                    break;
                case 1:
                    num = (num * 3) + 1;
                    break;
            }
            answer++;

            if(answer >500)
            return -1;
        }
        return answer;
    }
}
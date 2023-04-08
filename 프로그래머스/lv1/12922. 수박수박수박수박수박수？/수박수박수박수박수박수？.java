class Solution {
    public String solution(int n) {
        String answer = "";

        for (int i = 1; i <= n; i++) {
            answer += (i % 2 == 1) ? "수" : "박";

        }

        return answer;
    }
}
//for문을 통해 수박이 반복되게하고
//i가 짝수나 홀수 일때 수 or 박을 출력하게 조건문걸기
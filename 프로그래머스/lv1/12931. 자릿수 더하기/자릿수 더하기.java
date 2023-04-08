public class Solution {
    public int solution(int n) {
        int answer = 0;
        String s = Integer.toString(n);

        for (int i=0; i<s.length(); i++){
            answer += Integer.parseInt(s.substring(i,i+1));
        }


        return answer;
    }
}

//방법1. toString 써서 n을 문자열로 변환 ParseInt 사용
//방법2. 10으로 나눠서 구하면 간단합니다.
class Solution {
    public String solution(String s) {
        String answer = "";
        int center = s.length()/2;
        //String 길이가 짝수 일때
        if(s.length()%2==0){
            answer = String.valueOf(s.charAt(center-1)) + String.valueOf(s.charAt(center));

        }
        //String 길이가 홀수 일때
        else{
            answer= String.valueOf(s.charAt(center));
        }
        return answer;
    }
}

// += : 자기 자신에 그다음걸 계속 더해준다
// ex) answer += i  이건 answer= answer+i;
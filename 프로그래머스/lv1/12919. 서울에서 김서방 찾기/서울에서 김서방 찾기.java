class Solution {
    public String solution(String[] seoul) {
        String answer = "";

        for(int i = 0; i<seoul.length; i++){
            if(seoul[i].equals("Kim")){
                answer = "김서방은 "+ i + "에 있다";
                break;
            }
        }
        return answer;
    }
}
// for 문
// .equal 써서 일치하는 요소 판별
// [i]


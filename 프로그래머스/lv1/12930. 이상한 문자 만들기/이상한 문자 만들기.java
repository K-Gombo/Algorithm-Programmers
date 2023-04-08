class Solution {
    public String solution(String s) {
        String answer = "";
        int idx = 0;
        for (int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if (c==' '){
                answer += " ";
                idx = 0;
                continue;
            }
            if ((idx%2)==0){
                answer += String.valueOf(Character.toUpperCase(c));
                idx ++;
            }else{
                answer += String.valueOf(Character.toLowerCase(c));
                idx ++;
            }
        }
        return answer;
    }
}

//for문을 돌려서 입력받은 문자만큼 돌리고 charAt으로 하나 씩 뽑고 = T, R Y 이런식으로 하나씩 문자가 됨
//.c에서 '  ' 이렇게 띄어쓰기 했으면 정답인 문자열에서도 "  " 띄어쓰기 해주기.
//Character.toLowerCase = 소문자출력 ,  Character.toUpperCase = 대문자 출력
// String.valuOf( ) 로 문자열을 해당 ()안에 자료형으로 반환
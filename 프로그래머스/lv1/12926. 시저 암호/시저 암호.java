class Solution {
    public String solution(String s, int n) {
        String answer = "";
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<s.length();i++){
            char ch = s.charAt(i);
            if ((('A' <= ch && ch <= 'Z') || ('a' <= ch && ch <='z'))) {
                if(('A' <= ch && ch <= 'Z')) {
                    if (ch + n > 'Z') {
                        ch = (char) (ch - ('Z' - 'A' + 1));
                    }
                } //'Z' -'A' => 122 - 97 => 25 (+1)
                // 13 -10 = 3
                if(('a' <= ch && ch <='z')){
                    if(ch+n > 'z') {
                        ch = (char) (ch-('Z'-'A'+1));
                    }
                }
                sb.append((char)(ch + n));
            }

             else {
                sb.append(ch);
            }
        }
         answer = sb.toString();
        

        //z를 넘어갈 경우 처리 : z가 넘어가면 다시 a부터시작
        //공백이 있을경우

        return answer;
    }
}
//char => 2byte => 16비트 => 2^16
//for문을돌려서 각 자리수마다 문자(charactor)를 불러와서 아스키코드로 변환 그후 +n을 해주면됨.
//아스키코드
//A = 65; + 4  => 69 => (char)69 => 'B'
//69 => E;
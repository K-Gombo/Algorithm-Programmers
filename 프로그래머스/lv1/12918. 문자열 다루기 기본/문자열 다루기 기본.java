class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        if(s.length() == 4 || s.length() == 6 ) {
            char ch = ' ';
            for(int i =0; i<s.length(); i++){
                ch = s.charAt(i);
            if(ch< '0' || ch > '9') {
                    answer = false;
                }

            }
        }else
        answer = false;
        return answer;
    }
}

//for 문 사용하여 길이만큼 돌리고,
//charAt로 문자를 반환해서 하나씩 뽑아서 비교
//안에있는 문자가 if 조건문으로 '0'보다 작거나 '9'보다 크면 false 출력 (숫자가 아니면 false)class Solution {
    
class Solution {
    boolean solution(String s) {
        boolean answer = true;

        int count = 0;
        char ch = ' ';
        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            if (ch == 'p' || ch == 'P') {
                count++;
            } else if (ch == 'y' || ch == 'Y') {
                count--;
            }
        }
        if (count != 0) {
            answer = false;
        }

        return answer;
    }
}

//charAt 사용,
//for문을 문자열 길이만큼 돌리면서 charAt으로 p인지 y인지 케이스를 나눠서
//p일때 cnt ++;  , y일때 cnt --;

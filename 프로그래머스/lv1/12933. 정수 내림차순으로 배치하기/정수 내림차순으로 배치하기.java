import java.util.Arrays;

class Solution {
    public long solution(long n) {
        String str = String.valueOf(n); // n을 string으로 변환
        char[] s = str.toCharArray(); // str 한자리씩을 array에 저장
        Arrays.sort(s); //오름차순으로 정렬
        String answer = new StringBuilder(new String(s)).reverse().toString(); // 내림차순 정렬


        return Long.parseLong(answer); // 리턴할때 long 타입으로 받아오기 위해
    }
}
//Arraylist 사용
//StirngBuilder로 변경가는한 문자열 만들기.
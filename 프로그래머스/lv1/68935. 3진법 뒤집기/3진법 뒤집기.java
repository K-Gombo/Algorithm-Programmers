import java.util.ArrayList;

    class Solution {
        public static int solution(int n) {
            int answer = 0;

            ArrayList<Integer> arrayList = new ArrayList<>();
            //자연수 n을 3진법으로 변환하여 reverse를 통해 역순으로 저장
            while (n>0){
                arrayList.add(n%3);
                n /= 3;
            }

            //3진법을 10진법으로 변환
            int idx = 0;
            for(int i = arrayList.size() - 1; i >= 0; i-- ){
                answer += arrayList.get(Integer.valueOf(i)) * Math.pow(3, idx);
                System.out.println(answer);
                idx++;
            }
            return answer;
        }
}
//자연수 n을 3진법으로 바꾼다.
//배열 선언 ArrayList
//반복문으로 자연수 n을 3으로 나눈 나머지를 넣어준다. (n > 0)
//list.size() 반복 Math.pow(3, i) * 인덱스의 값 -> answer +

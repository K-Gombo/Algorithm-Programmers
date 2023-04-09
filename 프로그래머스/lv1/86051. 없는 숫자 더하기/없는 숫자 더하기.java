class Solution {
    public int solution(int[] numbers) {
        int answer = 45;
        for (int number : numbers) {
            answer -= number;
        }

        //배열의 길이
//        int arrLength = numbers.length;    //위  향상된 포문이랑 같은 형태임 for문
//        for (int i=0; i<arrLength; i++){
//           answer -= numbers[i];
//        }
        //배열 길이가 4
        //0 1 2 3

        return answer;
    }
}
//[1,2,3,4,6,7,8,0]	=> 5랑 9가 없음 => 14
//[5,8,4,0,6,7,9] = > 1, 2, 3 이 없음 => 6

//구현해보기
//0~9를 일단 다 더함
//배열에 숫자를 다빼주면
// 결국남는 숫자는 5+9 일거임

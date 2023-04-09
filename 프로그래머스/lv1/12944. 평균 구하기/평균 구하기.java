class Solution {
    public double solution(int[] arr) {
        double answer = 0;

        for (int a : arr) {
            answer += a;
        }

        return answer / arr.length;
    }
}

//다 더한값에 배열의길이만큼 나눈다.
// 배열의 원소를 모두 더한다 ( arr의 원소들을 a변수에 하나씩 다담았고 +=로 다 더해줌)
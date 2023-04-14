import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        int count = 0;

        int arrLength = arr.length;
        for (int i=0; i<arrLength; i++) {
            if(arr[i]%divisor==0){
                count++;
                //continue; => 조건문으로바로 진입
                //break; => 해당 조건문 종료
            }else {
                arr[i] = 0;
            }
        }      

        int j = 0;
        answer = new int[count];
        for(int i =0; i<arrLength; i++) {
            if (arr[i] != 0) {
                answer[j] = arr[i];
                j++;
            }
        }

        if(count ==0){
            answer = new int[1];
            answer[0] = -1;
        }

        Arrays.sort(answer);
        return answer;
    }
}

//배열을 받아서 divisor로 나누어 떨어지는 지 확인 -> 그대로 놔두기
//나누어 떨어지면  0바꾸기
//배열의 길이는 0이 아닌수들의 갯수

//바뀐 배열을 확인했을때 0이 아니면 answer에 0이면 담지않기
//나누어 떨어지지 않으면 담지 않기

//answer배열 정렬하기
//모두 나누어 떨어지지 않아 answer의 배열의 길이가 0이면 -1담기

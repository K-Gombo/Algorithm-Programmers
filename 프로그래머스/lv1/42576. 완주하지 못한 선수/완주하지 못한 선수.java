import java.util.Arrays;


class Solution {
    public String solution(String[] participant, String[] completion) {
       
        Arrays.sort(participant);
        Arrays.sort(completion);

        int i;
        for(i = 0; i<completion.length;i++){
            if(!participant[i].equals(completion[i])){
                return participant[i];
            }
        }
        return participant[participant.length-1];
        
     }

}

//Arraysort 로 각 배열 정렬
//for문을 사용하여 원소들을 비교해서 완주자 배열에있는 같지 않은 사람을 출력
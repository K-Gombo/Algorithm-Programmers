class Solution {
    public int[] solution(int[] arr) {

        if(arr.length == 1){
            int[] answer = {-1};
            return answer;
        }
        int[] answer = new int[arr.length-1]; // 배열 길이가 1보다 클때, 가장 작은 수를 뺀 배열로 답 지정

        int min = arr[0]; // 기준값

        for(int i=0; i< arr.length; i++){
            min =Math.min(min,arr[i]);
        } // min 최솟값 > 가장 작은 수 구하기

        int index = 0; // 가장 작은 수가 한개가 아닐수 있기 때문에 변수 하나 지정

        for ( int i=0;i< arr.length;i++){
            if(arr[i] == min){
                continue;
            }
            answer[index++] = arr[i];

        }
        return answer;
    }
}

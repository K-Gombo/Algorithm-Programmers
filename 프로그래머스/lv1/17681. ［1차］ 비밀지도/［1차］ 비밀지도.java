class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for(int i =0 ; i< n; i++){  //지도에서 해당 칸을 이진수로 변환
            String b = Integer.toBinaryString(arr1[i] | arr2[i]);
            b = String.format("%"+n+"s",b);
            b = b.replaceAll("1","#");
            b = b.replaceAll("0"," ");
            System.out.println(b);
            answer[i] = b;
        }

        return answer;
    }
}
//비트연산으로 풀면 됨
//replaceALL을 사용해서 문자변환
//toBinaryString를 사용해서 정수값을 2진수로 표시
//String format을 이용해서 문자열 형식을 정해줌 

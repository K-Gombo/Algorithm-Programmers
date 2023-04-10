
class Solution {
    public static int solution(int[][] sizes) {
        int answer = 0;
        int garo =0;
        int sero =0;

        //가로길이에서 최대값과 세로길이 에서 최댓값을 구해줌.
        for (int i = 0; i < sizes.length; i++) {
            garo = Math.max(garo, Math.max(sizes[i][0],sizes[i][1]));
            System.out.println(i + " : "+garo);
            sero = Math.max(sero, Math.min(sizes[i][0],sizes[i][1]));
            System.out.println(i + " : "+sero);
        }

        answer = garo*sero;
        return answer;
    }
}

//가로길이 세로길이 젤 큰걸 찾는다.
// 가로놓았을 때 크기 구하기 , 세로놓았을 때 크기 구하기.
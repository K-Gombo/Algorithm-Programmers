class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int row = arr1.length;
        int column = arr1[0].length;
        int[][] answer = new int[row][column];
        //new int[i][j];

        for(int i=0; i<arr1.length;i++){
            for(int j=0; j<arr2[0].length; j++){
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return answer;
    }
}
// toString은 for문으로 일일이 뽑아야할것을 한 번에 뽑아줌
//2 x 2 => 됨
// 2 x 3 => 안됨

//배열의 길이
//arr 1 = [ x
//            , y ]  => 배열의 길이2

//arr 1 = [ [1, 2, 3]
//              , [ y] ]
//x = [ 1, 2, 3] => 배열의 길이 3
//y = [4, 5, 6] = > 배열의 길이 3
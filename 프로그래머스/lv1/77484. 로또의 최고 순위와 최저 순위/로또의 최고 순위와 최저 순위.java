import java.util.Objects;

class Solution {
    public static int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int cnt = 0;
        int zeroCnt = 0;
        for (int i = 0; i < lottos.length; i++) {
            for (int j = 0; j < lottos.length; j++) {
                if (Objects.equals(lottos[i], win_nums[j])) {
                    cnt++;
                    break;
                }else if (Objects.equals(lottos[i], 0)) {
                    zeroCnt++;
                    break;
                }
            }
        }
        int[] winArr = {cnt+zeroCnt, cnt};
        for (int i = 0; i < winArr.length; i++) {
            switch (winArr[i]) {
                case 6:
                    answer[i] = 1;
                    break;
                case 5:
                    answer[i] = 2;
                    break;
                case 4:
                    answer[i] = 3;
                    break;
                case 3:
                    answer[i] = 4;
                    break;
                case 2:
                    answer[i] = 5;
                    break;
                default:
                    answer[i] = 6;
                    break;
            }
        }
        return answer;
    }
}

//1.당첨번호 로또 번호 비교해서 일치하는 번호 갯수구하기. success
//2.0뺴고 고고
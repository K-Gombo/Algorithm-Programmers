class Solution {
    public int[] solution(int[] answers) {
        int[] answer ;
        int[] supo1= {1, 2, 3, 4, 5};
        int[] supo2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] supo3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};



        int answersLen = answers.length;
        int supo1Len = supo1.length;
        int supo2Len = supo2.length;
        int supo3Len = supo3.length;
        int supo1Score = 0;
        int supo2Score = 0;
        int supo3Score = 0;

        //1번 수포자 답안 비교
        int j = 0;
        for(int i =0; i < answersLen; i++) {
            if(answers[i] == supo1[j]) {
                supo1Score++;
            }
                j = (j + 1) % supo1Len;
        }
        //13242
        //12345

        //2번 수포자 답안 비교
        j=0;
        for(int i =0; i < answersLen; i++) {
            if(answers[i] == supo2[j]) {
                supo2Score++;
            }
                j = (j + 1) % supo2Len;

        }

        //3번 수포자 답안 비교
        j=0;
        for(int i =0; i < answersLen; i++) {
            if(answers[i] == supo3[j]) {
                supo3Score++;
            }
                j = (j + 1) % supo3Len;

        }

//        System.out.println("supo1 = " + supo1Score);
//        System.out.println("supo2 = " + supo2Score);
//        System.out.println("supo3 = " + supo3Score);

        //최고점수 찾기
        int max_score = supo1Score;
        if(supo2Score > max_score) {
            max_score = supo2Score;
        }
        if(supo3Score > max_score){
            max_score = supo3Score;
        }

        //최고점수와 같은 점수 찾기
        int maxCount = 0;
        if(max_score == supo1Score) {
            maxCount++;
        }
        if(max_score == supo2Score) {
            maxCount++;
        }
        if(max_score == supo3Score) {
            maxCount++;
        }
        answer = new int[maxCount];

        //배열에 넣기
        int k = 0;
        if(max_score == supo1Score) {
            answer[k] = 1;
            k++;
        }
        if(max_score == supo2Score) {
            answer[k] = 2;
            k++;
        }
        if(max_score == supo3Score)
            answer[k] = 3;


        return answer;
    }
}
//1번 수포자 : 1, 2, 3, 4, 5 ...   5개 1주기
//2번 수포자 : 2, 1, 2, 3, 2, 4, 2, 5 ...  8개가 1주기
//3번 수포자 : 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 ... 10개가 1주기

//while문을 돌려서

// answer => 1, 2, 3 , 5 ,4 ,6
// supo1 => 1, 2, 3, 4, 5, 1

//배열이 크기가 정해져있음 =>
//최고 점수인 애들의 수를 세야함 => 배열의 크기를 정하기위해
//최고 점수를 킵해놓을 변수를 만들고
//supo들의 점수를 비교해서 최고점수와 같으면 넣기
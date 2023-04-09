class Solution {
    public String solution(String phone_number) {
        //split으로 각각의 문자열을 잘라 배열에 넣기
        String [] phone = phone_number.split("");

        //전화번호 4자리 이전까지 반복
        for(int i=0; i<phone.length-4; i++){
            phone[i] = "*";
        }
        //배열에 있는 요소들을 String타입으로 묶어주기
        return String.join("",phone);
    }
}

//방법:뒤에 4자리 빼고 자르기
//for문에서 phone의 길이에서 4자리를 뺀만큼만 *로 찍기
//String.join으로 요소들을 이어주기.
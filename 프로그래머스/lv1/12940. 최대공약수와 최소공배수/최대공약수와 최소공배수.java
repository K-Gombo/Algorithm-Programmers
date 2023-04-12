class Solution {
    public int[] solution(int n, int m) {

        int gcd = gcd(n,m); //최대공약수 구하기
        int lcm = n * m / gcd; //최소공배수 구하기
        int[] answer = {gcd, lcm};
        return answer;
    }


    //유클리드 호제법
    public static int gcd(int a, int b) {

        if (b == 0) return a;

        return gcd(b, a%b);
    }
}
//[1, 2, 3, 4, 5] => 9 : 1, 3, 5  // 2, 3, 4

//유클리드 호제법
//  큰수  작은수      나머지
//   a      b     a%b = c
//   b      c     b%c = d
//   c      d        0
//나머지가 0일때 작은수(d)가 최대 공약수(gcd)


//math.max & math.min 써서 큰수 작은수 뽑아서
//최대 공약수(유클리드 호제법) 구하고
//두수를 곱해서 최대공약수로 나눈 값이 최소 공배수 이므로







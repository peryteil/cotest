public class Solution16 {
    class Solution {
        public int solution(int number, int n, int m) {
            int answer = 0;
            //number가 n과m 모두로 나누어 떨어지는지 확인하고, 그렇다면 1을 반환
            //그렇지 않다면 기본값 0을 반환
            if(number % n == 0 && number % m == 0){
                answer = 1;
            }
            return answer;
        }
    }
}

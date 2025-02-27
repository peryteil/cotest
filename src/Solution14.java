public class Solution14 {
    class Solution {
        public int solution(int a, int b) {
            int answer = 0;
            String str1 = String.valueOf(a);
            String str2 = String.valueOf(b);
            int a1= Integer.parseInt(str1+str2);
            int b1= Integer.parseInt(str2+str1);
            answer=Math.max(a1,2*a*b);
            return answer;
        }
    }
}

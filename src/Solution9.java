public class Solution9 {

    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        int l = overwrite_string.length();
        int l2 = my_string.length();

        answer = my_string.substring(0,s) + overwrite_string+ my_string.substring(s+l,l2);
        return answer;
    }
}
//코드 흐름
//overwrite_string의 길이 l을 계산
//my_string의 길이 l2를 계산
//문자열을 세 부분으로 나누고
//        my_string.substring(0, s): s 이전의 부분을 가져옴.
//overwrite_string: 덮어쓸 문자열을 삽입.
//        my_string.substring(s + l, l2): 덮어쓰기가 끝난 후 나머지 문자열을 추가.
//위 세 개를 연결하여 새로운 문자열을 생성하고 반환.

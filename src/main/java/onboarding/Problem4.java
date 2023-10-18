package onboarding;

public class Problem4 {

     private final static int MIN_RANGE_NUM = 1;
     private final static int Max_RANGE_NUM = 1000;
    public static String solution(String word) {
        validateLength(word);

        char[] charArray = word.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char chWord : charArray) {
            sb.append(changeAlphabet(chWord));
        }

        String answer = sb.toString();
        return answer;
    }

    private static char changeAlphabet(char ch) {
        int changeAscii = (int)ch;  // 문자를 아스키코드로 변환 전처리
        if (65 <= changeAscii  && changeAscii <= 90) {
            return (char)(91 - (changeAscii - 64));
        }
        if (97 <= changeAscii && changeAscii <= 122) {
            return (char)(123 - (changeAscii - 96));
        }
        return ch;
    }

    private static void validateLength(String input) {
        int inputLength = input.length();
        if (inputLength < MIN_RANGE_NUM || inputLength > Max_RANGE_NUM) {
            throw new IllegalArgumentException("문자열 길이는 1~1000.")
        }
    }
}

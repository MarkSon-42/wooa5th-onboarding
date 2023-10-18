package onboarding;

import java.util.Stack;
public class Problem2 {

    private final static int MIN_RANGE_NUM = 1;
    private final static int MAX_RANGE_NUM = 1000;

    public static String solution(String cryptogram) {

        validateLower(cryptogram);
        validateRange(cryptogram);

        // 복호화된 값 String answer에 담기
        String answer = decryptionGame(cryptogram);
        return answer;
    }

    private static String decryptionGame(String cryptogram) {
        while (true) {
            Stack<Character> stack = new Stack<>();  // 문자열 빈 스택 선언
            int index = 0;
            int count = 0;
            boolean flag = false;
            boolean isEnd = true;

            // 사용된 자바 메서드
//            empty() : 데이터(문자열, 리스트 등)가 비어있는지 확인하는 용도
//            peek() : stack, queue에서 맨 위 요소를 제거하지 않고 가져옴
//            charAt() : Java의 String클래스에서 제공하는 메서드, 문자열내 특정 인덱스에 있는 문자를 검색하는데 사용
            while (index != cryptogram.length()) {  // 대상 문자열의 길이가 0이 아닐때 까지 반복
                if (!stack.empty()) {  // 스택이 비어있지 않으면
                    if (stack.peek() == cryptogram.charAt(index)) {  // 현재 문자와 스택의 맨 위 문자를 비교 -> 둘다 같으면 연속된 문자
                        flag = true;  // 연속으로 중복된 문자임을 표시
                        isEnd = false;
                        count += 1;
                    }
                    else {
                        if (flag) {
                            // 중복 문자가 있었으면 (flag == true이면) 해당 중복 문자들을 스택에서 제거
                            for (int i = 0; i <= count; i++) {  //중복문자 개수만큼 스택에서 pop
                                stack.pop();
                            }
                            count = 0;
                            flag = false;
                        }
                    }
                }
                // 현재 문자를 스택에서 추가
                stack.add(cryptogram.charAt(index));
                index += 1;
            }

            // 중복 문자가 마지막에 남은 경우 예외 처리
            if (flag) {
                for (int i = 0; i <= count; i++) {
                    stack.pop();
                }
            }

            StringBuilder sb = new StringBuilder();
            for (char ch : stack) {
                sb.append(ch);
            }
            cryptogram = sb.toString(); // toString()   StringBuilder를 String으로 변환

            if (isEnd) break;
        }

        return cryptogram;
    }

    private static void validateRange(String input) {
        int inputLength = input.length();
        if (inputLength < MIN_RANGE_NUM || inputLength > MAX_RANGE_NUM) {
            throw new IllegalArgumentException("길이 제한 1~1000.");
        }
    }

    private static void validateLower(String input) {
        if (!input.toLowerCase().equals(input)) {
            throw new IllegalArgumentException("소문자만");
        }
    }
}

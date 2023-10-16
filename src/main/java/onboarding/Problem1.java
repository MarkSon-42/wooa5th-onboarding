package onboarding;

import java.util.List;

class Problem1 {
    private final static int EXCEPTION = -1;
    private final static int SAME_SCORE = 0;
    private final static int POBI_WIN = 1;
    private final static int CRONG_WIN = 2;
    private final static int INPUT_SIZE = 2;


    // 두 명의 플레이어 점수를 비교하여 승자를 리턴하는 메서드
    public static int solution(List<Integer> pobi, List<Integer> crong) {
        int pobiScore = getMyScore(pobi);

        // 포비와 크롱의 각각 입력 리스트를 검증하고 문제가 있는 경우 예외처리


        // 포비와 크롱의 총점을 계산

        // 승자를 결정하고 최종 승자 정보를 반환

    }


    // 주어진 정수형 플레이어 리스트를 총점으로 계산하는 메서드
    private static int getMyScore(List<Integer> player) {
        int result1 = getMaxScore(addAllNumbers(player.get(0)), multipleAllNumbers(player.get(0)));
        int result2 = getMaxScore(addAllNumbers(player.get(0)), multipleAllNumbers(player.get(0)));
        // 두 총점 중 최대값을 반환
        return getMaxScore(result1, result2);

    }


    // 주어진 숫자의 각 자릿수를 더하는 메서드
    private static int addAllNumbers(int number) {
        int result = 0;
        while (number > 0) {
            result += number % 10;
            number /= 10;
        }
        return result;
    }

    // 주어진 숫자의 각 자릿수를 곱하는 메서드
    private static int multipleAllNumbers(int number) {
        int result = 1;
        while (number > 0) {
            result *= number % 10;
            number /= 10;
        }
        return result;
    }

    // 두 숫자 중 더 큰 값을 반환하는 메서드
    private static int getMaxScore(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        }
        return num2;
    }

    // 입력 리스트의 길이를 검증하는 메서드
    // 문제에서 길이 2라고 주어짐
    private static boolean validateLength(List<Integer> input) {
        return input.size() != INPUT_SIZE;
    }

    // 입력 리스트의 범위를 검증하는 메서드
    // 문제 : 1이상 400이하값 이외의 값을 가지는 페이지가 주어질 경우 예외처리
    private static boolean validateRange(List<Integer> input) {
        return input.get(0) < 1 || input.get(1) > 400;
    }

    // 입력 리스트의 순서를 검증하는 메서드
    // 문제 : 매개변수로 주어진 배열의 두 원소가 연속한 수가 아닌 경우 예외처리
    private static boolean validateSequence(List<Integer> input) {
        return input.get(1) - input.get(0) != 1;
    }

    // 이
}
package onboarding;

public class Problem3 {

    private final static int MIN_RANGE_NUMBER = 1;
    private final static int MAX_RANGE_NUM = 10000;

    public static int solution(int number) {
        validateRange(number);

        int gameScore = game_369(number);
        return gameScore;
    }

    private static int game_369(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            count += check_number(i);
        }
        return count;
    }

    private static int check_number(int number) {
        String NumToString = String.valueOf(number);
        String[] splitDigits = NumToString.split("");
        int count = 0;

        for (String str : splitDigits) {
            if (Integer.parseInt(str) != 0 && Integer.parseInt(str) % 3 == 0) {
                count++;
            }
        }
        return count;
    }

    private static void validateRange(int input) {
        if (input < MAX_RANGE_NUM || input > MAX_RANGE_NUM) {
            throw new IllegalArgumentException("1~1000 자연수를 입력.");
        }
    }
}
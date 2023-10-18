package onboarding;

import java.util.List;

class Problem1_review {

    // static 상수들을 정의하기
    // 예외, 동점, 포비 승리, 크롱 승리, 입력 사이즈
    private final static int EXCEPTION = -1;
    private final static int SAME_SCORE = 0;
    private final static int POBI_WIN = 1;
    private final static int CRONG_WIN = 2;
    private final static int INPUT_SIZE = 2;






    // 두 명의 플레이어(포비와 크롱) 점수를 정수형 리스트로 받아서 비교하여 승자를 리턴하는 메서드

    public static int solution(List<Integer> pobi, List<Integer> crong) {

        // 포비와 크롱의 각각 입력 리스트를 검증하고 문제가 있는 경우 예외처리
        if (validateLength(pobi) || validateRange(pobi) || validateSequence(pobi) || validateOddOrEven(pobi)) {
            return EXCEPTION;
        }
        if (validateLength(crong) || validateRange(crong) || validateSequence(crong) || validateOddOrEven(crong)) {
            return EXCEPTION;
        }

        // 포비와 크롱의 총점을 계산 hint : getMyScore()


        // 승자를 결정하고 최종 승자 정보를 반환 : 포비와 크롱의 점수 비교

    }










    // 주어진 정수형 플레이어 리스트를 총점으로 계산하는 메서드 getMyScore()
    // hint : 곱한값, 더한값 두 값을 비교하여 큰값을 리턴하도록 구현
    // getMyScore()가 getMaxScore()를 호출하게끔

    private static int getMyScore(List<Integer> ) {

    }


    // 주어진 숫자의 각 자릿수를 더하는 메서드


    private static int addAllNumbers(int number) {
        int result = 0;
        while(number > 0) {
            result += number % 10;  // 각 자릿수를 더해줄때 나누기 10을 한 나머지를 결과값에 반복해서 더해주기
            number /= 10;  // 다음 자릿수를 더해주기 위해 결과값을 10을 나눈 몫으로 갱신하기
        }
        return result;
    }



    // 주어진 숫자의 각 자릿수를 곱하는 메서드

    private static int multiplyAllNumbers(int number) {
        int result = 1;  // 곱하기 0을 방지하기 위해서 result를 1로 초기화 _문제에 해당 조건 제시되어 있음_
        while(number > 0) {
            result *= number % 10;
            number /= 10;
        }
        return result;
    }



    // 두 숫자 중 더 큰 값을 반환하는 메서드
    private static int getMaxScore(int number1, int number2) {
        if (number1 > number2) {
            return number1;
        }
        return number2;
    }


    // 검증하기 4가지 메서드 구현 hint : Java boolean의 default value : false


    // 입력 리스트의 길이를 검증하는 메서드
    // 문제에서 길이 2라고 주어짐
    // hint : .size()
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

    private static boolean validateOrder(List<Integer> input) {
//        if (input.get(1) - input.get(0) != 1) {
//            return false;
//        }
//        return true;
        return input.get(1) - input.get(0) != 1;
        // input.get(1)-input.get(0)이 1이면 false를 반환.
        // input.get(1)-input.get(0) = 124-123 = 1
        // 1 != 1은? false;
        // return을 쓰고 바로 조건박고 끝내기 -> false리턴을 의도
    }

    // 입력 리스트의 홀수/짝수를 검증하는 메서드

    private static boolean validateOddEven(List<Integer> input) {
        return input.get(0) % 2 == 1 && input.get(1) % 2 == 0;
        // 첫번째 수가 홀수이고 두번째 수가 짝수이면 false를 출력
        // java는 기본적으로 return false;이기 때문에 위 &&문이 다 참이면 false를 반환.
        // 그래야 위에서 4가지 검증 함수를 ||로 돌릴떄 하나라도 true이면 예외를 리턴하게 할 수 있음!
        }
}


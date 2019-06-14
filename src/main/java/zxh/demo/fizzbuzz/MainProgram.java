package zxh.demo.fizzbuzz;

/**
 * MainProgram:
 * @author zhangxuhai
 * @date 2019-06-14
*/
public class MainProgram {

    public static class FizzBuzzFilter {

        private FizzBuzzFilter() {
        }

        public static boolean isFizzBuzz(int input) {
            return isFizz(input) && isBuzz(input);
        }

        public static boolean isFizz(int input) {
            return isRemainderZero(input, 3) || isContains(input, "3");
        }

        public static boolean isBuzz(int input) {
            return isRemainderZero(input, 5) || isContains(input, "5");
        }

        private static boolean isContains(int input, String s) {
            return String.valueOf(input).contains(s);
        }

        private static boolean isRemainderZero(int input, int i) {
            return input % i == 0;
        }
    }


    public String process(int start, int end, int step) {
        StringBuilder builder = new StringBuilder();
        String tmpResult;
        for (int i = start; i <= end; i += step) {
            tmpResult = String.valueOf(i);

            if (FizzBuzzFilter.isFizz(i)) {
                tmpResult = "Fizz";
            }

            if (FizzBuzzFilter.isBuzz(i)) {
                tmpResult = "Buzz";
            }

            if (FizzBuzzFilter.isFizzBuzz(i)) {
                tmpResult = "FizzBuzz";
            }

            builder.append(tmpResult).append("\n");
        }

        return builder.toString();
    }
}

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

        public static boolean isFizz(int input) {
            return input % 3 == 0 || String.valueOf(input).contains("3");
        }

        public static boolean isBuzz(int input) {
            return input % 5 == 0 || String.valueOf(input).contains("5");
        }

        public static boolean isFizzBuzz(int input) {
            return isFizz(input) && isBuzz(input);
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

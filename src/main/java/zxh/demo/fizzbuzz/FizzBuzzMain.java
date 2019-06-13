package zxh.demo.fizzbuzz;

/**
 * FizzBuzzMain:
 * @author zhangxuhai
 * @date 2019-06-13
*/
public class FizzBuzzMain {

    public static class Filter {

        private Filter() {
            // empty
        }

        public  static boolean isFizz(int input) {
            return input % 3 == 0 || String.valueOf(input).contains("3");
        }

        public static boolean isBuzz(int input) {
            return input % 5 == 0 || String.valueOf(input).contains("5");
        }

        public static boolean isFizzBuzz(int input) {
            return isFizz(input) && isBuzz(input);
        }
    }

    public String processor(int start, int end, int step) {
        StringBuilder builder = new StringBuilder();

        for (int i = start; i <= end; i += step) {
            String result = String.valueOf(i);

            if (Filter.isFizz(i)) {
                result = "Fizz";
            }

            if (Filter.isBuzz(i)) {
                result = "Buzz";
            }

            if (Filter.isFizzBuzz(i)) {
                result = "FizzBuzz";
            }

            builder.append(result).append("\n");
        }

        return builder.toString();
    }

}

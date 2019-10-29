package zxh.demo.fizzbuzz;

/**
 * FizzBuzz:
 * @author zhangxuhai
 * @date 2019/10/29
*/
public class FizzBuzz {

    public static String calculate(int i) {

        if (isFizzBuzz(i)) {
            return "FizzBuzz";
        }

        if (isFizz(i)) {
            return "Fizz";
        }

        if (isBuzz(i)) {
            return "Buzz";
        }

        return String.valueOf(i);
    }

    private static boolean isFizzBuzz(int i) {
        return isFizz(i) && isBuzz(i);
    }

    private static boolean isBuzz(int i) {
        return i % 5 == 0;
    }

    private static boolean isFizz(int i) {
        return i % 3 == 0;
    }
}

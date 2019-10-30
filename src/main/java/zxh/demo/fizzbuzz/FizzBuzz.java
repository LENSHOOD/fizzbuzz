package zxh.demo.fizzbuzz;

import java.util.stream.IntStream;

/**
 * FizzBuzz:
 * @author zhangxuhai
 * @date 2019/10/30
*/
public class FizzBuzz {

    private static final int MIN = 1;
    private static final int MAX = 50;

    public String process(int from, int to) {
        if (from < MIN || to > MAX) {
            throw new FizzBuzzException("The valid input range is 1 to 50");
        }

        StringBuilder result = new StringBuilder();
        IntStream.range(from, to + 1).forEach(i -> result.append(calculate(i)).append(" "));

        System.out.println(result);
        return result.toString();
    }

    public String calculate(int i) {
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

    private boolean isFizzBuzz(int i) {
        return isFizz(i) && isBuzz(i);
    }

    private boolean isBuzz(int i) {
        return i % 5 == 0;
    }

    private boolean isFizz(int i) {
        return i % 3 == 0;
    }
}

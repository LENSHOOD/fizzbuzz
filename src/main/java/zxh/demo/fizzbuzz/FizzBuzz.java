package zxh.demo.fizzbuzz;

import zxh.demo.fizzbuzz.exception.FizzBuzzException;

import java.util.stream.IntStream;

/**
 * FizzBuzz:
 * @author zhangxuhai
 * @date 2019/11/4
*/
public class FizzBuzz {

    private static final int MIN = 1;
    private static final int MAX = 100;

    public String process(int from, int to) {
        if (from < MIN || to > MAX) {
            throw new FizzBuzzException("Invalid input range!");
        }

        StringBuilder result = new StringBuilder();
        IntStream.range(from, to + 1).forEach(i -> result.append(calculate(i)).append(" "));

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

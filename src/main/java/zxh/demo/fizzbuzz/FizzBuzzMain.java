package zxh.demo.fizzbuzz;

import java.util.stream.IntStream;

/**
 * FizzBuzzMain:
 * @author zhangxuhai
 * @date 2019/10/28
*/
public class FizzBuzzMain {

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

    public String input(int from, int to) {
        validateUserInput(from, to);

        StringBuilder result = new StringBuilder();
        IntStream.range(from, to + 1).forEach(
                i -> result.append(calculate(i)).append(" ")
        );

        return result.toString();
    }

    private void validateUserInput(int from, int to) {
        if (from <= 0 || to <= 0) {
            throw new IllegalArgumentException("Input range cannot be negative.");
        }

        if (from >= to) {
            throw new IllegalArgumentException("Illegal range.");
        }

        if (to > 999) {
            throw new IllegalArgumentException("Cannot greater than 999");
        }
    }
}

package zxh.demo.fizzbuzz;

import java.util.stream.IntStream;

/**
 * FizzBuzzMain:
 * @author zhangxuhai
 * @date 2019/10/28
*/
public class FizzBuzzMain {

    public String input(int from, int to) {
        validateUserInput(from, to);

        StringBuilder result = new StringBuilder();
        IntStream.range(from, to + 1).forEach(
                i -> result.append(FizzBuzzNumber.create(i).say()).append(" ")
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

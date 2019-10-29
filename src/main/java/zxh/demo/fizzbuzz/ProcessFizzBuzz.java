package zxh.demo.fizzbuzz;

import java.util.stream.IntStream;

/**
 * IterationNumber:
 * @author zhangxuhai
 * @date 2019/10/29
*/
public class ProcessFizzBuzz {

    private static final int BOTTOM = 1;
    private static final int TOP = 50;

    String iterate(int from, int to) {
        StringBuilder result = new StringBuilder();
        IntStream.range(from, to + 1).forEach(i -> result.append(calculateFizzBuzz(i)).append(" "));
        return result.toString();
    }

    public String process(int from, int to) {
        if (from < BOTTOM || to > TOP) {
            throw new FizzBuzzException("The range should between 1 to 50");
        }

        return iterate(from, to);
    }

    String calculateFizzBuzz(int i) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        return fizzBuzz.calculate(i);
    }
}

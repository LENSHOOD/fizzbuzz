package zxh.demo.fizzbuzz.filter;

import java.util.Objects;

/**
 * FizzFilter:
 * @author zhangxuhai
 * @date 2019-06-12
*/
public class FizzFilter extends AbstractFilter{

    private AbstractFilter next;

    public FizzFilter(AbstractFilter next) {
        this.next = next;
    }

    @Override
    public String doFilter(String input) {
        int inputInt = Integer.parseInt(input);

        if (inputInt % 3 == 0 || input.contains("3")) {
            return "Fizz";
        }

        if (Objects.isNull(next)) {
            return input;
        }

        return next.doFilter(input);
    }
}

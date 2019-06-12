package zxh.demo.fizzbuzz.filter.internal;

import zxh.demo.fizzbuzz.filter.AbstractFilter;

import java.util.Objects;

/**
 * FizzBuzzFilter:
 * @author zhangxuhai
 * @date 2019-06-12
*/
public class FizzBuzzFilter extends AbstractFilter {

    public FizzBuzzFilter(AbstractFilter next) {
        super(next);
    }

    @Override
    public String doFilter(String input) {
        int inputInt = Integer.parseInt(input);

        if (inputInt % 3 == 0 && inputInt % 5 == 0) {
            return "FizzBuzz";
        }

        if (Objects.isNull(next)) {
            return input;
        }

        return next.doFilter(input);
    }
}

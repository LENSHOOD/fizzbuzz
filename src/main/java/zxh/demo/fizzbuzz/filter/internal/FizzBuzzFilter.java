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
        if (!input.equals(new  FizzFilter(null).doFilter(input))
                && !input.equals(new BuzzFilter(null).doFilter(input))) {
            return "FizzBuzz";
        }

        if (Objects.isNull(next)) {
            return input;
        }

        return next.doFilter(input);
    }
}

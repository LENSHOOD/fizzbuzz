package zxh.demo.fizzbuzz.filter;

import java.util.Objects;

/**
 * BuzzFilter:
 * @author zhangxuhai
 * @date 2019-06-12
*/
public class BuzzFilter extends AbstractFilter{

    private AbstractFilter next;

    public BuzzFilter(AbstractFilter next) {
        this.next = next;
    }

    @Override
    public String doFilter(String input) {
        int inputInt = Integer.parseInt(input);

        if (inputInt % 5 == 0 || input.contains("5")) {
            return "Buzz";
        }

        if (Objects.isNull(next)) {
            return input;
        }

        return next.doFilter(input);
    }
}

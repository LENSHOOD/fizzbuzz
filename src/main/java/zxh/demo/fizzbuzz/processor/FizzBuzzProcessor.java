package zxh.demo.fizzbuzz.processor;

import zxh.demo.fizzbuzz.filter.AbstractFilter;
import zxh.demo.fizzbuzz.filter.internal.BuzzFilter;
import zxh.demo.fizzbuzz.filter.internal.FizzBuzzFilter;
import zxh.demo.fizzbuzz.filter.internal.FizzFilter;

/**
 * FizzBuzzProcessor:
 * @author zhangxuhai
 * @date 2019-06-12
*/
public class FizzBuzzProcessor {

    private AbstractFilter filterChain;

    public FizzBuzzProcessor() {
        filterChain = new FizzBuzzFilter(new FizzFilter(new BuzzFilter(null)));
    }

    public String doProcess(String input) {
        return filterChain.doFilter(input);
    }
}

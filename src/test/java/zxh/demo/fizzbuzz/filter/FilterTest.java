package zxh.demo.fizzbuzz.filter;

import org.junit.Test;
import zxh.demo.fizzbuzz.filter.internal.BuzzFilter;
import zxh.demo.fizzbuzz.filter.internal.FizzBuzzFilter;
import zxh.demo.fizzbuzz.filter.internal.FizzFilter;

import static org.junit.Assert.*;

/**
 * FilterTest:
 * @author zhangxuhai
 * @date 2019-06-12
*/
public class FilterTest {

    @Test
    public void should_return_fizz_if_input_is_multiple_of_3() {
        FizzFilter fizzFilter = new FizzFilter(null);

        assertEquals("Fizz", fizzFilter.doFilter("3"));
        assertEquals("Fizz", fizzFilter.doFilter("15"));
        assertEquals("Fizz", fizzFilter.doFilter("27"));
        assertEquals("1", fizzFilter.doFilter("1"));
        assertEquals("5", fizzFilter.doFilter("5"));
    }

    @Test
    public void should_return_fizz_if_input_contains_3() {
        FizzFilter fizzFilter = new FizzFilter(null);

        assertEquals("Fizz", fizzFilter.doFilter("13"));
        assertEquals("Fizz", fizzFilter.doFilter("23"));
        assertEquals("Fizz", fizzFilter.doFilter("33"));
        assertEquals("4", fizzFilter.doFilter("4"));
        assertEquals("14", fizzFilter.doFilter("14"));
    }

    @Test
    public void should_return_buzz_if_input_is_multiple_of_5() {
        BuzzFilter buzzFilter = new BuzzFilter(null);

        assertEquals("Buzz", buzzFilter.doFilter("5"));
        assertEquals("Buzz", buzzFilter.doFilter("15"));
        assertEquals("Buzz", buzzFilter.doFilter("45"));
        assertEquals("1", buzzFilter.doFilter("1"));
        assertEquals("9", buzzFilter.doFilter("9"));

    }

    @Test
    public void should_return_buzz_if_input_contains_5() {
        BuzzFilter buzzFilter = new BuzzFilter(null);

        assertEquals("Buzz", buzzFilter.doFilter("51"));
        assertEquals("Buzz", buzzFilter.doFilter("55"));
        assertEquals("43", buzzFilter.doFilter("43"));
    }

    @Test
    public void should_return_fizzbuzz_if_input_is_multiple_of_3_and_5() {
        FizzBuzzFilter fizzBuzzFilter = new FizzBuzzFilter(null);

        assertEquals("FizzBuzz", fizzBuzzFilter.doFilter("15"));
        assertEquals("FizzBuzz", fizzBuzzFilter.doFilter("30"));
        assertEquals("FizzBuzz", fizzBuzzFilter.doFilter("45"));
        assertEquals("1", fizzBuzzFilter.doFilter("1"));
        assertEquals("18", fizzBuzzFilter.doFilter("18"));
    }
}

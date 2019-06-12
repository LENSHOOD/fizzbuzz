package zxh.demo.fizzbuzz;

import org.junit.Assert;
import org.junit.Test;
import zxh.demo.fizzbuzz.filter.BuzzFilter;
import zxh.demo.fizzbuzz.filter.FizzBuzzFilter;
import zxh.demo.fizzbuzz.filter.FizzFilter;
import zxh.demo.fizzbuzz.processor.FizzBuzzProcessor;

/**
 * FizzBuzzProcessorTest:
 * @author zhangxuhai
 * @date 2019-06-12
*/
public class FizzBuzzProcessorTest {

    @Test
    public void should_return_fizz_if_input_is_multiple_of_3() {
        FizzFilter fizzFilter = new FizzFilter(null);

        Assert.assertEquals("Fizz", fizzFilter.doFilter("3"));
        Assert.assertEquals("Fizz", fizzFilter.doFilter("15"));
        Assert.assertEquals("Fizz", fizzFilter.doFilter("27"));
        Assert.assertEquals("1", fizzFilter.doFilter("1"));
        Assert.assertEquals("5", fizzFilter.doFilter("5"));
    }

    @Test
    public void should_return_fizz_if_input_contains_3() {
        FizzFilter fizzFilter = new FizzFilter(null);

        Assert.assertEquals("Fizz", fizzFilter.doFilter("13"));
        Assert.assertEquals("Fizz", fizzFilter.doFilter("23"));
        Assert.assertEquals("Fizz", fizzFilter.doFilter("33"));
        Assert.assertEquals("4", fizzFilter.doFilter("4"));
        Assert.assertEquals("14", fizzFilter.doFilter("14"));
    }

    @Test
    public void should_return_buzz_if_input_is_multiple_of_5() {
        BuzzFilter buzzFilter = new BuzzFilter(null);

        Assert.assertEquals("Buzz", buzzFilter.doFilter("5"));
        Assert.assertEquals("Buzz", buzzFilter.doFilter("15"));
        Assert.assertEquals("Buzz", buzzFilter.doFilter("45"));
        Assert.assertEquals("1", buzzFilter.doFilter("1"));
        Assert.assertEquals("9", buzzFilter.doFilter("9"));

    }

    @Test
    public void should_return_buzz_if_input_contains_5() {
        BuzzFilter buzzFilter = new BuzzFilter(null);

        Assert.assertEquals("Buzz", buzzFilter.doFilter("51"));
        Assert.assertEquals("Buzz", buzzFilter.doFilter("55"));
        Assert.assertEquals("43", buzzFilter.doFilter("43"));
    }

    @Test
    public void should_return_fizzbuzz_if_input_is_multiple_of_3_and_5() {
        FizzBuzzFilter fizzBuzzFilter = new FizzBuzzFilter(null);

        Assert.assertEquals("FizzBuzz", fizzBuzzFilter.doFilter("15"));
        Assert.assertEquals("FizzBuzz", fizzBuzzFilter.doFilter("30"));
        Assert.assertEquals("FizzBuzz", fizzBuzzFilter.doFilter("45"));
        Assert.assertEquals("1", fizzBuzzFilter.doFilter("1"));
        Assert.assertEquals("18", fizzBuzzFilter.doFilter("18"));
    }

    @Test
    public void should_return_1_fizz_buzz_11_fizz_13_14_fizzbuzz() {
        FizzBuzzProcessor fizzBuzzProcessor = new FizzBuzzProcessor();

        Assert.assertEquals("1", fizzBuzzProcessor.doProcess("1"));
        Assert.assertEquals("Fizz", fizzBuzzProcessor.doProcess("9"));
        Assert.assertEquals("Buzz", fizzBuzzProcessor.doProcess("10"));
        Assert.assertEquals("11", fizzBuzzProcessor.doProcess("11"));
        Assert.assertEquals("Fizz", fizzBuzzProcessor.doProcess("12"));
        Assert.assertEquals("Fizz", fizzBuzzProcessor.doProcess("13"));
        Assert.assertEquals("14", fizzBuzzProcessor.doProcess("14"));
        Assert.assertEquals("FizzBuzz", fizzBuzzProcessor.doProcess("15"));
        Assert.assertEquals("Fizz", fizzBuzzProcessor.doProcess("35"));
        Assert.assertEquals("Fizz", fizzBuzzProcessor.doProcess("53"));

    }
}

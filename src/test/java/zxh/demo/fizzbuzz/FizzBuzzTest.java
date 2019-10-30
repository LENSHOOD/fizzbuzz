package zxh.demo.fizzbuzz;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * FizzBuzzTest:
 * @author zhangxuhai
 * @date 2019/10/30
*/
public class FizzBuzzTest {
    @Test
    public void should_input_3_get_fizz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("Fizz", fizzBuzz.calculate(3));
    }

    @Test
    public void should_input_5_get_Buzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("Buzz", fizzBuzz.calculate(5));
    }

    @Test
    public void should_input_15_get_fizzbuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("FizzBuzz", fizzBuzz.calculate(15));
    }
}

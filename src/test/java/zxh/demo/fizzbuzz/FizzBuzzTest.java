package zxh.demo.fizzbuzz;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * FizzBuzzTest:
 * @author zhangxuhai
 * @date 2019/11/4
*/
public class FizzBuzzTest {

    @Test
    public void should_return_fizz_when_input_3() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("Fizz", fizzBuzz.calculate(3));
    }

    @Test
    public void should_return_fizz_when_input_27() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("Fizz", fizzBuzz.calculate(27));
    }

    @Test
    public void should_return_buzz_when_input_5() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("Buzz", fizzBuzz.calculate(5));
    }

    @Test
    public void should_return_buzz_when_input_70() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("Buzz", fizzBuzz.calculate(70));
    }

    @Test
    public void should_return_fizzbuzz_when_input_15() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("FizzBuzz", fizzBuzz.calculate(15));
    }

    @Test
    public void should_return_fizz_when_input_90() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("FizzBuzz", fizzBuzz.calculate(90));
    }

    @Test
    public void should_return_4_when_input_4() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("4", fizzBuzz.calculate(4));
    }

    @Test
    public void should_return_17_when_input_17() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("17", fizzBuzz.calculate(17));
    }
}

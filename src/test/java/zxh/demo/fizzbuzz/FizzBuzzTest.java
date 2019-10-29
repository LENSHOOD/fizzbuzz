package zxh.demo.fizzbuzz;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * FizzBuzzTest:
 * @author zhangxuhai
 * @date 2019/10/29
*/
public class FizzBuzzTest {
    
    @Test
    public void should_return_fizz_when_input_3() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("Fizz", fizzBuzz.calculate(3));
    }

    @Test
    public void should_return_fizz_when_input_48() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("Fizz", fizzBuzz.calculate(48));
    }
    
    @Test
    public void should_return_buzz_when_input_5() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("Buzz", fizzBuzz.calculate(5));
    }

    @Test
    public void should_return_buzz_when_input_55() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("Buzz", fizzBuzz.calculate(55));
    }

    @Test
    public void should_return_fizzbuzz_when_input_15() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("FizzBuzz", fizzBuzz.calculate(15));
    }

    @Test
    public void should_return_fizzbuzz_when_input_60() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("FizzBuzz", fizzBuzz.calculate(60));
    }

    @Test
    public void should_return_1_when_input_1() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("1", fizzBuzz.calculate(1));
    }

    @Test
    public void should_return_88_when_input_88() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("88", fizzBuzz.calculate(88));
    }
}

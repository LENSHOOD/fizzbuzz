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
        assertEquals("Fizz", FizzBuzz.calculate(3));
    }

    @Test
    public void should_return_fizz_when_input_48() {
        assertEquals("Fizz", FizzBuzz.calculate(48));
    }
    
    @Test
    public void should_return_buzz_when_input_5() {
        assertEquals("Buzz", FizzBuzz.calculate(5));
    }

    @Test
    public void should_return_buzz_when_input_55() {
        assertEquals("Buzz", FizzBuzz.calculate(55));
    }

    @Test
    public void should_return_fizzbuzz_when_input_15() {
        assertEquals("FizzBuzz", FizzBuzz.calculate(15));
    }

    @Test
    public void should_return_fizzbuzz_when_input_60() {
        assertEquals("FizzBuzz", FizzBuzz.calculate(60));
    }

    @Test
    public void should_return_1_when_input_1() {
        assertEquals("1", FizzBuzz.calculate(1));
    }

    @Test
    public void should_return_88_when_input_88() {
        assertEquals("88", FizzBuzz.calculate(88));
    }
}

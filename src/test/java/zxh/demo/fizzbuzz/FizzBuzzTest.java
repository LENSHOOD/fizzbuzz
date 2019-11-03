package zxh.demo.fizzbuzz;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import zxh.demo.fizzbuzz.exception.FizzBuzzException;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

/**
 * FizzBuzzTest:
 * @author zhangxuhai
 * @date 2019/11/3
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
    public void should_return_fizzbuzz_when_input_is_60() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("FizzBuzz", fizzBuzz.calculate(60));
    }

    @Test
    public void should_return_4_when_input_4() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("4", fizzBuzz.calculate(4));
    }

    @Test
    public void should_return_47_when_input47() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("47", fizzBuzz.calculate(47));
    }

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void should_error_if_input_less_than_1() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        expectedException.expect(FizzBuzzException.class);
        fizzBuzz.process(0, 100);
    }

    @Test
    public void should_error_if_input_greater_than_100() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        expectedException.expect(FizzBuzzException.class);
        fizzBuzz.process(1, 101);
    }

    @Test
    public void should_return_given_string_when_range_1_to_10() {
        String given = "1 2 3 4 5 6 7 8 9 10 ";
        FizzBuzz fizzBuzz = spy(new FizzBuzz());
        when(fizzBuzz.calculate(anyInt())).thenAnswer(answer -> String.valueOf(answer.getArgument(0, Integer.class)));
        assertEquals(given, fizzBuzz.process(1, 10));
    }

    @Test
    public void should_return_given_fizzbuzz_when_range_1_to_20() {
        String givenFizzBuzz = "1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 FizzBuzz 16 17 Fizz 19 Buzz ";
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals(givenFizzBuzz, fizzBuzz.process(1, 20));
    }
}

package zxh.demo.fizzbuzz;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import zxh.demo.fizzbuzz.exception.FizzBuzzException;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;

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

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void should_return_error_if_input_less_than_1() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        expectedException.expect(FizzBuzzException.class);
        fizzBuzz.process(0, 100);
    }

    @Test
    public void should_return_error_if_input_greater_than_100() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        expectedException.expect(FizzBuzzException.class);
        fizzBuzz.process(1, 101);
    }

    @Test
    public void should_return_given_string_when_input_1_10() {
        String given = "1 2 3 4 5 6 7 8 9 10 ";
        FizzBuzz fizzBuzz = spy(new FizzBuzz());
        when(fizzBuzz.calculate(anyInt())).thenAnswer(answer -> String.valueOf(answer.getArgument(0, Integer.class)));

        assertEquals(given, fizzBuzz.process(1, 10));
    }

    @Test
    public void should_return_fizzbuzz_string_when_input_1_20() {
        String expect = "1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 FizzBuzz 16 17 Fizz 19 Buzz ";

        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals(expect, fizzBuzz.process(1, 20));
    }
}

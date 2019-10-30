package zxh.demo.fizzbuzz;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;

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
    public void should_input_27_get_fizz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("Fizz", fizzBuzz.calculate(27));
    }

    @Test
    public void should_input_5_get_Buzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("Buzz", fizzBuzz.calculate(5));
    }

    @Test
    public void should_input_65_get_Buzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("Buzz", fizzBuzz.calculate(65));
    }

    @Test
    public void should_input_15_get_fizzbuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("FizzBuzz", fizzBuzz.calculate(15));
    }

    @Test
    public void should_input_90_get_fizzbuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("FizzBuzz", fizzBuzz.calculate(90));
    }

    @Test
    public void should_input_7_get_7() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("7", fizzBuzz.calculate(7));
    }

    @Test
    public void should_input_134_get_134() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("134", fizzBuzz.calculate(134));
    }

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void should_user_input_greater_than_0() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        expectedException.expect(FizzBuzzException.class);
        fizzBuzz.process(0, 50);
    }

    @Test
    public void should_user_input_less_than_51() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        expectedException.expect(FizzBuzzException.class);
        fizzBuzz.process(1, 51);
    }

    @Test
    public void should_return_1_to_10_when_input_1_to_10() {
        String given = "1 2 3 4 5 6 7 8 9 10 ";
        FizzBuzz fizzBuzz = spy(new FizzBuzz());
        when(fizzBuzz.calculate(anyInt()))
                .thenAnswer(answer -> String.valueOf(answer.getArgument(0, Integer.class)));
        assertEquals(given, fizzBuzz.process(1, 10));
    }

    @Test
    public void should_return_given_fizz_buzz_when_input_1_20() {
        String given = "1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 FizzBuzz 16 17 Fizz 19 Buzz ";
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals(given, fizzBuzz.process(1, 20));
    }
}

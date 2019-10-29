package zxh.demo.fizzbuzz;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

/**
 * IterationNumber:
 * @author zhangxuhai
 * @date 2019/10/29
*/
public class ProcessFizzBuzzTest {

    @Test
    public void should_return_given_string_when_input_1_to_10() {
        String given = "1 2 3 4 5 6 7 8 9 10 ";

        ProcessFizzBuzz processFizzBuzz = spy(new ProcessFizzBuzz());
        when(processFizzBuzz.calculateFizzBuzz(anyInt()))
                .thenAnswer(i -> String.valueOf(i.getArgument(0, Integer.class)));
        assertEquals(given, processFizzBuzz.iterate(1, 10));
    }

    @Test
    public void should_return_fizzbuzz_result_when_input_1_to_20() {
        String given = "1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 FizzBuzz 16 17 Fizz 19 Buzz ";

        ProcessFizzBuzz processFizzBuzz = new ProcessFizzBuzz();
        assertEquals(given, processFizzBuzz.process(1, 20));
    }

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void should_error_when_input_from_0() {
        ProcessFizzBuzz processFizzBuzz = new ProcessFizzBuzz();

        expectedException.expect(FizzBuzzException.class);
        processFizzBuzz.process(0, 50);
    }

    @Test
    public void should_error_when_input_to_51() {
        ProcessFizzBuzz processFizzBuzz = new ProcessFizzBuzz();

        expectedException.expect(FizzBuzzException.class);
        processFizzBuzz.process(2, 51);
    }
}

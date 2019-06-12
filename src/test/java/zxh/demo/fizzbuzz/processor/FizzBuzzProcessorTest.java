package zxh.demo.fizzbuzz.processor;

import static org.junit.Assert.*;
import org.junit.Test;

public class FizzBuzzProcessorTest {

    @Test
    public void should_return_1_fizz_buzz_11_fizz_13_14_fizzbuzz() {
        FizzBuzzProcessor fizzBuzzProcessor = new FizzBuzzProcessor();

        assertEquals("1", fizzBuzzProcessor.doProcess("1"));
        assertEquals("Fizz", fizzBuzzProcessor.doProcess("9"));
        assertEquals("Buzz", fizzBuzzProcessor.doProcess("10"));
        assertEquals("11", fizzBuzzProcessor.doProcess("11"));
        assertEquals("Fizz", fizzBuzzProcessor.doProcess("12"));
        assertEquals("Fizz", fizzBuzzProcessor.doProcess("13"));
        assertEquals("14", fizzBuzzProcessor.doProcess("14"));
        assertEquals("FizzBuzz", fizzBuzzProcessor.doProcess("15"));
        assertEquals("Fizz", fizzBuzzProcessor.doProcess("35"));
        assertEquals("Fizz", fizzBuzzProcessor.doProcess("53"));

    }


}
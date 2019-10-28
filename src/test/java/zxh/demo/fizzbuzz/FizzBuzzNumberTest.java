package zxh.demo.fizzbuzz;

import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzNumberTest {
    @Test
    public void validate_get_fizz_if_3() {
        assertEquals("Fizz", FizzBuzzNumber.create(3).say());
    }

    @Test
    public void validate_get_fizz_if_27() {
        assertEquals("Fizz", FizzBuzzNumber.create(27).say());
    }

    @Test
    public void validate_get_buzz_if_5() {
        assertEquals("Buzz", FizzBuzzNumber.create(5).say());
    }

    @Test
    public void validate_get_buzz_if_500() {
        assertEquals("Buzz", FizzBuzzNumber.create(500).say());
    }

    @Test
    public void validate_get_number_if_1() {
        assertEquals("1", FizzBuzzNumber.create(1).say());
    }

    @Test
    public void validate_get_number_if_7() {
        assertEquals("7", FizzBuzzNumber.create(7).say());
    }

    @Test
    public void validate_get_fizzbuzz_if_15() {
        assertEquals("FizzBuzz", FizzBuzzNumber.create(15).say());
    }

    @Test
    public void validate_get_fizzbuzz_if_60() {
        assertEquals("FizzBuzz", FizzBuzzNumber.create(60).say());
    }
}
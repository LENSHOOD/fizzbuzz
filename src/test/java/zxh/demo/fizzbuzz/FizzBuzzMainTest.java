package zxh.demo.fizzbuzz;

import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzMainTest {

    @Test
    public void validate_get_fizz_if_3() {
        FizzBuzzMain fizzBuzzMain = new FizzBuzzMain();

        assertEquals("Fizz", fizzBuzzMain.calculate(3));
    }

    @Test
    public void validate_get_fizz_if_27() {
        FizzBuzzMain fizzBuzzMain = new FizzBuzzMain();

        assertEquals("Fizz", fizzBuzzMain.calculate(27));
    }

    @Test
    public void validate_get_buzz_if_5() {
        FizzBuzzMain fizzBuzzMain = new FizzBuzzMain();

        assertEquals("Buzz", fizzBuzzMain.calculate(5));
    }

    @Test
    public void validate_get_buzz_if_500() {
        FizzBuzzMain fizzBuzzMain = new FizzBuzzMain();

        assertEquals("Buzz", fizzBuzzMain.calculate(500));
    }

    @Test
    public void validate_get_number_if_1() {
        FizzBuzzMain fizzBuzzMain = new FizzBuzzMain();

        assertEquals("1", fizzBuzzMain.calculate(1));
    }

    @Test
    public void validate_get_number_if_7() {
        FizzBuzzMain fizzBuzzMain = new FizzBuzzMain();

        assertEquals("7", fizzBuzzMain.calculate(7));
    }

    @Test
    public void validate_get_fizzbuzz_if_15() {
        FizzBuzzMain fizzBuzzMain = new FizzBuzzMain();

        assertEquals("FizzBuzz", fizzBuzzMain.calculate(15));
    }

    @Test
    public void validate_get_fizzbuzz_if_60() {
        FizzBuzzMain fizzBuzzMain = new FizzBuzzMain();

        assertEquals("FizzBuzz", fizzBuzzMain.calculate(60));
    }
}
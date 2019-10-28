package zxh.demo.fizzbuzz;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class FizzBuzzMainTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void validate_user_input_minus_1_to_100() {
        FizzBuzzMain fizzBuzzMain = new FizzBuzzMain();

        expectedException.expect(IllegalArgumentException.class);
        fizzBuzzMain.input(-1, 100);
    }

    @Test
    public void validate_user_input_to_less_than_from() {
        FizzBuzzMain fizzBuzzMain = new FizzBuzzMain();

        expectedException.expect(IllegalArgumentException.class);
        fizzBuzzMain.input(100, 1);
    }

    @Test
    public void validate_user_input_1_to_1000() {
        FizzBuzzMain fizzBuzzMain = new FizzBuzzMain();

        expectedException.expect(IllegalArgumentException.class);
        fizzBuzzMain.input(1, 1000);
    }

    @Test
    public void validate_user_input_1_to_20() {
        String expectReturn = "1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 FizzBuzz 16 17 Fizz 19 Buzz ";

        FizzBuzzMain fizzBuzzMain = new FizzBuzzMain();
        assertEquals(expectReturn, fizzBuzzMain.input(1, 20));
    }
}
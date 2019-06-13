package zxh.demo.fizzbuzz;

import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzMainTest {

    @Test
    public void should_isFizz_return_true() {
        assertTrue(FizzBuzzMain.Filter.isFizz(3));
        assertTrue(FizzBuzzMain.Filter.isFizz(9));
        assertTrue(FizzBuzzMain.Filter.isFizz(27));
        assertTrue(FizzBuzzMain.Filter.isFizz(13));
        assertTrue(FizzBuzzMain.Filter.isFizz(23));
        assertFalse(FizzBuzzMain.Filter.isFizz(4));
        assertFalse(FizzBuzzMain.Filter.isFizz(79));
    }

    @Test
    public void should_isBuzz_return_true() {
        assertTrue(FizzBuzzMain.Filter.isBuzz(5));
        assertTrue(FizzBuzzMain.Filter.isBuzz(25));
        assertTrue(FizzBuzzMain.Filter.isBuzz(55));
        assertTrue(FizzBuzzMain.Filter.isBuzz(51));
        assertTrue(FizzBuzzMain.Filter.isBuzz(58));
        assertFalse(FizzBuzzMain.Filter.isBuzz(4));
        assertFalse(FizzBuzzMain.Filter.isBuzz(79));
    }

    @Test
    public void should_isFizzBuzz_return_true() {
        assertTrue(FizzBuzzMain.Filter.isFizzBuzz(15));
        assertTrue(FizzBuzzMain.Filter.isFizzBuzz(30));
        assertTrue(FizzBuzzMain.Filter.isFizzBuzz(45));
        assertTrue(FizzBuzzMain.Filter.isFizzBuzz(35));
        assertTrue(FizzBuzzMain.Filter.isFizzBuzz(53));
        assertFalse(FizzBuzzMain.Filter.isFizzBuzz(17));
        assertFalse(FizzBuzzMain.Filter.isFizzBuzz(88));
    }

    @Test
    public void should_process_1_to_20() {
        String expectOneTwenty = "1\n" +
                "2\n" +
                "Fizz\n" +
                "4\n" +
                "Buzz\n" +
                "Fizz\n" +
                "7\n" +
                "8\n" +
                "Fizz\n" +
                "Buzz\n" +
                "11\n" +
                "Fizz\n" +
                "Fizz\n" +
                "14\n" +
                "FizzBuzz\n" +
                "16\n" +
                "17\n" +
                "Fizz\n" +
                "19\n" +
                "Buzz\n";

        assertEquals(expectOneTwenty, new FizzBuzzMain().processor(1, 20, 1));

    }
}
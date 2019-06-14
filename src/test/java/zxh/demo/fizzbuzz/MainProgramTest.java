package zxh.demo.fizzbuzz;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainProgramTest {

    @Test
    public void should_isFizz_return_true() {

        assertTrue(MainProgram.FizzBuzzFilter.isFizz(3));
        assertTrue(MainProgram.FizzBuzzFilter.isFizz(27));
        assertTrue(MainProgram.FizzBuzzFilter.isFizz(13));
        assertTrue(MainProgram.FizzBuzzFilter.isFizz(31));
        assertFalse(MainProgram.FizzBuzzFilter.isFizz(4));
        assertFalse(MainProgram.FizzBuzzFilter.isFizz(19));
    }

    @Test
    public void should_isBuzz_return_true() {

        assertTrue(MainProgram.FizzBuzzFilter.isBuzz(5));
        assertTrue(MainProgram.FizzBuzzFilter.isBuzz(10));
        assertTrue(MainProgram.FizzBuzzFilter.isBuzz(51));
        assertTrue(MainProgram.FizzBuzzFilter.isBuzz(59));
        assertFalse(MainProgram.FizzBuzzFilter.isBuzz(4));
        assertFalse(MainProgram.FizzBuzzFilter.isBuzz(19));
    }

    @Test
    public void should_isFizzBuzz_return_true() {

        assertTrue(MainProgram.FizzBuzzFilter.isFizzBuzz(15));
        assertTrue(MainProgram.FizzBuzzFilter.isFizzBuzz(30));
        assertTrue(MainProgram.FizzBuzzFilter.isFizzBuzz(35));
        assertTrue(MainProgram.FizzBuzzFilter.isFizzBuzz(53));
        assertFalse(MainProgram.FizzBuzzFilter.isFizzBuzz(4));
        assertFalse(MainProgram.FizzBuzzFilter.isFizzBuzz(19));
    }

    @Test
    public void process() {

        String expectedOneTwenty = "1\n" +
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

        assertEquals(expectedOneTwenty, new MainProgram().process(1, 20 ,1));

    }
}
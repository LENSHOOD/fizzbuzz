package zxh.demo.fizzbuzz;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainProgramTest {

    @Test
    public void should_isFizz_return_true_when_get_num_can_be_divided_by_3() {
        assertTrue(MainProgram.isFizz(3));
        assertTrue(MainProgram.isFizz(9));
        assertTrue(MainProgram.isFizz(27));
        assertFalse(MainProgram.isFizz(4));
        assertFalse(MainProgram.isFizz(19));
    }

    @Test
    public void should_isFizz_return_true_when_num_has_3() {
        assertTrue(MainProgram.isFizz(3));
        assertTrue(MainProgram.isFizz(13));
        assertTrue(MainProgram.isFizz(31));
        assertFalse(MainProgram.isFizz(4));
        assertFalse(MainProgram.isFizz(19));
    }

    @Test
    public void should_isBuzz_return_true_when_get_num_can_be_divided_by_5() {
        assertTrue(MainProgram.isBuzz(5));
        assertTrue(MainProgram.isBuzz(10));
        assertTrue(MainProgram.isBuzz(15));
        assertFalse(MainProgram.isBuzz(4));
        assertFalse(MainProgram.isBuzz(19));
    }

    @Test
    public void should_isBuzz_return_true_when_num_has_5() {
        assertTrue(MainProgram.isBuzz(5));
        assertTrue(MainProgram.isBuzz(51));
        assertTrue(MainProgram.isBuzz(54));
        assertFalse(MainProgram.isBuzz(4));
        assertFalse(MainProgram.isBuzz(19));
    }

    @Test
    public void should_isFizzBuzz_return_true_when_get_num_can_be_divided_by_3_and_5() {
        assertTrue(MainProgram.isFizzBuzz(15));
        assertTrue(MainProgram.isFizzBuzz(30));
        assertTrue(MainProgram.isFizzBuzz(45));
        assertFalse(MainProgram.isFizzBuzz(4));
        assertFalse(MainProgram.isFizzBuzz(19));
    }

    @Test
    public void should_isFizzBuzz_return_true_when_num_has_3_and_5() {
        assertTrue(MainProgram.isFizzBuzz(35));
        assertTrue(MainProgram.isFizzBuzz(53));
        assertFalse(MainProgram.isFizzBuzz(4));
        assertFalse(MainProgram.isFizzBuzz(19));
    }

    @Test
    public void doProcessTest() {
        String expectedString = "1\n" +
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

        assertEquals(expectedString, new MainProgram().doProcess(1, 20, 1));
    }

}
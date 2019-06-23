package zxh.demo.fizzbuzz;

import org.junit.Test;

import static org.junit.Assert.*;

public class ProcessorTest {

    @Test
    public void validate_process() {
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

        assertEquals(expectedString, new Processor().process(1, 20));
    }

}
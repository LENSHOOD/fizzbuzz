package zxh.demo.fizzbuzz;

import org.junit.Assert;
import org.junit.Test;

/**
 * MainProgramTest:
 * @author zhangxuhai
 * @date 2019-06-12
*/
public class MainProgramTest {

    private String toTheAHundred = "1\n" +
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
            "Buzz\n" +
            "Fizz\n" +
            "22\n" +
            "Fizz\n" +
            "Fizz\n" +
            "Buzz\n" +
            "26\n" +
            "Fizz\n" +
            "28\n" +
            "29\n" +
            "FizzBuzz\n" +
            "Fizz\n" +
            "Fizz\n" +
            "Fizz\n" +
            "Fizz\n" +
            "Fizz\n" +
            "Fizz\n" +
            "Fizz\n" +
            "Fizz\n" +
            "Fizz\n" +
            "Buzz\n" +
            "41\n" +
            "Fizz\n" +
            "Fizz\n" +
            "44\n" +
            "FizzBuzz\n" +
            "46\n" +
            "47\n" +
            "Fizz\n" +
            "49\n" +
            "Buzz\n" +
            "Fizz\n" +
            "Buzz\n" +
            "Fizz\n" +
            "Fizz\n" +
            "Buzz\n" +
            "Buzz\n" +
            "Fizz\n" +
            "Buzz\n" +
            "Buzz\n" +
            "FizzBuzz\n" +
            "61\n" +
            "62\n" +
            "Fizz\n" +
            "64\n" +
            "Buzz\n" +
            "Fizz\n" +
            "67\n" +
            "68\n" +
            "Fizz\n" +
            "Buzz\n" +
            "71\n" +
            "Fizz\n" +
            "Fizz\n" +
            "74\n" +
            "FizzBuzz\n" +
            "76\n" +
            "77\n" +
            "Fizz\n" +
            "79\n" +
            "Buzz\n" +
            "Fizz\n" +
            "82\n" +
            "Fizz\n" +
            "Fizz\n" +
            "Buzz\n" +
            "86\n" +
            "Fizz\n" +
            "88\n" +
            "89\n" +
            "FizzBuzz\n" +
            "91\n" +
            "92\n" +
            "Fizz\n" +
            "94\n" +
            "Buzz\n" +
            "Fizz\n" +
            "97\n" +
            "98\n" +
            "Fizz\n" +
            "Buzz";

    @Test
    public void should_match_toTheTwenty_with_input_range_1_20() {
        MainProgram mainProgram = new MainProgram();
        Assert.assertEquals(toTheAHundred, mainProgram.run(1, 100, 1));
    }
}

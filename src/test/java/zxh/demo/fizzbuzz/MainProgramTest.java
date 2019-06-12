package zxh.demo.fizzbuzz;

import org.junit.Assert;
import org.junit.Test;

/**
 * MainProgramTest:
 * @author zhangxuhai
 * @date 2019-06-12
*/
public class MainProgramTest {

    private String toTheTwenty = "1\n" +
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

    @Test
    public void should_match_toTheTwenty_with_input_range_1_20() {
        MainProgram mainProgram = new MainProgram();

        Assert.assertEquals(toTheTwenty, mainProgram.run(1, 20, 1));
    }
}

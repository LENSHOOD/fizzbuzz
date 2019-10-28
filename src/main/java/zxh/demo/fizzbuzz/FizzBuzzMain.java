package zxh.demo.fizzbuzz;

/**
 * FizzBuzzMain:
 * @author zhangxuhai
 * @date 2019/10/28
*/
public class FizzBuzzMain {

    public String calculate(int i) {
        if (i % 3 == 0 && i % 5 == 0) {
            return "FizzBuzz";
        }

        if (i % 3 == 0) {
            return "Fizz";
        }

        if (i % 5 == 0) {
            return "Buzz";
        }

        return String.valueOf(i);
    }
}

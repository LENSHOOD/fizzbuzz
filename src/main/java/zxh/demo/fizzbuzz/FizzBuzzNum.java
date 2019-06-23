package zxh.demo.fizzbuzz;

/**
 * FizzBuzzNum:
 * @author zhangxuhai
 * @date 2019-06-23
*/
public class FizzBuzzNum {
    private int num;

    public FizzBuzzNum(int num) {
        this.num = num;
    }

    public String say() {
        String result = String.valueOf(num);

        if (isFizz()) {
            result = "Fizz";
        }

        if (isBuzz()) {
            result = "Buzz";
        }

        if (isFizzBuzz()) {
            result = "FizzBuzz";
        }

        return result;
    }

    boolean isFizz() {
        return isDivisibleWith(3) || isContains(3);
    }

    boolean isBuzz() {
        return isDivisibleWith(5) || isContains(5);
    }

    boolean isFizzBuzz() {
        return isFizz() && isBuzz();
    }

    private boolean isDivisibleWith(int inputNum) {
        return num % inputNum == 0;
    }

    private boolean isContains(int inputNum) {
        return String.valueOf(num).contains(String.valueOf(inputNum));
    }
}

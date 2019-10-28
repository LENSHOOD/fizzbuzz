package zxh.demo.fizzbuzz;

/**
 * FizzBuzzNumber:
 * @author zhangxuhai
 * @date 2019/10/28
*/
class FizzBuzzNumber {

    private int value;

    static FizzBuzzNumber create(int value) {
        return new FizzBuzzNumber(value);
    }

    private FizzBuzzNumber(int value) {
        this.value = value;
    }

    String say() {
        if (isFizzBuzz(value)) {
            return "FizzBuzz";
        }

        if (isFizz(value)) {
            return "Fizz";
        }

        if (isBuzz(value)) {
            return "Buzz";
        }

        return String.valueOf(value);
    }

    private boolean isFizzBuzz(int i) {
        return isFizz(i) && isBuzz(i);
    }

    private boolean isBuzz(int i) {
        return i % 5 == 0;
    }

    private boolean isFizz(int i) {
        return i % 3 == 0;
    }
}

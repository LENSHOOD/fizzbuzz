package zxh.demo.fizzbuzz;

/**
 * MainProgram:
 * @author zhangxuhai
 * @date 2019-06-16
*/
public class MainProgram {

    static boolean isFizz(int num) {
        return isModuleToZero(num, 3) || isNumberContains(num, 3);
    }

    static boolean isBuzz(int num) {
        return isModuleToZero(num, 5) || isNumberContains(num, 5);
    }

    static boolean isFizzBuzz(int num) {
        return isFizz(num) && isBuzz(num);
    }

    private static boolean isModuleToZero(int num, int module) {
        return num % module == 0;
    }

    private static boolean isNumberContains(int num, int containsNum) {
        return String.valueOf(num).contains(String.valueOf(containsNum));
    }

    public String doProcess(int start, int end, int step) {
        StringBuilder builder = new StringBuilder();
        for (int i = start; i <= end; i += step) {
            String result = String.valueOf(i);

            if (isFizz(i)) {
                result = "Fizz";
            }

            if (isBuzz(i)) {
                result = "Buzz";
            }

            if (isFizzBuzz(i)) {
                result = "FizzBuzz";
            }

            builder.append(result).append("\n");
        }

        return builder.toString();
    }

}

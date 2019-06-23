package zxh.demo.fizzbuzz;

/**
 * Processor:
 * @author zhangxuhai
 * @date 2019-06-23
*/
public class Processor {

    public String process(int start, int end) {
        StringBuilder builder = new StringBuilder();
        for (int i = start; i <= end; i++) {
            builder.append(new FizzBuzzNum(i).say()).append("\n");
        }

        return builder.toString();
    }

}

package zxh.demo.fizzbuzz;

import zxh.demo.fizzbuzz.processor.FizzBuzzProcessor;

/**
 * MainProgram:
 * @author zhangxuhai
 * @date 2019-06-12
*/
public class MainProgram {

    private FizzBuzzProcessor processor;

    public MainProgram() {
        processor = new FizzBuzzProcessor();
    }

    public String run(int start, int end, int step) {
        StringBuilder builder = new StringBuilder();

        for (int i = start; i <= end; i += step) {
            String tmpResult = processor.doProcess(String.valueOf(i));
            System.out.println(tmpResult);
            builder.append(tmpResult).append("\n");
        }

        return builder.toString();
    }
}

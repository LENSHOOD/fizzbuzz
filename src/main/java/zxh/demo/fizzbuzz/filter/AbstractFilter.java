package zxh.demo.fizzbuzz.filter;

/**
 * AbstractFilter:
 * @author zhangxuhai
 * @date 2019-06-12
*/
public abstract class AbstractFilter {

    protected AbstractFilter next;

    public AbstractFilter(AbstractFilter next) {
        this.next = next;
    }

    public abstract String doFilter(String input);
}

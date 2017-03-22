import jdk.nashorn.internal.runtime.regexp.JoniRegExp;

import java.math.BigDecimal;

/**
 * Created by king on 17-3-20.
 */
public class Example {
    public static void main(String[] args) {
        BigDecimal sum = new BigDecimal("0.0");
        BigDecimal factorial = new BigDecimal("1.0");

        int i=1;
        while (i <= 20) {
            sum = sum.add(factorial);
            ++i;
            factorial = factorial.multiply(new BigDecimal(1.0 / i));
        }
        System.out.println("1+1/2!+1/3...1/20!等于：" + sum);
    }
}

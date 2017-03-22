import sun.reflect.generics.reflectiveObjects.LazyReflectiveObjectGenerator;

import java.util.Scanner;

/**
 * Created by king on 17-3-19.
 */
public class PrityCheck {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        long number = scan.nextLong();
        String check=(number%2==0)?"这个数是：偶数":"这个数字是：奇数";
        System.out.println(check);
    }
}

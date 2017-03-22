import com.sun.org.apache.xpath.internal.operations.Mult;

import java.util.jar.JarEntry;

/**
 * Created by king on 17-3-20.
 */
public class MultiTable {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + "*" + j + "=" + (i * j)+"\t");
            }
            System.out.println();//换行
        }
    }
}

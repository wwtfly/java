/**
 * Created by king on 17-3-19.
 */
import sun.misc.Cache;

import java.io.FileNotFoundException;
import java.io.PrintStream;

import static com.sun.deploy.model.LocalApplicationProperties.Kind.SYSTEM;

public class RedirectOutputStream {
    public static void main(String[] args) {
        try {
            PrintStream out = System.out;
            PrintStream ps = new PrintStream("/home/king/ebook/log.txt");
            System.setOut(ps);
            int age = 18;
            System.out.println("年龄变量成功定义，初始化为18");
            String sex = "女";
            System.out.println("性别变量成功定义，初始值为女");
            String info = "这是个" + sex + "孩子，应该有+" + age + "岁了。";
            System.out.println("整合两个变量为info字符串变量，其结果是：" + info);
            System.setOut(out);
            System.out.println("程序运行完毕，请查看日志文件");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
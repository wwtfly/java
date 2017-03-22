import java.net.SocketTimeoutException;
import java.util.Scanner;

/**
 * Created by king on 17-3-19.
 */
public class CheckLogin {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("输入用户登录名：");
        String username=scan.nextLine();
        System.out.println("输入用户登录密码：");
        String password = scan.nextLine();
        if (!username.equals("mr")) {
            System.out.println("登录密码错误。");
        } else if (!password.equals("mrsoft")) {
            System.out.println("用户名非法");
        } else {
            System.out.println("恭喜你登录成功");
        }
    }
}

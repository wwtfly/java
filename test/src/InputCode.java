import java.util.Scanner;

/**
 * Created by king on 17-3-18.
 */
public class InputCode {
    public static void main(String [] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入你的身份证号码：");
        String line = scanner.nextLine();
        System.out.println("身份证号是："+line.length()+"位数子");
    }
}


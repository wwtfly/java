import javax.lang.model.element.NestingKind;
import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by king on 17-3-22.
 */
public class FirstFrame extends Frame {
    public FirstFrame(String string) {
        super(string);
    }
    public static void main(String[] args) {
        //设置窗体
        FirstFrame f = new FirstFrame("这是第一个Frame");
        f.setSize(300, 200);
        f.setBackground(Color.gray);

        //设置面板
        Panel p = new Panel();
        p.setSize(200, 200);
        p.setBackground(Color.LIGHT_GRAY);

        //设置按钮
        Button b1 = new Button("按钮1");
        Button b2 = new Button("按钮2");

        //将按钮添加到panel中
        p.setLayout(new BorderLayout());
        p.add(BorderLayout.WEST,b1);
        p.add(BorderLayout.EAST,b2);
//        p.add(b1);
//        p.add(b2);
//        p.setLayout(new FlowLayout(FlowLayout.LEFT));

        //将面板添加到窗体中。
        f.add(p);
        f.setLayout(new BorderLayout());//调用frame的布局管理器。
//        f.setLayout(new FlowLayout(FlowLayout.CENTER));
        f.setVisible(true);//设置组件可见。

        f.addWindowListener(f.new Mywindowadapter());
    }

    class Mywindowadapter extends WindowAdapter {
        public void windowClosing(WindowEvent windowEvent) {
            System.exit(0);
        }
        }

}

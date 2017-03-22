import javax.swing.*;
import javax.swing.table.TableCellEditor;
import java.awt.*;

import static com.sun.xml.internal.fastinfoset.alphabet.BuiltInRestrictedAlphabets.table;


/**
 * Created by king on 17-3-22.
 */
public class ArrayCreatTable {
    public static void main(String[] args) {

        JFrame frame = new JFrame("创建窗体");
        JPanel panel = new JPanel();
        JButton button = new JButton("123");
        JTextArea textArea = new JTextArea();

        panel.setLayout(new GridLayout());
        textArea.setText("test");
        panel.add(new JScrollPane(textArea));
        panel.setSize(150, 200);
        frame.add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.setSize(300, 200);
        frame.setVisible(true);

    }

/*
    private JTable getTable() {
        if (table1 == null) {
            table1 = new JTable();
            String[] columns = {"星期一", "星期二", "星期三", "星期四", "星期五", "星期六", "星期天"};
            int[] columnWidth = {10, 20, 30, 40, 50, 60, 70};

        }
        return table1;
    }
*/
}



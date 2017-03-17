/**
 * Created by king on 17-3-17.
 */
import javax.swing.*;

public class HelloWorldSwing{
    private static void createAndShowGUI(){
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("HelloWorldSwing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Hello World");
        frame.getContentPane().add(label);

        frame.pack();
        frame.setVisible(true);

    }
    public static void main(String []args){
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                createAndShowGUI();
            }
        });
    }
}

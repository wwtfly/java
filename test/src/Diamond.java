import javax.swing.plaf.metal.MetalIconFactory;

/**
 * Created by king on 17-3-20.
 */
public class Diamond {
    public static void main(String[] args) {
        int size = 10;
        if (size % 2 == 0) {
            size++;
        }
        for (int i = 0; i < size / 2 + 1; i++) {
            for (int j = size / 2 + 1; j > i; j--) {
                System.out.print("_");
            }
                System.out.println("*");
//                for (int j = 0; i < size / 2 + 1; i++) {
//                    for (int j = size / 2 + 1; j > i; j--) {
//                        System.out.print("_");
//                    }
//                    System.out.println("*");
//
//                }
            }

        }
    }
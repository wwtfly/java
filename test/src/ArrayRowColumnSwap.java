import sun.management.jdp.JdpPacketWriter;
import sun.plugin2.util.PojoUtil;

import java.util.ArrayList;

/**
 * Created by king on 17-3-20.
 */
public class ArrayRowColumnSwap {
    public static void main(String[] args) {
        int[][] arr1 = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}};
        int[][] arr2 = new int[3][4];
        System.out.println("互换前数组：");
        PrintArray(arr1);

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                arr2[i][j] = arr1[i][j];
            }
        }
        System.out.println("互换后的数组");
        PrintArray(arr2);
    }

    public static void PrintArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[j].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
//            System.out.print(arr.length);
            System.out.println();
        }
    }
}

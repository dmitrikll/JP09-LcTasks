package task03;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        TwoSum ts = new TwoSum();

        System.out.println(Arrays.toString(ts.calculateTwoSum(new int[]{2, 7, 11, 15}, 9)));
        System.out.println(Arrays.toString(ts.calculateTwoSum(new int[]{3, 2, 4}, 6)));
        System.out.println(Arrays.toString(ts.calculateTwoSum(new int[]{3, 3}, 6)));
    }
}

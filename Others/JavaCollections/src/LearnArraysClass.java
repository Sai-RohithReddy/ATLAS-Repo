import java.util.Arrays;
import java.util.Collections;

public class LearnArraysClass {
    public static void main(String[] args) {
        int[] num1 = {1,2,3,4,5,6,7,8};
        int index = Arrays.binarySearch(num1,3);
        System.out.println(index);
        System.out.println(num1);
        System.out.println(Arrays.toString(num1));

        System.out.println();

        int[] num2 = {2,3,4,1,5,6,9,7};
        System.out.println(Arrays.toString(num2));
        Arrays.sort(num2); // it implements quick sort
        System.out.println(Arrays.toString(num2));
        System.out.println();

        Arrays.fill(num1, 11);
        System.out.println(Arrays.toString(num1));
    }
}

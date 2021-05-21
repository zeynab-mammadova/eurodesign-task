package task;

import java.util.Arrays;

public class MySortedArray {

    public static final int length = 200;

    public static void mySort(int[] array) {

        //create new array for store counts of element in the given array
        int[] count = new int[length];

        //use the value of elements in the given array as an index
        //and update their counts in the new array
        for (int i : array) {
            count[i]++;

        }

        //again write the given array with sorted order
        int n = 0;
        for (int i = 0; i < length; i++) {
            while (count[i] > 0) {
                count[i] = count[i] - 1;
                array[n++] = i;
            }
        }
    }

    public static void main(String[] args) {
        // 0<a[i]<50
        int[] array = new int[200];
        for (int i = 0; i < array.length; i++) {
            //fill array with random numbers between 0 and 50
            array[i] = (int) (Math.random() * 49) + 1;

        }
        mySort(array);
        System.out.println(Arrays.toString(array));
    }

}

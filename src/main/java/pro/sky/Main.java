package pro.sky;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class Main {

    public static void task1() {
        //1
        Integer[] arr1 = new Integer[]{1, 2, 3};
        Double[] arr2 = {1.57, 7.654, 9.986};
        Main[] arr3 = new Main[3];

        //2
        printArray(arr1);
        printArray(arr2);
        printArray(arr3);

        //3
        printReverseArray(arr1);
        printReverseArray(arr2);
        printReverseArray(arr3);

        //4
        for (int i = 0, length = arr1.length; i < length; i++)
            if ((arr1[i] & 1) == 1)
                ++arr1[i];
        printArray(arr1);
    }

    public static void task2() {
        int[][] arr = new int[3][3];

        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = 1;
            arr[i][arr.length - 1 - i] = 1;
        }

        for (int[] row : arr) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }

    public static void task3(int[] arr) {
        Integer[] reversedArr = IntStream.of(arr).boxed().toArray(Integer[]::new);
        Collections.reverse(Arrays.asList(reversedArr));

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(reversedArr));
    }

    public static void task4(int[] arr) {
        int tmp;

        for (int i = 0, length = arr.length; i < length / 2; i++) {
            tmp = arr[i];
            arr[i] = arr[length - i - 1];
            arr[length - i - 1] = tmp;
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void task5(int[] arr, int target) {
        Map<Integer, Integer> prevMap = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (prevMap.containsKey(target - arr[i])) {
                System.out.println(arr[prevMap.get(target - arr[i])] + " " + arr[i]);
                return;
            }
            prevMap.put(arr[i], i);
        }
    }

    public static void task6(int[] arr, int target) {
        Map<Integer, Integer> prevMap = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (prevMap.containsKey(target - arr[i])) {
                System.out.println(arr[prevMap.get(target - arr[i])] + " " + arr[i]);
            }
            prevMap.put(arr[i], i);
        }
    }

    public static <T> void printArray(T[] array) {
        if (array == null) {
            System.out.println("null");
            return;
        }
        for (int i = 0, length = array.length; ; i++) {
            if (i == length - 1) {
                System.out.println(array[i] == null ? "null" : array[i]);
                break;
            }
            System.out.print((array[i] == null ? "null" : array[i]) + ", ");
        }
    }

    public static <T> void printReverseArray(T[] array) {
        if (array == null) {
            System.out.println("null");
            return;
        }
        for (int i = array.length - 1; ; i--) {
            if (i == 0) {
                System.out.println(array[i] == null ? "null" : array[i]);
                break;
            }
            System.out.print((array[i] == null ? "null" : array[i]) + ", ");
        }
    }
}

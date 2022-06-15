package pro.sky;

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
        for (int i = array.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(array[i] == null ? "null" : array[i]);
                break;
            }
            System.out.print((array[i] == null ? "null" : array[i]) + ", ");
        }
    }
}

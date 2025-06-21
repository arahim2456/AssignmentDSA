

import java.util.Stack;

public class ReverseArrayWithStack {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        System.out.print("Original Array: ");
        printArray(arr);

        reverseArray(arr);

        System.out.print("Reversed Array: ");
        printArray(arr);
    }

    public static void reverseArray(int[] arr) {
        Stack<Integer> stack = new Stack<>();

        for (int num : arr) {
            stack.push(num);
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.pop();
        }
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

public class RecursiveArraySum {
    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 20};
        int sum = recursiveSum(arr, 0);
        System.out.print("Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println("\nSum of elements: " + sum);
    }

    public static int recursiveSum(int[] arr, int index) {
        if (index == arr.length) return 0;
        return arr[index] + recursiveSum(arr, index + 1);
    }
}

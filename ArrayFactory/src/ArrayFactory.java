import java.util.Arrays;
import java.util.Scanner;

public class ArrayFactory {
    // Method without the largest element sum
    public static int sumWithoutLargest(int[] array) {
        // Will get 0 if they array is empty
        if (array.length == 0) {
            return 0;
        }

        int sum = 0;
        int largest = array[0];

        // Loops through the array to find the sum and largest element
        for (int num : array) {
            sum += num;
            if (num > largest) {
                largest = num;
            }
        }

        return sum - largest;
    }

    // Method that swaps largest and smallest elements 
    public static void swapLargestSmallest(int[] array) {

        if (array.length == 0) {
            return;
        }

        int largestIndex = 0;
        int smallestIndex = 0;

        // Loops through the array 
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[largestIndex]) {
                largestIndex = i;
            }
            if (array[i] < array[smallestIndex]) {
                smallestIndex = i;
            }
        }

        // Swaps the largest and smallest elements
        int temp = array[largestIndex];
        array[largestIndex] = array[smallestIndex];
        array[smallestIndex] = temp;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prints the number of elements in the array from the user
        System.out.println("Enter number of elements in the array:");
        int n = scanner.nextInt();

        int[] array = new int[n];

        // Prints the elements of the array 
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Displays the original array
        System.out.println("Original Array: " + Arrays.toString(array));

        int sumExcludingLargest = sumWithoutLargest(array);
        System.out.println("Sum without largest element: " + sumExcludingLargest);

        // Prints the array after sumWithoutLargest method
        System.out.println("Array after sumWithoutLargest: " + Arrays.toString(array));

        swapLargestSmallest(array);
        System.out.println("Array after swapping largest and smallests elements: " + Arrays.toString(array));


        scanner.close();
    }
}

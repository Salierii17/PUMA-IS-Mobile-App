
/*You are given an array of integers.
Your task is to write a Java function that
finds the maximum element in the array.*/
public class FindMax {
    public static void main(String[] args) {
        int[] numbers = {66,77,23,74,93};
        int max = findMax(numbers);
        System.out.println("The maximum element is "+max);
    }
    public static int findMax (int [] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max =arr[i];
            }
        }
        return max;
    }
}



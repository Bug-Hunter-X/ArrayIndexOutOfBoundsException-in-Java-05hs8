public class MyClass {
    public static void main(String[] args) {
        int[] arr = new int[5];
        if (arr.length > 0) {
            arr[0] = 10; // Assign within the bounds
            System.out.println(arr[0]);
        } else {
            System.out.println("Array is empty");
        }
    }
}
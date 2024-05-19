import java.util.Arrays;

public class MergeArrays {
    public static void main(String[] args) {
        
        int[] a = {10, 45, 23, 67, 23, 89};
        int[] b = {76, 34, 12, 45, 122};

        int lengthA = a.length;
        int lengthB = b.length;
        int[] mergedArray = new int[lengthA + lengthB];

        System.arraycopy(a, 0, mergedArray, 0, lengthA);

         System.arraycopy(b, 0, mergedArray, lengthA, lengthB);

        System.out.println("Merged array: " + Arrays.toString(mergedArray));
    }
}

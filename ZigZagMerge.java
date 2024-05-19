import java.util.ArrayList;
import java.util.Arrays;

public class ZigZagMerge {

    public static void main(String[] args) {
        int[] a = {10, 45, 23, 67, 23, 89};
        int[] b = {76, 34, 12, 45, 122};

        int[] mergedArray = mergeInZigzag(a, b);

        System.out.println("Merged array in zigzag manner: " + Arrays.toString(mergedArray));
    }
    public static int[] mergeInZigzag(int[] a, int[] b) {
        ArrayList<Integer> mergedList = new ArrayList<>();
        int maxLength = Math.max(a.length, b.length);

        for (int i = 0; i < maxLength; i++) {
            if (i < a.length) {
                mergedList.add(a[i]);
            }
            if (i < b.length) {
                mergedList.add(b[i]);
            }
        }
        int[] mergedArray = new int[mergedList.size()];
        for (int i = 0; i < mergedList.size(); i++) {
            mergedArray[i] = mergedList.get(i);
        }

        return mergedArray;
    }
}

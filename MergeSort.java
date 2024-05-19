public class MergeSort {
    public static void main(String[] args) {
        int[] alpha = {2, 24, 36, 48, 50};
        int[] beta = {11, 23, 25, 27, 39, 41, 53};

        int[] result = mergeSortedArrays(alpha, beta);

        System.out.println("Merged and sorted array: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public static int[] mergeSortedArrays(int[] alpha, int[] beta) {
        int[] result = new int[alpha.length + beta.length];
        int i = 0, j = 0, k = 0;

        while (i < alpha.length && j < beta.length) {
            if (alpha[i] < beta[j]) {
                result[k++] = alpha[i++];
            } else {
                result[k++] = beta[j++];
            }
        }

        while (i < alpha.length) {
            result[k++] = alpha[i++];
        }

        while (j < beta.length) {
            result[k++] = beta[j++];
        }

        return result;
    }
}

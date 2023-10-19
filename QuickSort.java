
public class QuickSort {
    public static void main(String[] args) {
        int arr[] = { 6, 3, 9, 5, 2, 8 };
        divide(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void divide(int arr[], int s, int e) {
        if (s >= e) {
            return;
        }

        int[] demo1 = new int[e - s + 1];
        int[] demo2 = new int[e - s + 1];
        int idx1 = 0;
        int idx2 = 0;

        int pivot = arr[e];
        if (s == e) {
            return;
        }
        for (int i = s; i < e; i++) {
            if (arr[i] < pivot) {
                demo1[idx1] = arr[i];
                idx1++;
            } else {
                demo2[idx2] = arr[i];
                idx2++;
            }
        }

        System.arraycopy(demo1, 0, arr, s, idx1);

        arr[s + idx1] = pivot;
        System.arraycopy(demo2, 0, arr, s + idx1 + 1, idx2);

        // Recursive calls with correct ending indices
        divide(arr, s, s + idx1 - 1);
        divide(arr, s + idx1 + 1, e);
    }
}

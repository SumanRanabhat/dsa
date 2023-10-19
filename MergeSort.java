// public class MergeSort {
// public static int mid;
// public static int[] arr = { 6, 3, 9, 5, 2, 8 };

// public static void main(String[] args) {
// // int arr[] = { 6, 3, 9, 5, 2, 8 };

// int si = 0, end = arr.length;
// System.out.print("print orignal arrays");
// for (int i = 0; i < end; i++) {
// System.out.print(arr[i] + "");
// System.out.println();

// }
// divide(arr, si, end);
// for (int i = 0; i < end; i++) {
// System.out.print(arr[i] + "");
// }
// System.out.println();
// // conquer(arr, si, mid, end);

// }

// public static void divide(int arry[], int s, int e) {
// if (s >= e) {
// return;
// }
// // int mid = s + (s - e) / 2;
// mid = (s + e) / 2;
// divide(arry, s, mid);
// divide(arry, mid + 1, e);
// conquer(arr, s, mid, e);

// }

// public static void conquer(int[] arre, int start, int mid, int end) {
// System.out.print("inside conquer ");
// int demo[] = new int[end - start + 1];
// int idx1 = 0;
// int idx2 = mid + 1;
// int x = 0;
// while (idx1 <= mid && idx2 < end)

// {
// if (arre[idx1] < arre[idx2]) {
// demo[x++] = arre[idx1++];

// } else {
// demo[x++] = arre[idx2++];

// }

// }
// while (idx1 < mid) {
// for (int i = idx1; i <= mid; i++) {
// demo[x++] = arre[idx1++];
// }
// }
// while (idx2 < end) {
// for (int i = idx2; i <= end; i++) {
// demo[x++] = arre[idx2++];
// }
// }
// // for (int i = 0, j = i; i < demo.length-1; i++) {
// // arre[j] = demo[i];
// // System.out.print(arre[i]);
// // }
// for (int i = 0, j = start; i < demo.length - 1; i++, j++) {
// arre[j] = demo[i];
// System.out.print(arre[j] + " "); // Print the sorted element
// }

// }

// }

public class MergeSort {
    public static void main(String[] args) {
        int arr[] = { 6, 3, 9, 5, 2, 8 };

        System.out.print("Original array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        divide(arr, 0, arr.length - 1); // Start sorting

        System.out.print("Sorted array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void divide(int arr[], int s, int e) {
        if (s < e) {
            int mid = (s + e) / 2;
            divide(arr, s, mid);
            divide(arr, mid + 1, e);
            conquer(arr, s, mid, e);
        }
    }

    public static void conquer(int[] arr, int start, int mid, int end) {
        int demo[] = new int[end - start + 1];
        int idx1 = start;
        int idx2 = mid + 1;
        int x = 0;

        while (idx1 <= mid && idx2 <= end) {
            if (arr[idx1] < arr[idx2]) {
                demo[x++] = arr[idx1++];
            } else {
                demo[x++] = arr[idx2++];
            }
        }

        while (idx1 <= mid) {
            demo[x++] = arr[idx1++];
        }

        while (idx2 <= end) {
            demo[x++] = arr[idx2++];
        }

        // Copy the sorted elements back to the original array
        for (int i = 0, j = start; i < demo.length; i++, j++) {
            arr[j] = demo[i];
        }
    }
}

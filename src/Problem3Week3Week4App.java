import java.util.Arrays;

public class Problem3Week3Week4App {
    private static void mergeSort(long[] arr, int left, int right) {
        if (left >= right) {
            return;
        }
        int mid = left + (right - left) / 2;
        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);
        merge(arr, left, mid, right);
    }

    private static void merge(long[] arr, int left, int mid, int right) {
        long[] temp = new long[right - left + 1];
        int i = left;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= right) {
            temp[k++] = arr[j++];
        }
        for (int x = 0; x < temp.length; x++) {
            arr[left + x] = temp[x];
        }
    }

    private static void quickSort(long[] arr, int low, int high) {
        if (low >= high) {
            return;
        }
        int pivotIndex = partition(arr, low, high);
        quickSort(arr, low, pivotIndex - 1);
        quickSort(arr, pivotIndex + 1, high);
    }

    private static int partition(long[] arr, int low, int high) {
        long pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                long temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        long temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    public static void main(String[] args) {
        long[] tradeVolumes = {900, 120, 700, 450, 60, 1300};
        long[] mergeSorted = Arrays.copyOf(tradeVolumes, tradeVolumes.length);
        long[] quickSorted = Arrays.copyOf(tradeVolumes, tradeVolumes.length);

        mergeSort(mergeSorted, 0, mergeSorted.length - 1);
        quickSort(quickSorted, 0, quickSorted.length - 1);

        System.out.println("P3 - Merge + Quick Sort Trade Volumes");
        System.out.println("Original: " + Arrays.toString(tradeVolumes));
        System.out.println("Merge sorted: " + Arrays.toString(mergeSorted));
        System.out.println("Quick sorted: " + Arrays.toString(quickSorted));

        System.out.println("\nSample output complete for P3.");
    }
}

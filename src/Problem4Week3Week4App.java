import java.util.Arrays;

public class Problem4Week3Week4App {
    private static void mergeSort(double[] arr, int left, int right) {
        if (left >= right) {
            return;
        }
        int mid = left + (right - left) / 2;
        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);
        merge(arr, left, mid, right);
    }

    private static void merge(double[] arr, int left, int mid, int right) {
        double[] temp = new double[right - left + 1];
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

    private static void quickSort(double[] arr, int low, int high) {
        if (low >= high) {
            return;
        }
        int pivotIndex = partition(arr, low, high);
        quickSort(arr, low, pivotIndex - 1);
        quickSort(arr, pivotIndex + 1, high);
    }

    private static int partition(double[] arr, int low, int high) {
        double pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                double temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        double temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    public static void main(String[] args) {
        double[] portfolioReturns = {6.5, -2.1, 4.2, 8.9, 1.0};
        double[] mergeSorted = Arrays.copyOf(portfolioReturns, portfolioReturns.length);
        double[] quickSorted = Arrays.copyOf(portfolioReturns, portfolioReturns.length);

        mergeSort(mergeSorted, 0, mergeSorted.length - 1);
        quickSort(quickSorted, 0, quickSorted.length - 1);

        System.out.println("P4 - Portfolio Return Sorting Merge/Quick");
        System.out.println("Original: " + Arrays.toString(portfolioReturns));
        System.out.println("Merge sorted: " + Arrays.toString(mergeSorted));
        System.out.println("Quick sorted: " + Arrays.toString(quickSorted));

        System.out.println("\nSample output complete for P4.");
    }
}

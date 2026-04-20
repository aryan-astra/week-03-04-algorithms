import java.util.Arrays;

public class Problem1Week3Week4App {
    private static void bubbleSort(double[] values) {
        for (int i = 0; i < values.length - 1; i++) {
            for (int j = 0; j < values.length - i - 1; j++) {
                if (values[j] > values[j + 1]) {
                    double temp = values[j];
                    values[j] = values[j + 1];
                    values[j + 1] = temp;
                }
            }
        }
    }

    private static void insertionSort(double[] values) {
        for (int i = 1; i < values.length; i++) {
            double key = values[i];
            int j = i - 1;
            while (j >= 0 && values[j] > key) {
                values[j + 1] = values[j];
                j--;
            }
            values[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        double[] transactionFees = {12.5, 3.2, 8.9, 1.1, 6.0};
        double[] bubbleSorted = Arrays.copyOf(transactionFees, transactionFees.length);
        double[] insertionSorted = Arrays.copyOf(transactionFees, transactionFees.length);

        bubbleSort(bubbleSorted);
        insertionSort(insertionSorted);

        System.out.println("P1 - Bubble + Insertion For Transaction Fees");
        System.out.println("Original: " + Arrays.toString(transactionFees));
        System.out.println("Bubble sorted: " + Arrays.toString(bubbleSorted));
        System.out.println("Insertion sorted: " + Arrays.toString(insertionSorted));

        System.out.println("\nSample output complete for P1.");
    }
}

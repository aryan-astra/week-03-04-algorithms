import java.util.Arrays;

public class Problem2Week3Week4App {
    private static void bubbleSortDesc(int[] values) {
        for (int i = 0; i < values.length - 1; i++) {
            for (int j = 0; j < values.length - i - 1; j++) {
                if (values[j] < values[j + 1]) {
                    int temp = values[j];
                    values[j] = values[j + 1];
                    values[j + 1] = temp;
                }
            }
        }
    }

    private static void insertionSortDesc(int[] values) {
        for (int i = 1; i < values.length; i++) {
            int key = values[i];
            int j = i - 1;
            while (j >= 0 && values[j] < key) {
                values[j + 1] = values[j];
                j--;
            }
            values[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] riskScores = {45, 82, 63, 95, 71};
        int[] bubbleRanked = Arrays.copyOf(riskScores, riskScores.length);
        int[] insertionRanked = Arrays.copyOf(riskScores, riskScores.length);

        bubbleSortDesc(bubbleRanked);
        insertionSortDesc(insertionRanked);

        System.out.println("P2 - Risk Score Ranking Bubble/Insertion");
        System.out.println("Original: " + Arrays.toString(riskScores));
        System.out.println("Bubble ranking: " + Arrays.toString(bubbleRanked));
        System.out.println("Insertion ranking: " + Arrays.toString(insertionRanked));

        System.out.println("\nSample output complete for P2.");
    }
}

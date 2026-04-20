import java.util.Arrays;

public class Problem6Week3Week4App {
    private static int floor(int[] sorted, int target) {
        int left = 0;
        int right = sorted.length - 1;
        int answer = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (sorted[mid] <= target) {
                answer = sorted[mid];
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return answer;
    }

    private static int ceiling(int[] sorted, int target) {
        int left = 0;
        int right = sorted.length - 1;
        int answer = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (sorted[mid] >= target) {
                answer = sorted[mid];
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] thresholds = {15, 30, 45, 60, 75, 90};
        int riskScore = 58;

        int floorValue = floor(thresholds, riskScore);
        int ceilingValue = ceiling(thresholds, riskScore);

        System.out.println("P6 - Risk Threshold Binary Floor/Ceiling");
        System.out.println("Thresholds: " + Arrays.toString(thresholds));
        System.out.println("Risk score: " + riskScore);
        System.out.println("Floor threshold: " + floorValue);
        System.out.println("Ceiling threshold: " + ceilingValue);

        System.out.println("\nSample output complete for P6.");
    }
}

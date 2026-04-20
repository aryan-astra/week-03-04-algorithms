import java.util.Arrays;

public class Problem5Week3Week4App {
    private static int linearSearch(String[] accounts, String target) {
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i].equals(target)) {
                return i;
            }
        }
        return -1;
    }

    private static int binarySearch(String[] sortedAccounts, String target) {
        int left = 0;
        int right = sortedAccounts.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int compare = sortedAccounts[mid].compareTo(target);
            if (compare == 0) {
                return mid;
            }
            if (compare < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String[] accounts = {"AC-900", "AC-120", "AC-510", "AC-305"};
        String target = "AC-510";

        int linearIndex = linearSearch(accounts, target);

        String[] sorted = Arrays.copyOf(accounts, accounts.length);
        Arrays.sort(sorted);
        int binaryIndex = binarySearch(sorted, target);

        System.out.println("P5 - Linear + Binary Account Lookup");
        System.out.println("Linear search index in original array: " + linearIndex);
        System.out.println("Sorted accounts: " + Arrays.toString(sorted));
        System.out.println("Binary search index in sorted array: " + binaryIndex);

        System.out.println("\nSample output complete for P5.");
    }
}

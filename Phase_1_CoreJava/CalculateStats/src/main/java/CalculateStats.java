import java.io.IOException;
import java.util.Scanner;

public class CalculateStats {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        System.out.println("***********************************************************");
        System.out.println("**************** Solution for Assignment 1 ****************");
        System.out.println("***********************************************************");
        System.out.println("Enter number of elements: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        try {
            Stats stats = ComputeStats(arr);
            System.out.println(stats);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static Stats ComputeStats(int[] arrNums) throws IllegalArgumentException
    {
        if (arrNums == null || arrNums.length == 0)
            throw new IllegalArgumentException("Input array is null or empty");

        Stats retStats = new Stats();

        retStats.nSum = arrNums[0];
        retStats.nMin = arrNums[0];
        retStats.nMax = arrNums[0];
        retStats.dAvg = 0;

        for (int i = 1; i < arrNums.length; i++) {
            retStats.nSum += arrNums[i];
            retStats.nMin = Math.min(arrNums[i], retStats.nMin);
            retStats.nMax = Math.max(arrNums[i], retStats.nMax);
        }

        retStats.dAvg = (double) retStats.nSum / arrNums.length;

        return retStats;
    }

    public static class Stats
    {
        public int nSum = 0;
        public double dAvg = 0.0;
        public int nMin = Integer.MIN_VALUE;
        public int nMax = Integer.MAX_VALUE;

        public Stats()
        {
        }

        @Override
        public String toString() {
            return String.format("Sum = %d, Min = %d, Max = %d, Avg = %.4f", nSum, nMin, nMax, dAvg);
        }
    }
}

import java.io.IOException;
import java.io.InputStream;
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

        stStats stats = ComputeStats(arr);
        System.out.println(stats);
    }

    public static stStats ComputeStats(int[] arrNums)
    {
        stStats retStats = new stStats();

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

    public static class stStats
    {
        public int nSum = 0;
        public double dAvg = 0.0;
        public int nMin = Integer.MIN_VALUE;
        public int nMax = Integer.MAX_VALUE;

        public stStats()
        {
        }

        @Override
        public String toString() {
            return "Sum = " + nSum + ", Min = " + nMin + ", Max = " + nMax + ", Avg = " + dAvg;
        }
    }
}

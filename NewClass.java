public class NewClass {
    public static int getLargest(int arr[], int sz) {
        int iterate1 = 0;       // 1 step
        int iterate2 = 0;       // 1 step
        int largest = 0;        // 1 step

        while (iterate1 < sz - 1) {     // (n-1) step
            iterate2++;                 // n step
            if (iterate2 == sz) {       // (n-1) step
                iterate1++;             // n step
                iterate2 = iterate1;    // 1 step
                continue;               // 1 step
            }

            int product = arr[iterate1] * arr[iterate2];    // n^2 step

            if (product > largest)          // 1 step
                largest = product;          // 1 step
        }
        return largest;                     // 1 step
    }
}
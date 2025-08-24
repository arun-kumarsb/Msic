public class F1_Main {
    public static void main(String[] args) {
        // it is used for sorted array // asecindng and desending

        // int[] arr = { 2, 4, 6, 9, 11, 12, 14, 20, 36, 48 };
        // index 0, 1, 2, 3, 4, 5, 6, 7, 8, 9
        // int target = 36;
        // take 2 pointer low and high
        // low = 0;
        // high = length - 1;
        // find the middle element of sorted array // mid = (low + high) / 2;
        // if middle element == target // return target found at index mid
        // if target > middel // seacrch in right hand side or esle search in left hand
        // side
        // if start>= end // element does not exist

        /*
         * s m e
         * { 2, 4, 6, 9, 11, 12, 14, 20, 36, 48 };
         *   0, 1, 2, 3, 4, 5, 6, 7, 8, 9
         * start = 0;
         * end = arr.length - 1; // 9
         * m = (0 + 9 ) / 2; // 4
         * m = arr[4] = 11;
         * 
         * s m e
         * { 12, 14, 20, 36, 48 };
         * 5, 6, 7, 8, 9
         * start = m + 1 ; // m = 4 // new start = 5;
         * end = arr.length - 1; // 9 // end will be same;
         * m = (5 + 9 ) / 2; // 7
         * m = arr[7] = 20;
         * 
         * 
         * s,m e
         * { 36, 48 }
         * 8, 9
         * start = m + 1 ; // m = 7 // new start = 8;
         * end = arr.length - 1; // 9 // end will be same;
         * m = (8 + 9 ) / 2; // 8
         * m = arr[8] = 36;
         * 
         */

        /*
         * s m e
         * { 2, 4, 6, 9, 11, 12, 14, 20, 36, 48 };
         *   0, 1, 2, 3, 4, 5, 6, 7, 8, 9
         * start = 0;
         * end = arr.length - 1; // 9
         * m = (0 + 9 ) / 2; // 4
         * m => arr[4] = 11; // m == target // false
         * 
         * s m e
         * { 12, 14, 20, 36, 48 };
         * 5, 6, 7, 8, 9
         * start = m + 1 ; // m = 4 // new start = 5;
         * end = arr.length - 1; // 9 // end will be same;
         * m = (5 + 9 ) / 2; // 7
         * m = arr[7] = 20;
         * 12 < 20;
         * 
         * 
         * s,m e
         * { 12, 14 }
         *    5, 6
         * start = 5  // now start will be same;
         * end = mid - 1; // 6
         * m = (5 +6) / 2; // 5
         * m = arr[5] = 12;
         * 
         */


         // why binary search
         // ---- best case senario -- min of step element found at midddle value -- constant
         // ---- wrst case senario -- O(log(N))

        // | | | | | |*|*|*|*|*|  == N/2^0

        // | | |*|*|*| == N/2^1

        // .... N/2^k = 1 at kth level

        //  N = 2^k
        // log2(N) = log(k)

    }
}

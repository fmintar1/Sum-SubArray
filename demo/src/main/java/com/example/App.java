package com.example;

/**
 * Hello world!
 */
public final class App {

    public static int sumSubArray(int[] arr) {
        int iLimiter = 0;
        int iLimitStopper = 0;
        int result = 0;
        int i = 0;
        while(i != arr.length) {
            result+=arr[i];
            // System.out.println("arr[i] = " + arr[i]);
            // System.out.println("result = " + result);
            if (i == iLimiter) {
                i = iLimitStopper;
                iLimiter++;
                if (iLimiter == arr.length) {
                    iLimitStopper++;
                    iLimiter = iLimitStopper;
                    // System.out.println("iLimiter = " + iLimiter);
                    i = iLimiter;
                    continue;
                } else {
                    continue;
                }
            }
            i++;
        }
        return result;
    }
}

package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;

class AppTest {
    
    @Test
    public void test1() {
        int[] arr = {1,3,5,4};
        assertEquals(App.sumSubArray(arr), 68);
    }

    @Test
    public void test2() {
        int[] arr = {5,4,3,2,1};
        assertEquals(App.sumSubArray(arr), 105);
    }

    @Test
    public void test3() {
        int[] arr = {4};
        assertEquals(App.sumSubArray(arr), 4);
    }

    @Test
    public void test4() {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        assertEquals(App.sumSubArray(arr), 5440);
    }

    @Test
    public void test5() {
        int[] arr = {0,0,2,5};
        assertEquals(App.sumSubArray(arr), 32);
    }
}

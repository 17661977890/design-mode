package com.qidian.mall.design.mode.sort;

import java.util.Arrays;

public class BubbleSort {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        sort();
        sort2();

    }

    // 小到大
    private static void sort(){
        int[] arrays = {5,3,10,9,12,8};

        for (int i = 0; i <arrays.length ; i++) {
            for (int j = 0; j <arrays.length-1-i ; j++) {
                if(arrays[j+1]<arrays[j]){
                    int t = arrays[j];
                    arrays[j]=arrays[j+1];
                    arrays[j+1]=t;
                }
            }
        }
        System.out.println(Arrays.toString(arrays));
    }
    //大到小
    private static void sort2(){
        int[] arrays = {5,3,10,9,12,8};

        for (int i = 0; i <arrays.length ; i++) {
            for (int j = 0; j <arrays.length-1-i ; j++) {
                if(arrays[j+1]>arrays[j]){
                    int t = arrays[j+1];
                    arrays[j+1]=arrays[j];
                    arrays[j]=t;
                }
            }
        }
        System.out.println(Arrays.toString(arrays));
    }
}

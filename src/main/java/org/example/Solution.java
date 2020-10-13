package org.example;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public Integer[] solution(int k, int m, Integer[] a) {
        List<Integer> sol = new ArrayList<>();

        int maxCount = 0;
        int index = -1; // sentinels
        for (int i = 0; i < a.length; i++) {
            int count = 0;
            for (int j = i; j < a.length; j++) {
                if (a[i] == a[j])
                    count++;
            }

            // update maxCount if count of
            // current element is greater
            if (count > maxCount) {
                maxCount = count;
                index = i;
            }
        }

        // if maxCount is greater than n/2
        // return the corresponding element
        if (maxCount >= a.length / 2)
            sol.add(a[index]);

        Integer[] resul = new Integer[sol.size()];
        return sol.toArray(resul);
    }

    public void printArray(Integer[] arr) {
        if (arr.length == 0) {
            System.out.println("[]");
        } else {
            StringBuilder str = new StringBuilder("[");
            for(int i = 0; i < arr.length; i++) {
                str.append(arr[i] + ", ");
            }
            String impresion = str.toString().substring(0,str.length()-2);
            System.out.println(impresion + "]");

        }
    }

    public Integer[] increment(Integer ini, Integer k, final Integer[] arr) {
        int size = arr.length;
        for(int i = ini; i <= ini + k; i++) {
            arr[i]++;
        }
        return arr;
    }

    private boolean validaArray(Integer m, Integer[] a) {
        for(int i = 0; i < a.length; i++) {
            if (a[i] > m) return false;
        }
        return true;
    }
}

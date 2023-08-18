package com.fastcampus.ch2;

import java.util.ArrayList;
import java.util.List;

public class Main3 {
    public static void main(String[] args) {
        int[] num = {6, 10, 2};
        String[] str = new String[num.length];
        List<String> arr = new ArrayList<>();
        for (int i = 0; i < num.length; i++) {
            str[i] = String.valueOf(num[i]);
            arr.add(str[i]);
        }

        List<String> result = new ArrayList<>();
        perm(arr, result, arr.size(), 3);

    }
    private static void perm(List<String> arr, List<String> result, int n, int r) {

        if (r == 0) {
            System.out.println(result.toString());
            return;
        }

        for (int i = 0; i < n; i++) {
            result.add(arr.remove(i));
            perm(arr, result, n - 1, r - 1);
            arr.add(i, result.remove(result.size() - 1));
        }

    }
}

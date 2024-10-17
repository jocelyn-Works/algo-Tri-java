package edu.campusnum.visualsort.sort;

import edu.campusnum.visualsort.model.ObservableArray;

/**
 * Created by Web 74 all right reserved
 * User: vincent
 * Date: 27/07/2023
 * Time: 16:32
 */
public class ShellSort implements SortAlgorithm{
    @Override
    public void sort(ObservableArray array) {
        int longeur = array.getLength();
        int n = 0;
        while (n < longeur) {
            n = 3 * n +1;
        }

        while (n != 0 ) {
            n = n/3;

            for (int i = n; i < longeur; i++) {
                int valeur = array.get(i);
                int j = i;
                while (j > n-1 && array.get(j-n) > valeur) {
                    array.swap(j, j-n);
                    j = j - n;

                }
            }
            n = n /3;

        }
    }
}
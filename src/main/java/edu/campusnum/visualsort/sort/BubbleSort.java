package edu.campusnum.visualsort.sort;

import edu.campusnum.visualsort.model.ObservableArray;

import static java.lang.reflect.Array.getLength;

/**
 * Created by Web 74 all right reserved
 * User: vincent
 * Date: 27/07/2023
 * Time: 16:32
 */
public class BubbleSort implements SortAlgorithm{
    @Override
    public void sort(ObservableArray array) {
        int n = array.getLength();
        int passage = 0;
        boolean permut = true;

        while (permut) {
            permut = false;
            for (int i = 0; i < n - 1; i++) {
                if (array.get(i) > array.get(i + 1)) {
                    array.swap(i, i + 1);
                    permut = true;
                }
                passage = passage + 1;
            }
        }


    }
}
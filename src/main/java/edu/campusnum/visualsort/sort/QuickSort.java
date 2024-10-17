package edu.campusnum.visualsort.sort;

import edu.campusnum.visualsort.model.ObservableArray;

/**
 * Created by Web 74 all right reserved
 * User: vincent
 * Date: 27/07/2023
 * Time: 16:31
 */
public class QuickSort implements SortAlgorithm{
    @Override

    public void sort(ObservableArray array) {

        tri_rapide(array, 0, array.getLength() - 1);
    }

    public void tri_rapide(ObservableArray array, int first , int last) {

        if (first < last) {
            int pi = partitionener(array,first , last);
            tri_rapide( array,first, pi -1);
            tri_rapide(array, pi + 1, last);

        }
    }

    public int partitionener(ObservableArray array, int first , int last) {
        int pivot = last;
        int j = first;

        for (int i = first; i <= pivot -1; i++) {
            if (array.get(i) <= array.get(pivot)) {
                array.swap(i , j);
                j = j + 1;
            }
        }
            array.swap(last, j);
            return j;
    }
}

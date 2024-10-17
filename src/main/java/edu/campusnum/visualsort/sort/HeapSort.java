package edu.campusnum.visualsort.sort;

import edu.campusnum.visualsort.model.ObservableArray;

/**
 * Created by Web 74 all right reserved
 * User: vincent
 * Date: 27/07/2023
 * Time: 16:31
 */
public class HeapSort implements SortAlgorithm{
    @Override
    public void sort(ObservableArray array) {
        organiser(array);
        for (int i = array.getLength() -1; i >= 0; i--) {
            array.swap(0, i);
            redecendre(array, i , 0);
        }
    }

    public void organiser(ObservableArray array) {

        for (int i = 0; i < array.getLength() -1 ; i++) {
            remoter(array, i );
        }

    }

    public void remoter(ObservableArray array, int index) {

        if ( array.get(index) > array.get(index /2) ) {
            array.swap( index, index /2);
            remoter(array, index /2);
        }

    }

    public void redecendre(ObservableArray array, int element ,  int index) {

        int formula = 2 * index + 1;
        int max ;
        if (formula < element) {
            if (array.get(formula) > array.get(2 * index)) {
                max = formula;
            }else {
                max = 2 * index;
            }
            if (array.get(max) > array.get(index)) {
                array.swap( max , index);
                redecendre(array, element,max);
            }
        }

    }

}

package edu.campusnum.visualsort.sort;

import edu.campusnum.visualsort.model.ObservableArray;

/**
 * Created by Web 74 all right reserved
 * User: vincent
 * Date: 27/07/2023
 * Time: 16:31
 */
public class MergeSort implements SortAlgorithm{
    @Override
    public void sort(ObservableArray array) {

        //tri_fusion(array);
    }

//    public int tri_fusion(ObservableArray array) {
//        int  first = 0;
//        int last = array.getLength() -1;
//        int middle = last /2 + 1;
//
//        ObservableArray left = array.slice(first , middle);
//        ObservableArray right = array.slice(middle , last);
//
//        if (array.getLength() < 1) {
//            return last;
//        }else {
//            return fusion( tri_fusion(left) , tri_fusion(right) );
//        }
//    }
//
//
//
//    public int fusion(int  A , int  B){
//        if (A == 0) {
//            return B;
//        }
//        if (B == 0) {
//            return A;
//        }
//        if (A[1] <= B[1]){
//            return A[1] + fusion(A, B);
//        }else {
//
//        return B[1] fusion(A,B);
//
//        }
//
//    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication5;
import java.util.ArrayList;
import static javaapplication5.MergeSortExample.fillArray;
import static javaapplication5.MergeSortExample.mergeSort;
import static javaapplication5.MergeSortExample.print;
/**
 *
 * @author Qaiaty Store
 */
public class merge {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        fillArray(arr);
        mergeSort(arr, 0, arr.size() - 1);
        print(arr);
    }
}

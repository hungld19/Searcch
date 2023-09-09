/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.ArrayModel;
import View.ArrayView;

/**
 *
 * @author LAPTOP DELL
 */
public class ArrayController {
    private ArrayModel model;
    private ArrayView view;

    public ArrayController(ArrayModel model, ArrayView view) {
        this.model = model;
        this.view = view;
    }

    public void processSearch() {
        int[] array = view.getInputArray();
        model.setArray(array);
        int searchValue = view.getInputSearchValue();
        int index = model.searchValue(searchValue);
        view.displayArray(array);
        view.displaySearchResult(searchValue, index);
    }

    public void processSort() {
        int[] array = view.getInputArray();
        model.setArray(array);
        model.sortArray();
        view.displaySortedArray(model.getArray());
    }
}
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
public class Main {
    public static void main(String[] args) {
        ArrayModel model = new ArrayModel();
        ArrayView view = new ArrayView();
        ArrayController controller = new ArrayController(model, view);

        boolean exit = false;

        while (!exit) {

            int choice = view.getInputChoice();

            switch (choice) {
                case 1:
                    controller.processSearch();
                    break;
                case 2:
                    controller.processSort();
                    break;
                case 3:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid selection. Please choose again.");
            }
        }
    }
}

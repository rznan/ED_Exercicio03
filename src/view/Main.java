package view;

import controller.FatorialController;

public class Main {
    public static void main(String[] args) {
        int value = 12;
        var fatController = new FatorialController();

        System.out.println(fatController.calculate(value));
    }
}
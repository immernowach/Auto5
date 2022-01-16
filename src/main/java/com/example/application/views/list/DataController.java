package com.example.application.views.list;

public class DataController {
    private int ButtonSelection = 1;

    public int getButtonSelection() {
        return ButtonSelection;
    }

    public void setButtonSelection(int buttonSelection) {
        ButtonSelection = buttonSelection;
        System.out.println("set: " + ButtonSelection);
    }
}

package com.beniregev.designpatterns.j2ee_patterns.model_view_controller.example2;

public class CalculatorModel {
    // Holds the value of the sum of the numbers
    // entered the view
    private int calculationValue;
    public void addTwoNumbers(int firstNumber, int secondNumber){
        calculationValue = firstNumber + secondNumber;
    }

    public int getCalculationValue(){
        return calculationValue;
    }

}

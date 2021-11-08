package com.beniregev.designpatterns.j2ee_patterns.model_view_controller.example2;

/**
 * <div>
 *     <h1>Application Class</h1>
 *     <p>Running the example.</p>
 * </div>
 * @author binyamin.regev
 */
public class MVCCalculator {
    public static void main(String[] args) {
        CalculatorView theView = new CalculatorView();
        CalculatorModel theModel = new CalculatorModel();
        CalculatorController theController = new CalculatorController(theView,theModel);
        theView.setVisible(true);
    }

}

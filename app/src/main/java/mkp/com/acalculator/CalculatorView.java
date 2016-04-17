package mkp.com.acalculator;

/**
 * View interface for calculator
 */
public interface CalculatorView {
    /**
     * Method to display validation error in case of malformed expression
     */
    void showValidationError();

    /**
     * Evaluate Expression and display result in text view.
     */
    void showResult();
}

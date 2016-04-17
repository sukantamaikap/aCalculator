package mkp.com.acalculator;

/**
 * Presenter interface for aCalculator
 */
public interface CalculatorPresenter {
    /**
     * Validate calculator expression
     * @return true if expression is valid, false otherwise
     */
    boolean isValidExpression();

    /**
     * Evaluate calculator expression
     */
    void evaluateExpression();
}

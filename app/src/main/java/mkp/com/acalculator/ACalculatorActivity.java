package mkp.com.acalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * Main activity for calculator project
 */
public class ACalculatorActivity extends AppCompatActivity implements CalculatorView {

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
    }

    @Override
    public void showValidationError () {
        throw new UnsupportedOperationException();
    }

    @Override
    public void showResult () {
        throw new UnsupportedOperationException();
    }
}

package calculator;

/**
 *
 * @author edangulo
 */
public class Operation {
    
    private double number1;
    private double number2;
    private String operator;
    private double result;

    public Operation(double number1, double number2, String operator, double result) {
        this.number1 = number1;
        this.number2 = number2;
        this.operator = operator;
        this.result = result;
    }

    @Override
    public String toString() {
        return number1 + " " + operator + " " + number2 + " = " + result;
    }
    
}

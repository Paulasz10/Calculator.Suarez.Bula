package calculator;

import java.util.ArrayList;

/**
 *
 * @author edangulo
 */
public class History {
    
    private ArrayList<Operation> operations;

    public History() {
        this.operations = new ArrayList<>();
    }

    public void addOperation(Operation operation) {
        this.operations.add(operation);
    }

    public ArrayList<Operation> getOperations() {
        return operations;
    }

}

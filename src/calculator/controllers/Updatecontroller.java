
package calculator.controllers;

import calculator.CalculatorFrame;
import calculator.Operation;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.DefaultListModel;

/**
 *
 * @author Andrea Paola
 */
public class Updatecontroller {
    public static Response updatecontroller(ArrayList<Operation> operationhistory) {
        ArrayList<Operation> nuevalista = operationhistory;
        DefaultListModel model = new DefaultListModel();
        model.addAll(operationhistory);
        return new Response("Has not done any operation", Status.NO_CONTENT);
    }
    public static Response updateempty(){
        return new Response("Has not done any operation", Status.NO_CONTENT);//Respuesta si se trata de mostrar historial sin haber hecho operaciones
    }
}

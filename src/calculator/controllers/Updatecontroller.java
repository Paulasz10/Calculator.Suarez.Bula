package calculator.controllers;

import calculator.CalculatorFrame;
import calculator.Operation;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.DefaultListModel;
import javax.swing.JList;

/**
 *
 * @author Andrea Paola
 */
public class Updatecontroller {

    public static Response updatecontroller(ArrayList<Operation> operationHistory, JList<String> updatelist) {

        try {
            DefaultListModel model = new DefaultListModel<>();
            for (int i = operationHistory.size() - 1; i >= 0; i--) {
                model.addElement(operationHistory.get(i));
            }//Ciclo para ordenar la lista
            updatelist.setModel(model);
            return new Response("Update done successfully", Status.OK);//Respuesta cuando se ordena correctamente el historial, del más reciente al antiguo
        } catch (Exception ex) {
            return new Response("Unexpected error", Status.INTERNAL_SERVER_ERROR);
        }
    }

    public static Response updateempty() {
        try {
            return new Response("Has not done any operation", Status.NO_CONTENT);//Respuesta si se trata de mostrar historial sin haber hecho operaciones
        } catch (Exception ex) {
            return new Response("Unexpected error", Status.INTERNAL_SERVER_ERROR);
        }
    }
}

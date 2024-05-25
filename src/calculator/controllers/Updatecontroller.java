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

    public static Response updatecontroller(String num1, String num2, ArrayList<Operation> operationHistory, JList<String> updatelist) {
        try {
            DefaultListModel model = new DefaultListModel<>();
            for (int j = 0; j <= operationHistory.size() - 1; j++) {
                String pospunto1 = "" + operationHistory.get(j).getNumber1();
                String pospunto2 = "" + operationHistory.get(j).getNumber2();
                int pos1 = pospunto1.indexOf(".");
                int pos2 = pospunto2.indexOf(".");
                if (pospunto1.substring(pos1 + 1).length() > 3 || pospunto2.substring(pos2 + 1).length() > 3) {//Controlador para que si ingresa una cantidad de decimales incorrecta, no se guarde
                    operationHistory.remove(j);
                } else {
                    String resultado = "" + operationHistory.get(j).getResult();
                    int posresult = resultado.indexOf(".");
                    if (resultado.substring(posresult + 1).length() > 3) {
                        double resultfinal = Double.parseDouble(resultado.substring(0, posresult + 4));
                        operationHistory.get(j).setResult(resultfinal);
                    }//Controlador para que solo se muestre el resultado con 3 decimales o menos
                }
            }

            for (int i = operationHistory.size() - 1; i >= 0; i--) {
                model.addElement(operationHistory.get(i));
            }
            updatelist.setModel(model);//Controlador para ordenar la lista por antiguedad

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

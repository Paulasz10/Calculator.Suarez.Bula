package calculator.controllers;

import javax.swing.JTextField;

/**
 *
 * @author Andrea Paola
 */
public class Operationscontrollers {

     public static Response operations(String num1, String num2, Double result, JTextField resulttextfield) {
        try {
            double doublenum1, doublenum2;
            int pos1 = num1.indexOf(".");
            String compara1 = num1.substring(pos1 + 1);
            if (compara1.length() > 3) {
                resulttextfield.setText("");
                return new Response("Number 1 can only have 3 decimal places.", Status.BAD_REQUEST);
            }//Respuesta cuando el numero 1 tiene más de 3 decimales

            int pos2 = num2.indexOf(".");
            String compara2 = num2.substring(pos2 + 1);
            if (compara2.length() > 3) {
                resulttextfield.setText("");
                return new Response("Number 2 can only have 3 decimal places.", Status.BAD_REQUEST);
            }//Respuesta cuando el numero 2 tiene más de 3 decimales

            String mostrarstr = "";
            String resultstr = "" + result;
            int cantresult = resultstr.indexOf(".");
            if (resultstr.substring(cantresult + 1).length() > 3) {
                mostrarstr = resultstr.substring(0, cantresult) + resultstr.substring(cantresult, 5);
            } else {
                mostrarstr = resultstr;
            }
            resulttextfield.setText(mostrarstr);//Controlador para que solo muestre el resultado con 3 o menos decimales

            if (num1.equals("")) {
                return new Response("Number 1 must be not empty", Status.BAD_REQUEST);
            }//Respuesta en caso de que el campo numero1 esté vacío
            if (num2.equals("")) {
                return new Response("Number 2 must be not empty", Status.BAD_REQUEST);
            }//Respuesta en caso de que el campo numero2 esté vacío
            
            
            try {
                doublenum1 = Double.parseDouble(num1);
            } catch (NumberFormatException ex) {
                return new Response("Number 1 must be numeric", Status.BAD_REQUEST);
            }//Respuesta en caso de que el campo numero1 no sea numero
            try {
                doublenum2 = Double.parseDouble(num2);
            } catch (NumberFormatException ex) {
                return new Response("Number 2 must be numeric", Status.BAD_REQUEST);
            }//Respuesta en caso de que el campo numero2 no sea numero

            return new Response("Operation done successfully", Status.OK);//Respuesta de operación exitosa
        } catch (Exception ex) {
            return new Response("Unexpected error", Status.INTERNAL_SERVER_ERROR);
        }
    }

    public static Response divide(String num1, String num2, double result, JTextField resulttextfield) {
        try {
            double doublenum1, doublenum2;
            if (num1.equals("")) {
                return new Response("Number 1 must be not empty", Status.BAD_REQUEST);
            }//Respuesta en caso de que el campo numero1 esté vacío
            if (num2.equals("")) {
                return new Response("Number 2 must be not empty", Status.BAD_REQUEST);
            }//Respuesta en caso de que el campo numero2 esté vacío

            int pos1 = num1.indexOf(".");
            String compara1 = num1.substring(pos1 + 1);
            if (compara1.length() > 3) {
                resulttextfield.setText("");
                return new Response("Number 1 can only have 3 decimal places.", Status.BAD_REQUEST);
            }//Respuesta cuando el numero 1 tiene más de 3 decimales

            int pos2 = num2.indexOf(".");
            String compara2 = num2.substring(pos2 + 1);
            if (compara2.length() > 3) {
                resulttextfield.setText("");
                return new Response("Number 2 can only have 3 decimal places.", Status.BAD_REQUEST);
            }//Respuesta cuando el numero 2 tiene más de 3 decimales

            String mostrarstr = "";
            String resultstr = "" + result;
            int cantresult = resultstr.indexOf(".");
            if (resultstr.substring(cantresult + 1).length() > 3) {
                mostrarstr = resultstr.substring(0, cantresult) + resultstr.substring(cantresult, 5);
            } else {
                mostrarstr = resultstr;
            }
            resulttextfield.setText(mostrarstr);//Controlador para que el resultado solo tenga 3 o menos decimales

            try {
                doublenum1 = Double.parseDouble(num1);
            } catch (NumberFormatException ex) {
                return new Response("Number 1 must be numeric", Status.BAD_REQUEST);
            }//Respuesta en caso de que el campo numero1 no sea numero
            try {
                doublenum2 = Double.parseDouble(num2);
            } catch (NumberFormatException ex) {
                return new Response("Number 2 must be numeric", Status.BAD_REQUEST);
            }//Respuesta en caso de que el campo numero2 no sea numero

        } catch (Exception ex) {
            double doublenum2 = Double.parseDouble(num2);
            if (doublenum2 == 0) {
                return new Response("Can not divided by 0", Status.BAD_REQUEST);//Respuesta de que no se puede dividir entre 0
            } else {
                return new Response("Unexpected error", Status.INTERNAL_SERVER_ERROR);
            }
        }
        return new Response("Operation done successfully", Status.OK);//Respuesta opercación exitosa
    }

}

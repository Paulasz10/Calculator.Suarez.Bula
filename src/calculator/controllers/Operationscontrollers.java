package calculator.controllers;

/**
 *
 * @author Andrea Paola
 */
public class Operationscontrollers {

    public static Response operations(String num1, String num2) {
        try {
            double doublenum1, doublenum2;
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

    public static Response divide(String num1, String num2) {
        try {
            double doublenum1, doublenum2;

            if (num1.equals("")) {
                return new Response("Number 1 must be not empty", Status.BAD_REQUEST);
            }
            if (num2.equals("")) {
                return new Response("Number 2 must be not empty", Status.BAD_REQUEST);
            }
            try {
                doublenum1 = Double.parseDouble(num1);
            } catch (NumberFormatException ex) {
                return new Response("Number 1 must be numeric", Status.BAD_REQUEST);
            }
            try {
                doublenum2 = Double.parseDouble(num2);
            } catch (NumberFormatException ex) {
                return new Response("Number 2 must be numeric", Status.BAD_REQUEST);
            }
            if (doublenum2 == 0) {
                return new Response("Can not divided by 0", Status.BAD_REQUEST);
            }//Respuesta si se trata de dividir entre 0

        } catch (Exception ex) {
            return new Response("Unexpected error", Status.INTERNAL_SERVER_ERROR);
        }

        return new Response("Operation done successfully", Status.OK);//Respuesta opercación exitosa
    }

}

package calculator.controllers;

/**
 *
 * @author Andrea Paola
 */
public class Operationscontrollers {

    public static Response operations(String num1, String num2) {
        try {
            int intnum1, intnum2;
            if (num1.equals("")) {
                return new Response("Number 1 must be not empty", Status.BAD_REQUEST);
            }
            if (num2.equals("")) {
                return new Response("Number 2 must be not empty", Status.BAD_REQUEST);
            }
            try {
                intnum1 = Integer.parseInt(num1);
            } catch (NumberFormatException ex) {
                return new Response("Number 1 must be numeric", Status.BAD_REQUEST);
            }
            try {
                intnum2 = Integer.parseInt(num2);
            } catch (NumberFormatException ex) {
                return new Response("Number 2 must be numeric", Status.BAD_REQUEST);
            }

            return new Response("Operation done successfully", Status.CREATED);
        } catch (Exception ex) {
            return new Response("Unexpected error", Status.INTERNAL_SERVER_ERROR);
        }
    }

    public static Response divide(String num1, String num2) {
        try {
            int intnum1, intnum2;
            
            if (num1.equals("")) {
                return new Response("Number 1 must be not empty", Status.BAD_REQUEST);
            }
            if (num2.equals("")) {
                return new Response("Number 2 must be not empty", Status.BAD_REQUEST);
            }
            try {
                intnum1 = Integer.parseInt(num1);
            } catch (NumberFormatException ex) {
                return new Response("Number 1 must be numeric", Status.BAD_REQUEST);
            }
            try {
                intnum2 = Integer.parseInt(num2);
            } catch (NumberFormatException ex) {
                return new Response("Number 2 must be numeric", Status.BAD_REQUEST);
            }
            if (intnum2== 0) {
                return new Response("Can not divided by 0", Status.BAD_REQUEST);
            }

            return new Response("Operation done successfully", Status.CREATED);
        } catch (Exception ex) {
            return new Response("Unexpected error", Status.INTERNAL_SERVER_ERROR);
        }
    }

}

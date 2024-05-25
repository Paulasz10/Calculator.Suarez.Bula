
package calculator.SOLID;

/**
 *
 * @author DELL-7040M
 */
public class Potency implements Interfaceoperaciones {

    @Override
    public double calculo(double a, double b) {
       return Math.pow(a, b);
       //Aquí se implementó el principio de Open/Closed, el cual menciona que el código debe estar abierto a ampliación, pero cerrado a modificarlo
       //Se le agregó la funcionalidad de potencia, sin modificar el código ya existente
    }
    
}

package calculator;

import calculator.SOLID.Interfaceoperaciones;

/**
 *
 * @author edangulo
 */
public class Calculator {
    
    
    public double calculo(Interfaceoperaciones interfop, double a, double b) {
        return interfop.calculo(a, b);
        //Esta clase no cumplía con el principio de single responsability, ya que cumplía con varias funcionalidades (suma, resta, multiplicación, división)
        //Por eso, se creó una clase correspondiente para cada operación
    
    }
}  

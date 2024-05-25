package calculator.SOLID;

/**
 *
 * @author Andrea Paola
 */
public interface Interfaceoperaciones {
     public double calculo(double a, double b);
     //Esta interfaz cumple con el principio Liskov sustitution, el cual indica que las clases derivadas pueden ser sustituidas por sus clases bases
     //Esto se cumple ya que en CalculatorFrame se llama a cada operación (add, subtration, multiply, divide, potency) como un objeto de la interfaz que implementan
     
     //Al mismo tiempo, al crear esta interfaz se cumple el principio de Interface segregation, ya que no hay interfaces innecesarias, y la que hay tiene el método necesario que todas las clases que la implemetan van usar
     //...Debido a que todas las operaciones pueden implementar ese método sin problemas, por lo ques tienen los mismos parámetros y retornan el mismo tipo de dato 
}

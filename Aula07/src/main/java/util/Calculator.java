
package util;


public class Calculator {
    
    public final double Pi = 3.14159;
    
    public double circumference(double raio) {
        return 2 * Pi * raio;
    }
    
    public double volume(double raio) {
        return 4 * Pi * raio * raio * raio / 3;
    }
    
}

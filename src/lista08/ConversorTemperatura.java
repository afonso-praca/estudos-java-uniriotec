/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lista08;

/**
 *
 * @author LABCCET
 */
public class ConversorTemperatura {

    public static double celsiusToFahrenheit(double celsius) {
        return ((9 * celsius) + (5 * 32))/5;
    }

     public static double fahrenheitToCelsius(double fahrenheit) {
        return (5 * (fahrenheit -32)) / 9;
    }
}

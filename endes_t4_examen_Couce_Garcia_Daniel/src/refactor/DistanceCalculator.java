/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refactor;

/*
 * Utiliza nombres más descriptvos para las variables.
 */

public class DistanceCalculator {

    double tiempo;
    double velocidad;

    public double calculateDistance(double tiempo, double velocidad) {
        return tiempo * velocidad;
    }
}

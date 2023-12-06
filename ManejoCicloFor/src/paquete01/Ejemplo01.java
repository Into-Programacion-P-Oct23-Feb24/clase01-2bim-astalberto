/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

/**
 *
 * @author reroes
 */
public class Ejemplo01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cadena = "";
        for (int i = 1; i <= 10; i++) {
            cadena = String.format("%s%d", cadena, i);
        }

        for (int i = 1; i < 11; i++) {
            cadena = String.format("%s%d", cadena, i);
        }
        System.out.println(cadena);
        /* For es un ciclo repetitivo en el cual en el encabezado se declara los
         el contador, la condicion y el aumento que se realiza en cada iteracion
        el contador que se declara dentro del ciclo se elimina al terminar el ciclo
        si se requiere utilizar el contador se requiere declararlo afuera del ciclo
         */
    }

}

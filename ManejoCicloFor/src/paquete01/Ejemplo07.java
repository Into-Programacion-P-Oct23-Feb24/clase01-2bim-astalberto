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
public class Ejemplo07 {

    public static void main(String[] args) {
        int operacion;
        String mensajeFinal = "";
        for (int i = 1; i <= 10; i++) { // for 01
            // System.out.printf("Tabla de multiplicar del número %d\n", i);
            mensajeFinal = String.format("%sTabla de multiplicar del número %d\n",
                    mensajeFinal, i);
            // Contador dentro del contador
            for (int contador = 1; contador <= 12; contador++) {
                // Se utiliza variables del primer Para en el segundo para
                operacion = i * contador;
                // System.out.printf("%d x %d = %d\n", i, contador, operacion);
                mensajeFinal = String.format("%s%d x %d = %d\n",
                        mensajeFinal,
                        i,
                        contador,
                        operacion);
            }
            mensajeFinal = String.format("%s\n",mensajeFinal);
            // System.out.println("\n");
        } // termina for 01

        System.out.printf("%s\n", mensajeFinal);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

/**
 *
 * @author reroes
 */
import java.util.Scanner;
import java.util.Locale;

public class Ejemplo03 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        System.out.println("Ingrese el limite");
        int limite = entrada.nextInt();
        String nombre = "";
        String posicion = "";
        int edad = 0;
        double estatura = 0;
        String acumulador = "Listado de Jugadores";
        for (int i = 1; i <= limite; i++) {
            entrada.nextLine();
            System.out.println("Ingrese el nombre");
            nombre = entrada.nextLine();
            System.out.println("Ingrese la posicion del jugador");
            posicion = entrada.nextLine();
            System.out.println("Ingrese la edad");
            edad = entrada.nextInt();
            System.out.println("Ingrese la estatura del jugador");
            estatura = entrada.nextDouble();
            acumulador = String.format("%s\n%s. %s -%s-, edad %d, estatura %.2f",
                    acumulador,
                    i,
                    nombre,
                    posicion,
                    edad,
                    estatura);
        }
        System.out.println(acumulador);
    }
}

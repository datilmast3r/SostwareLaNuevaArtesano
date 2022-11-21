/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase2;

import java.time.Clock;

/**
 * ejercicio 1
 *
 * @author Gonzalo Salzar Rocha
 * @version 1.0
 */

public class ejercicio1 {

    public ejercicio1() {
    }

    /**
     * Metodo que indica si un número es positivo o negativo
     */
    public void ejecucion() {
        System.out.println("Escribe un programa que introduzca números hasta que el operador pulse 0. Por cada número se debe de\n"
                + "indicar si es positivo, negativo o cero.\n");
        /**
         * variable temporal que almacena el número a evaluar
         */
        int a;
        /**
         * variable booleana que cntrola la salida de la ejecucion
         */
        boolean flag = false;
        do {
            System.out.println("introduzca un numero: ");
            a = Utilidades.pedirNumero();
            if (a != 0) {
                if (a < 0) {
                    System.out.println("el número " + a + " es negativo\n");
                } else {
                    System.out.println("el número " + a + " es positivo\n");
                }
            } else {
                System.out.println("Ha pulsado 0, fin de ejecución\n");
                flag = true;
            }
        } while (flag == false);

    }
}

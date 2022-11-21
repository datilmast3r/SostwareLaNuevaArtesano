package clase2;

import java.util.Scanner;
import javax.swing.*;

/**
 * ejercicios de programacion 2
 * 
 * Clase menu selectora de los diferentes ejercicios
 * 
 * @author Gonzalo Salazar Rocha 
 * @version 1.0
 */
public class Clase2 {

 

    /**
     * seleccion de ejercicios por menú
     *
     */
    public static void main(String[] args) {
        boolean terminar = false;
        int opcion;
        do {
            System.out.println("""
                               EJERCICIOS DE REPETICIONES
                               seleccione el ejercico
                               (1)ejercicio 1
                               (2)ejercicio 2
                               (3)ejercicio 3
                               (4)ejercicio 4
                               (5)ejercicio 5
                               (6)ejercicio 6
                               (7)ejercicio 7
                               (8)ejercicio 8
                               (9)ejercicio 9
                               (10)ejercicio 10
                               (11)ejercicio 11
                               (12)ejercicio 12
                               (13)ejercicio 13
                               (14)ejercicio 14
                               (15)ejercicio 15
                               (16)ejercicio 16
                               (17)ejercicio 17
                               (18)ejercicio 18
                               (0) salir
                               """);
            opcion = Utilidades.pedirNumeroPositivo();
            switch (opcion) {
                case 1 -> {
                    ejercicio1 alfa = new ejercicio1();
                    alfa.ejecucion();
                }
                case 2 -> {
                    ejercicio2 beta = new ejercicio2();
                    beta.ejecucion();
                }
                case 3 -> {
                    ejercicio3 charlie = new ejercicio3();
                    charlie.ejecucion();
                }
                case 4 -> {
                    ejercicio4 delta = new ejercicio4();
                    delta.ejecucion();
                }
                case 5 -> {
                    ejercicio5 echo = new ejercicio5();
                    echo.ejecucion();
                }
                case 6 -> {
                    ejercicio6 foxtrot = new ejercicio6();
                    foxtrot.ejecucion();
                }
                case 7 -> {
                    ejercicio7 golf = new ejercicio7();
                    golf.ejecucion();
                }
                case 8 -> {
                    ejercicio8 hotel = new ejercicio8();
                    hotel.ejecucion();
                }
                case 9 -> {
                    ejercicio9 india = new ejercicio9();
                    india.ejecucion();
                }
                case 10 -> {
                    ejercicio10 juliet = new ejercicio10();
                    juliet.ejecucion();
                }
                case 11 -> {
                    ejercicio11 kilo = new ejercicio11();
                    kilo.ejecucion();
                }
                case 12 -> {
                    ejercicio12 lima = new ejercicio12();
                    lima.ejecucion();
                }
                case 13 -> {
                    ejercicio13 mike = new ejercicio13();
                    mike.ejecucion();
                }
                case 14 -> {
                    ejercicio14 november = new ejercicio14();
                    november.ejecucion();
                }
                case 15 -> {
                    ejercicio15 oscar = new ejercicio15();
                    oscar.ejecucion();
                }
                case 16 -> {
                    ejercicio16 papa = new ejercicio16();
                    papa.ejecucion();
                }
                case 17 -> {
                    ejercicio17 quebec = new ejercicio17();
                    quebec.ejecucion();
                }
                case 18 -> {
                    ejercicio18 romeo = new ejercicio18();
                    romeo.ejecucion();
                }
                case 0 -> {
                    return;
                }
                default -> {
                    System.out.println("NO HAY TANTOS EJERCICIOS");
                }

            }

        } while (terminar == false);
    }

   
}

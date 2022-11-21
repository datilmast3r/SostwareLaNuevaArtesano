/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase2;

import java.util.Scanner;

/**
 * Clase auxiliar con metodos que se emplean en diferentes ejercicios
 * 
 * @author Gonzalo Salazar Rocha 
 * @version 1.0
 */
public class Utilidades {

    public static int pedirNumero() {
        int a;
        Scanner entrada = new Scanner(System.in);

        try {
            a = entrada.nextInt();
        } catch (Exception InputMismatchException) {
            System.out.println("Error en la entrada vuelva a intentarlo");
            a = pedirNumero();
        }
        return a;
    }

    public static int pedirNumeroPositivo() {
        int a;
        do {
            Scanner entrada = new Scanner(System.in);

            try {
                a = entrada.nextInt();
            } catch (Exception InputMismatchException) {
                System.out.println("Error en la entrada vuelva a intentarlo");
                a = pedirNumeroPositivo();
            }
            if (a < 0) {
                System.out.println("SOLO NUMEROS POSITIVOS VUELVA A INTENTARLO\n");
            }
        } while (a < 0);
        return a;
    }

    static float pedirNumeroPositivofloat() {
        float a;
        do {
            Scanner entrada = new Scanner(System.in);

            try {
                a = entrada.nextFloat();
            } catch (Exception InputMismatchException) {
                System.out.println("Error en la entrada vuelva a intentarlo");
                a = pedirNumeroPositivofloat();
            }
            if (a < 0) {
                System.out.println("SOLO NUMEROS POSITIVOS VUELVA A INTENTARLO\n");
            }
        } while (a < 0);
        return a;
    }

    static String solicitarNombre(String mensaje) {
        String x;
        System.out.println(mensaje);
        Scanner a = new Scanner(System.in);
        x = a.nextLine();
        return x;
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase2;

/**
 *ejercicio 9
 * @author Gonzalo Salazar Rocha
 *
 */
class ejercicio9 {

    void ejecucion() {
        int a;
        System.out.println("Realiza un programa para calcular el factorial de un número.");
        System.out.println("Introduzca numero a evaluar");
        a = Utilidades.pedirNumeroPositivo();
        System.out.println("El factorial de " + a + " es " + factorialRecursivo(a));
    }

    private int factorialRecursivo(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorialRecursivo(n - 1);
        }
    }

}

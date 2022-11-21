/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase2;

/**
 *ejercicio 12
 * @author Gonzalo Salazar Rocha
 *
 */
class ejercicio12 {

    void ejecucion() {
        int num1, num2;
        System.out.println("Realiza un programa que introduzca dos números enteros y visualice los números primos que hay entre\n"
                + "ellos");
        System.out.println("ingresar el primer numero");
        num1 = Utilidades.pedirNumeroPositivo();
        System.out.println("ingresar el segundo numero");
        num2 = Utilidades.pedirNumeroPositivo();
        for (int i = num1; i < num2; i++) {
            if (esPrimo(i)) {
                System.out.println(i);
            }
        }

    }

    private boolean esPrimo(int a) {
        if (a == 0 || a == 2 || a == 4) {
            return false;
        } else if (a == 1) {
            return true;
        }
        for (int x = 2; x < a / 2; x++) {
            if (a % x == 0) {
                return false;
            }
        }
        return true;
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase2;

/**
 *ejercicio 10
 * @author Gonzalo Salazar Rocha
 *
 */
class ejercicio10 {

    void ejecucion() {
        int a, b;
        System.out.println("Programa que calcula si dos números introducidos por teclado son amigos.");
        System.out.println("intrduzca primer numero:");
        a = Utilidades.pedirNumeroPositivo();
        System.out.println("introduzca segund numero");
        b = Utilidades.pedirNumeroPositivo();
        if (a == sumaDivisores(b) && b == sumaDivisores(a)) {
            System.out.println(a + " y " + b + " son numeros amigos");
        }
    }

    public static int sumaDivisores(int n) {
        int suma = 0;
        for (int i = 1; i <= (n / 2); i++) {
            if (n % i == 0) {
                suma += i;
            }

        }
        return suma;
    }

}

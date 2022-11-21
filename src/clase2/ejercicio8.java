/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase2;

/**
 *ejercicio 8
 * @author Gonzalo Salazar Rocha
 * En este ejerccio ademas del enunciado solicitado he
 * implementado dos metodos diferentes del algoritmo de euclides uno iterativo y
 * otro recursivo. Además he incorporado contadores de tiempo para poder evaluar
 * la diferencia de velocidad entre los dos metodos.
 */
class ejercicio8 {

    void ejecucion() {
        int a, b;
        System.out.println("Realiza un programa que devuelva el máximo común divisor de dos números utilizando el algoritmo de\n"
                + "Euclides. (mcd(a,b)=mcd(b,a%b))");
        System.out.println("Introduce el primer numero");
        a = Utilidades.pedirNumeroPositivo();
        System.out.println("Introduce el segundo numero");
        b = Utilidades.pedirNumeroPositivo();
        System.out.println("el mcd entre " + a + " y " + b + " es " + mcd(a, b));
    }
// euclides recursivo

    private int mcd(int a, int b) {
        long tiempoInicio = System.nanoTime();
        long tiempoFinal;
        if (b == 0) {
            tiempoFinal = System.nanoTime();
            System.out.println("duracion de ejecucion en nanosegundos: " + (tiempoFinal - tiempoInicio));
            return a;
        } else {
            return mcd(b, a % b);
        }

    }

    // euclides repetitivo
    private int mcdIterativo(int a, int b) {
        long tiempoInicio = System.nanoTime();
        long tiempoFinal;
        // si a es menor que b se invierten los valores
        if (a < b) {
            int tempA = a;
            a = b;
            b = tempA;
        }
        while (b != 0) {
            int tempb = b;
            b = a % b;
            a = tempb;
        }
        tiempoFinal = System.nanoTime();
        System.out.println("duracion de ejecucion en nanosegundos: " + (tiempoFinal - tiempoInicio));
        return a;
    }
}

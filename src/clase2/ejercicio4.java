/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase2;

/**
 *ejercicio 4
 * @author Gonzalo Salazar Rocha
 *
 */
class ejercicio4 {

    void ejecucion() {
        System.out.println("Calcúlese la suma de n números dados por teclado, de manera que los pares lo suma y los impares los\n"
                + "reste. Si el número dado es cero, terminará el programa sacando por pantalla el resultado.");
        boolean zero = true;
        int suma = 0;
        do {
            int temp;
            System.out.println("INTRODUZCA UN NUMERO:");
            temp = Utilidades.pedirNumero();
            
            if (temp != 0) {
                if (temp % 2 == 0) {
                    suma += temp;
                } else {
                    suma -= temp;
                }
            } else {
                System.out.println("el esultado es: " + suma);
                zero = false;
            }
        } while (zero);
    }

}

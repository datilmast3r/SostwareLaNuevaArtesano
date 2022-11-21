/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase2;

/**
 *ejercicio 3
 * @author Gonzalo Salazar Rocha
 *
 */
class ejercicio3 {

    void ejecucion() {
        System.out.println("Escribe un programa que pida diez números. Al finalizar indicará si se ha introducido algún número\n"
                + "negativo\n");
        boolean negativo = false;
        for (int i = 0; i < 10; i++) {
            int temp;
            System.out.println("introduzca un numero: ");
            temp = Utilidades.pedirNumero();
            System.out.println(temp + "\n");
            if (temp < 0) {
                negativo = true;
            }
        }
        if (negativo) {
            System.out.println("NO hay números negativos");
        } else {
            System.out.println("SI hay números negativos");
        }
    }

}

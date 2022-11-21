/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase2;

/**
 *ejercicio 5
 * @author Gonzalo Salazar Rocha
 *
 */
class ejercicio5 {

    void ejecucion() {
        System.out.println("Programa que lea un número y escriba la tabla de cuadrados y cubos de los n primeros números enteros\n" +
"pares");
        int contador = 2, n;
        boolean flag = true;
        do {
            System.out.println("introduzca la cantiad de resultados deseados:");
            n = Utilidades.pedirNumero();
            if(n>0){
                flag = false;
             
            }else{
                System.out.println("ERROR: SOLO NUMEROS POSITIVOS");}
        } while (flag);

        for (int i = 0; i < n; i++, contador +=2) {
            System.out.println(contador + "^2= " + Math.pow(contador, 2) + " | " + contador + "^3= " + Math.pow(contador, 3));
        }

    }

}

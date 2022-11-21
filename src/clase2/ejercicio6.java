/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase2;

/**
 *ejercicio 6
 * @author Gonzalo Salazar Rocha
 *
 */
class ejercicio6 {

    void ejecucion() {
        System.out.println("Realizar un programa que muestre los divisores de un número entero introducido por teclado.");
        int n;
        System.out.println("INTRODUZCA UN NUMERO ENTERO POSITIVO:");
        n=Utilidades.pedirNumeroPositivo();
        System.out.println("los divisores de "+n+" son:");
        for(int i =1;i<=(n/2);i++){
            if(n%i==0){
                System.out.println(i);
            }
        }
        System.out.println(n);
        
    }

}

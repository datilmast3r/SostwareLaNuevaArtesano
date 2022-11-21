/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase2;

/**
 *ejercicio 2
 * @author Gonzalo Salazar Rocha
 *
 */
class ejercicio2 {

    void ejecucion() {
        System.out.println("Escribe un programa que visualice la suma de los 50 primeros números impares.");
        int suma =0;
        for (int i = 1; i <= 100; i+=2) {
            if(i<99){
            System.out.print(i+"+");
            suma += i;}
            else{System.out.print(i);
            suma += i;}
        }
        System.out.println("= "+suma);
       
    }
    
}

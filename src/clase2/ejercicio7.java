/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase2;

import java.awt.BorderLayout;

/**
 *ejercicio 7
 * @author Gonzalo Salazar Rocha
 *
 */
class ejercicio7 {

    void ejecucion() {
        System.out.println("""
                           Escribe un programa que pida un n\u00famero entero positivo y diga si es un n\u00famero Armstrong o no. Un n\u00famero es Armstrong cuando la suma de cada uno de los d\u00edgitos que lo componen elevado al n\u00famero de
                           d\u00edgitos del n\u00famero da como resultado el propio n\u00famero""");
        Integer n;
        String numero;
        int cont, suma = 0;
        // solicito numero
        System.out.println("Introduca numero a evaluar:");
        n = Utilidades.pedirNumero();
       //paso numero a cadena de caracteres para evauar la distancia
        numero = n.toString();
        cont = numero.length();
        //recorro la cadena de caracteres 
        for (char ch: numero.toCharArray()){
            int temp = Integer.valueOf(ch)-48;//el valor del caracter -48 es el digito
            suma += (int)Math.pow(temp,cont); 
        }
        if (suma == n) {
            System.out.println("el numero "+n+" es, numero de Armstrong");
        } else {
            System.out.println("el numero "+n+" NO es, numero de Armstrong");
        }
    }

}




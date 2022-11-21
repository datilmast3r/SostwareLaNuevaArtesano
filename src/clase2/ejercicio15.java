/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase2;

/**
 * ejercicio 15
 *
 * Recloeccion de datos y muestra d einforme por terminal.
 *
 * @author Gonzalo Salazar Rocha
 * @version 1.0
 */
public class ejercicio15 {

    /**
     * Nombre del empleado con la venta maxima
     */
    String vendeMax = "";
    /**
     * Nombre del empleado con la venta minima
     */
    String vendeMin = "";
    /**
     * flag para finalizar la introduccion de datos
     */
    boolean flag = true;
    /**
     * numero total de vendedores
     */
    int contador = 0;
    /**
     * vendedores con menos de 5000€
     */
    int contS = 0;
    /**
     * vendedores entre 5000€ y 10000€
     */
    int contM = 0;
    /**
     * vendedores con mas de 10000€
     */
    int contL = 0;
    /**
     * ventas totales menores de 5000€
     */
    float vS = 0;
    /**
     * valor de la venta temporal
     */
    float ventas;
    /**
     * ventas totales entre 5000€ y 10000€
     */
    float vM = 0;
    /**
     * ventas totales mayores de 10000€
     */
    float vL = 0;
    /**
     * ventas totales
     */
    float vTotal = 0;
    /**
     * venta maxima
     */
    float ventaMax = Float.MIN_VALUE;
    /**
     * venta minima
     */
    float ventaMin = Float.MAX_VALUE;

    /**
     * ejecucin del ejercicio
     *
     */
    void ejecucion() {

        System.out.println("Realiza un programa que introduzca el nombre y el importe de las ventas de los empleados de una\nempresa. Este proceso se debe de repetir hasta que el operador introduzca * como nombre de vendedor.");
        solicitarDatos();
        if (contador != 0) {
            mostrarInforme();
        } else {
            System.out.println("NO SE HAN INTRODUCIDO DATOS");
        }

    }

    /**
     * metodo que solicita losdatos de los trabajadores en bucle
     *
     */
    private void solicitarDatos() {

        /**
         * nombre del vendedor actual
         */
        String temp;
        /**
         * condicion de salida del bucle
         */
        String salida;
        salida = "*";
        do {

            temp = Utilidades.solicitarNombre("Introduzca el nombre del empleado (*) para salir");
            if (temp.equalsIgnoreCase(salida)) {
                flag = false;
            } else {
                contador++;
                System.out.println("INTRODUZCA EL IMPORTE DE VENTAS");
                ventas = Utilidades.pedirNumeroPositivofloat();
                if (ventas < 5000) {
                    vS += ventas;
                    contS++;
                } else if (ventas < 10000) {
                    vM += ventas;
                    contM++;
                } else {
                    vL += ventas;
                    contL++;
                }
                if (ventas < ventaMin) {
                    ventaMin = ventas;
                    vendeMin = temp;
                }
                if (ventas > ventaMax) {
                    ventaMax = ventas;
                    vendeMax = temp;
                }
                vTotal += ventas;

            }

        } while (flag);
    }

    /**
     * metodo que imprime en pantalla el analisis de los datos
     */
    private void mostrarInforme() {

        System.out.println("\nINFORME DE VENTAS\n_________________\n");
        System.out.println("nombre del vendedor con mas ventas: " + vendeMax + "      importe:" + ventaMax + "€");
        System.out.println("nombre del vendedor con menos ventas: " + vendeMin + "      importe:" + ventaMin + "€");
        System.out.println("promedio de ventas: " + (vTotal / contador) + "€\n");
        System.out.println("importe de ventas /  Número de ventas  /  total de ventas /  porcentaje sobre el total");
        System.out.println("menor de 5000€  /" + contS + " / " + vS + "  / " + ((float) (vS / vTotal) * 100));
        System.out.println("entre 5000€ y 10000€  /" + contM + " / " + vM + "  / " + ((float) (vM / vTotal) * 100));
        System.out.println("mas de 10000€  /" + contL + " / " + vL + "  / " + ((float) (vL / vTotal) * 100) + "\n");
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase2;

import java.util.Scanner;

/**
 *ejercicio 14
 * @author Gonzalo Salazar Rocha
 *
 */
class ejercicio14 {

    String poblacionMenor, poblacionMayor;
    int nExtraTotal = 0, poblacionMax = 0, poblacionMin = 0, nPoblaciones = 0, nHabitantes = 0, sHombres = 0, lHombres = 0, xlHombres = 0, sMujeres = 0, lMujeres = 0, xlMujeres = 0, sExtra = 0, lExtra = 0, xlExtra = 0;

    void ejecucion() {

        System.out.println("""
                           hasta que el operador introduzca \u201cFIN\u201d como nombre de poblaci\u00f3n.El INE (Instituto Nacional de Estad\u00edstica) realiza encuestas, indicadores, etc., que se transmiten a nivel
                           internacional como datos oficiales de la poblaci\u00f3n de Espa\u00f1a a todos los efectos. Para ello ha encargado a
                           nuestra empresa que realice un programa que gestione los datos obtenidos.
                           Por lo que el operador debe de introducir por cada poblaci\u00f3n: el nombre, n\u00famero de hombres, n\u00famero
                           de mujeres y n\u00famero de extranjeros que viven en cada una de ellas. Este proceso se debe de repetir
                           """);
        solicitarDatos();
        if (nPoblaciones == 0) {
            System.out.println("no se han introducido datos");
        } else {
            mostrarInforme();
        }
    }

    private void solicitarDatos() {
        String temp, salida = "FIN";
        int tempH = 0, tempM = 0, tempE = 0, tempTotal = 0;

        boolean flag = true;
        do {

            System.out.println("INTRODUCIR NOMBRE DE LA POBLACION (FIN PARA CERRAR):");
            Scanner a = new Scanner(System.in);
            temp = a.nextLine();
            if (temp.equalsIgnoreCase(salida)) {
                flag = false;
            } else {
                System.out.println("INTRODUCIR NUMERO DE HOMBRES:");
                tempH = Utilidades.pedirNumeroPositivo();

                System.out.println("INTRODUCIR NUMERO DE MUJERES:");
                tempM = Utilidades.pedirNumeroPositivo();

                System.out.println("INTRODUCIR NUMERO DE EXTRANJEROS:");
                tempE = Utilidades.pedirNumeroPositivo();
                while (tempE < 0 || tempE > tempM + tempH) {
                    System.out.println("valor no valido vuelva a intentarlo :");
                    tempE = Utilidades.pedirNumeroPositivo();
                }
                tempTotal = tempH + tempM;
                if (tempTotal < 2000) {
                    sHombres += tempH;
                    sMujeres += tempM;
                    sExtra += tempE;
                } else if (tempTotal >= 2000 && tempTotal < 300000) {
                    lHombres += tempH;
                    lMujeres += tempM;
                    lExtra += tempE;
                } else {
                    xlHombres += tempH;
                    xlMujeres += tempM;
                    xlExtra += tempE;
                }
                if (poblacionMin == 0 || tempTotal < poblacionMin) {
                    poblacionMin = tempTotal;
                    poblacionMenor = temp;
                }
                if (poblacionMax == 0 || tempTotal > poblacionMax) {
                    poblacionMax = tempTotal;
                    poblacionMayor = temp;
                }
                nPoblaciones++;
                nHabitantes += tempTotal;
                nExtraTotal += tempE;
            }
        } while (flag);
    }

    private void mostrarInforme() {
        System.out.println("                             INFORME DE POBLACIONES");
        System.out.println("                             nº habitantes    nºhombres   nºmujeres   nºextranjeros");
        System.out.println(" ");
        System.out.println("menos de 2000 habitantes        " + (sHombres + sMujeres) + "            " + sHombres + "    " + sMujeres + "    " + sExtra);
        System.out.println("entre 2000 y 300k habita        " + (lHombres + lMujeres) + "          " + lHombres + "    " + lMujeres + "    " + lExtra);
        System.out.println("mas de 300000 habitantes        " + (xlHombres + xlMujeres) + "             " + xlHombres + "    " + xlMujeres + "    " + xlExtra);
        System.out.println("\nTOTAL POBLACIONES ENCUESTADAS:     " + nPoblaciones);
        System.out.println("POBLACION TOTAL:                   " + nHabitantes);
        System.out.println("Nombre y nº de habitantes de la población con mayor número de habitantes: " + poblacionMayor + "  " + poblacionMax);
        System.out.println("Nombre y nº de habitantes de la población con menor número de habitantes: " + poblacionMenor + "  " + poblacionMin);
        System.out.println("Porcentaje que hay de Extranjeros sobre la población total: " +  (((float)nExtraTotal / (float)nHabitantes) * 100) + "\n");
    }

}

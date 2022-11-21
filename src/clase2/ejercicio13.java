/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase2;

/**
 *ejercicio 13
 * @author Gonzalo Salazar Rocha
 *
 */
class ejercicio13 {

    void ejecucion() {
        float nNotas = 0, aprobado = 0, media = 0;
        float nota, notaTotal = 0;
        System.out.println("Realiza un programa que introduzca las notas de los alumnos de una clase. El proceso de entrada acabará\n"
                + "cuando se introduzca como nota -1. Una vez finalizada la entrada de datos se deberá visualizar la nota\n"
                + "media, así como el porcentaje de aprobados");
        System.out.println("introduzca las notas e los alumnos (salir con -1)");
        do {
            nota = Utilidades.pedirNumeroPositivofloat();
            if (nota != -1 && 0 <= nota && nota <= 10) {
                nNotas++;
                notaTotal += nota;
                if (nota >= 5) {
                    aprobado++;
                }
                System.out.println("siguiente alumno.");
            }else{
                if(nota!=-1)System.out.println("Valor no admitido, intentelo de nuevo:");
            }
        } while (nota != -1);
        if (nNotas == 0) {
            System.out.println("NO SE HAN INTRODUCIDO DATOS");
            nNotas = 1;
        }
        media = (notaTotal / nNotas);

        System.out.println("la cantidad de aprobados es " + ((aprobado / nNotas) * 100) + "%");
        System.out.println("La nota media es " + Math.round(media));
    }

}

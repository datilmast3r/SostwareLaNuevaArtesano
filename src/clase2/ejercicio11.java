
package clase2;

/**
 *ejercicio 11
 * @author Gonzlao Salazar Rocha
 */
class ejercicio11 {

    void ejecucion() {
        System.out.println("Programa que calcule y visualice los números perfectos menores que 1000. Un número es perfecto si la\n"
                + "suma de sus divisores, excepto él mismo, es igual al propio número");
        for (int i = 2; i < 1000; i += 2) {
            if (perfectos(i)) {
                System.out.println(i);
            }
        }
    }

    private boolean perfectos(int a) {
        if (a == ejercicio10.sumaDivisores(a)) {
            return true;
        }
        return false;
    }

}

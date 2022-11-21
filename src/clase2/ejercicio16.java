package clase2;

/**
 * ejercicio16 recoleccion de datos y muestra de informe por teclado
 *
 * @author Gonzalo Salazar Rocha
 * @version 1.0
 */
class ejercicio16 {

    /**
     * número de informáticos
     */
    int nInfor = 0;
    /**
     * sueldo acumulado de todos los informáticos
     */
    float inforSueldo = 0;
    /**
     * número de administradores
     */
    int nAdmin = 0;
    /**
     * sueldo acumulado de los administradores
     */
    float adminSueldo = 0;
    /**
     * número total de empleados
     */
    int nEmpleados;
    /**
     * sueldo total acumulado
     */
    float sueldoTOTAL;
    /**
     * sueldo más elevado
     */
    float sueldoMAX = Float.MIN_VALUE;
    /**
     * nombre del empleado con mayor sueldo
     */
    String empleadoMAX;
    /**
     * departamento del empleado con mayor sueldo
     */
    String deptoMAX;

    /**
     * Metodo principal del flujo de ejecución
     */
    void ejecucion() {
        introducirDatos();
        nEmpleados = nAdmin + nInfor;
        sueldoTOTAL = inforSueldo + adminSueldo;
        if (nEmpleados != 0) {
            informe();
        } else {
            System.out.println("no se han introducido datos");
        }
    }

    /**
     * Método que solicita y almacena los datos introducidos por teclado de los
     * empleados sus departamentos y sueldos
     */
    public void introducirDatos() {

        /**
         * constante para finalizar la introduccion de datos
         */
        final String SALIDA = "FIN";
        /**
         * constante departamento 1
         */
        final String DEPTO1 = "INFORMATICA";
        /**
         * constante departamento 2
         */
        final String DEPTO2 = "ADMINISTRACION";
        /**
         * bandera para control del flujo del programa true: introduce valores
         * false: termina la introduccion de valores
         */
        Boolean flag = true;
        /**
         * variable temporal: nombre del empleado
         */
        String nombre;
        /**
         * variable temporal: nombre del departamento
         */
        String depto;
        /**
         * variable temporal: sueldo del empleado
         */
        float sueldo;

        do {
            depto = Utilidades.solicitarNombre("Introduzca el departamento (\"FIN\" para salir)");
            if (depto.equalsIgnoreCase(SALIDA)) {
                flag = false;
            } else if (depto.equalsIgnoreCase(DEPTO1) || depto.equalsIgnoreCase(DEPTO2)) {
                nombre = Utilidades.solicitarNombre("Introduzca nombre del empleado");
                System.out.println("introduzca el sueldo del empleado");
                sueldo = Utilidades.pedirNumeroPositivofloat();
                if (depto.equalsIgnoreCase(DEPTO1)) {
                    nInfor++;
                    inforSueldo += sueldo;
                } else {
                    nAdmin++;
                    adminSueldo += sueldo;
                }
                if (sueldo > sueldoMAX) {
                    sueldoMAX = sueldo;
                    empleadoMAX = nombre;
                    deptoMAX = depto;
                }
            } else {
                System.out.println("Departamento no aceptado vuelva a intentarlo\n");
            }
        } while (flag == true);

    }

    /**
     * Método encargado de la representacin por pantala de los datos recogidos
     */
    public void informe() {
        System.out.println("INFORME DE DEPARTAMENTOS");
        System.out.println("Nombre y departamento dle empleado con mayor sueldo: " + empleadoMAX + " " + deptoMAX);
        System.out.println("DEPARTAMENTO    Nº empleados    SUELDO MEDIO        PORCENTAJE");
        System.out.println("Informática         " + nInfor + "           " + (inforSueldo / nInfor) + "               " + inforSueldo / sueldoTOTAL * 100);
        System.out.println("Administración      " + nAdmin + "           " + (adminSueldo / nAdmin) + "               " + adminSueldo / sueldoTOTAL * 100);

    }
}

/*
Los profesores del curso de programación de Egg necesitan llevar un registro de las notas
adquiridas por sus 10 alumnos para luego obtener una cantidad de aprobados y
desaprobados. Durante el periodo de cursado cada alumno obtiene 4 notas, 2 por trabajos
prácticos evaluativos y 2 por parciales. Las ponderaciones de cada nota son:

Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%

Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. Al final del
programa los profesores necesitan obtener por pantalla la cantidad de aprobados y
desaprobados, teniendo en cuenta que solo aprueban los alumnos con promedio mayor o
igual al 7 de sus notas del curso.
 */
package javaintroextra;

import java.util.Scanner;

/**
 *
 * @author Invitado
 */
public class Ej21IntroExtra {

    public static void main(String[] args) {

        double vector[] = new double[10];

        for (int i = 0; i < 10; i++) {

            double promedio = llenarNotasyPromedio(i);

            vector[i] = promedio;
        }

        imprimirPromedios(vector);
    }

    public static double llenarNotasyPromedio(int i) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Alumno nº " + i);
        System.out.println("");

        System.out.println("Ingrese la nota del primer trabajo práctico evaluativo");
        double primerPracti = leer.nextDouble();
        primerPracti = primerPracti * 0.1;

        System.out.println("Ingrese la nota del segundo trabajo práctico evaluativo");
        double segundoPracti = leer.nextDouble();
        segundoPracti = segundoPracti * 0.15;

        System.out.println("Ingrese la nota del primer Integrador");
        double primerInteg = leer.nextDouble();
        primerInteg = primerInteg * 0.25;

        System.out.println("Ingrese la nota del segundo Integrador");
        double segundoInteg = leer.nextDouble();
        segundoInteg = segundoInteg * 0.5;

        double promedio = primerPracti + segundoPracti + primerInteg + segundoInteg;

        return promedio;
    }

    public static void imprimirPromedios(double vector[]) {

        System.out.println("Tabla de Promedios:");
        System.out.println("");
        
        for (int i = 0; i < 10; i++) {
            System.out.println("El promedio del alumno " + i + " es " + vector[i]);
        }
    }

}

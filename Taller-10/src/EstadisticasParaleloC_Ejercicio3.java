import java.util.Random;
import java.util.Scanner;
public class EstadisticasParaleloC_Ejercicio3 {
    public static void main(String[] args) {
        String[] nombres = new String[28];
        double[] promedios = new double[28];
        Random random = new Random();
        Scanner tcl = new Scanner(System.in);
        double sumaPromedios = 0, mayorPromedio = -1, menorPromedio = 11;
        int indiceMayor = 0, indiceMenor = 0;
        System.out.println("Ingrese los nombres de los 28 estudiantes:");
        for (int i = 0; i < 28; i++) {
            System.out.print("Nombre del estudiante " + (i + 1) + ": ");
            nombres[i] = tcl.nextLine();
        }
        for (int i = 0; i < 28; i++) {
            double ACD = random.nextInt(11); 
            double APE = random.nextInt(11);
            double AA = random.nextInt(11);
            promedios[i] = (ACD * 0.35) + (APE * 0.35) + (AA * 0.30);
            sumaPromedios += promedios[i];
            if (promedios[i] > mayorPromedio) {
                mayorPromedio = promedios[i];
                indiceMayor = i;
            }
            if (promedios[i] < menorPromedio) {
                menorPromedio = promedios[i];
                indiceMenor = i;
            }
        }
        double promedioCurso = sumaPromedios / 28;
        System.out.println("\nPromedio del curso: " + promedioCurso);
        System.out.println("\nEstudiantes con promedio mayor al promedio del curso:");
        for (int i = 0; i < 28; i++) {
            if (promedios[i] > promedioCurso) {
                System.out.println(nombres[i] + ": " + promedios[i]);
            }
        }
        System.out.println("\nEstudiantes con promedio menor al promedio del curso:");
        for (int i = 0; i < 28; i++) {
            if (promedios[i] < promedioCurso) {
                System.out.println(nombres[i] + ": " + promedios[i]);
            }
        }
        System.out.println("\nEstudiante con el mayor promedio:");
        System.out.println(nombres[indiceMayor] + ": " + mayorPromedio);
        System.out.println("\nEstudiante con el menor promedio:");
        System.out.println(nombres[indiceMenor] + ": " + menorPromedio);
    }
}
/***
 * run:
 * Ingrese los nombres de los 28 estudiantes:
 * Nombre del estudiante 1: q
 * Nombre del estudiante 2: a
 * Nombre del estudiante 3: z
 * Nombre del estudiante 4: w
 * Nombre del estudiante 5: e
 * Nombre del estudiante 6: r
 * Nombre del estudiante 7: t
 * Nombre del estudiante 8: y
 * Nombre del estudiante 9: u
 * Nombre del estudiante 10: i
 * Nombre del estudiante 11: o
 * Nombre del estudiante 12: p
 * Nombre del estudiante 13: s
 * Nombre del estudiante 14: d
 * Nombre del estudiante 15: f
 * Nombre del estudiante 16: g
 * Nombre del estudiante 17: h
 * Nombre del estudiante 18: j
 * Nombre del estudiante 19: k
 * Nombre del estudiante 20: l
 * Nombre del estudiante 21: ñ
 * Nombre del estudiante 22: x
 * Nombre del estudiante 23: c
 * Nombre del estudiante 24: v
 * Nombre del estudiante 25: b
 * Nombre del estudiante 26: n
 * Nombre del estudiante 27: m
 * Nombre del estudiante 28: t
 * 
 * Promedio del curso: 5.048214285714287
 *
 * Estudiantes con promedio mayor al promedio del curso:
 * q: 6.25
 * a: 6.1000000000000005
 * w: 5.449999999999999
 * e: 5.3
 * r: 5.1499999999999995
 * i: 7.0
 * o: 6.949999999999999
 * s: 6.45
 * d: 7.1
 * f: 6.199999999999999
 * h: 6.85
 * j: 6.8999999999999995
 * k: 6.549999999999999
 * l: 5.6499999999999995
 * b: 5.25
 * 
 * Estudiantes con promedio menor al promedio del curso:
 * z: 4.9
 * t: 4.75
 * y: 1.9499999999999997
 * u: 4.85
 * p: 4.049999999999999
 * g: 3.1499999999999995
 * ñ: 4.799999999999999
 * x: 3.8
 * c: 4.65
 * v: 4.3
 * n: 2.35
 * m: 1.75
 * t: 2.9
 *
 * Estudiante con el mayor promedio:
 * d: 7.1
 * 
 * Estudiante con el menor promedio:
 * m: 1.75
 */

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroAlumnos = 3;
        Alumno[] alumnos = new Alumno[numeroAlumnos];

        for (int j = 0; j < alumnos.length; j++) {
            System.out.print("Alumno " + (j + 1) + ":\n" +
                    "Nombre: ");
            String name = scanner.nextLine();

            Alumno obj1 = new Alumno(name);

            for (int i = 0; i < obj1.notas.length; i++) {
                System.out.print("Nota " + (i + 1) + ": ");

                while (true) {
                    String nota1 = scanner.nextLine();
                    if (nota1.matches("\\d+") && Integer.parseInt(nota1) >= 0 && Integer.parseInt(nota1) <= 20) {
                        obj1.ingresarCalificacion(i, Integer.parseInt(nota1));
                        break;
                    } else {
                        System.out.println("Ingresa una nota mayor o igual a 0 y menor o igual a 20");
                    }
                }
            }
            alumnos[j] = obj1;
        }

        // Ordenar los alumnos por promedio
        //Arrays.sort(alumnos, (a1, a2) -> Float.compare(a1.calcularPromedio(), a2.calcularPromedio()));

        // Ordenamiento burbuja por promedio
        for (int i = 0; i < alumnos.length - 1; i++) {
            for (int j = 0; j < alumnos.length - 1 - i; j++) {
                float promedio1 = alumnos[j].calcularPromedio();
                float promedio2 = alumnos[j + 1].calcularPromedio();

                if (promedio1 > promedio2) {
                    // Intercambiar los elementos si están en el orden incorrecto
                    Alumno temp = alumnos[j];
                    alumnos[j] = alumnos[j + 1];
                    alumnos[j + 1] = temp;
                }
            }
        }


        // Mostrar los alumnos y sus promedios
        System.out.println("\nAlumnos y sus promedios:");

        for (int i = 0; i < alumnos.length; i++) {
            Alumno alumno = alumnos[i];
            float promedio = alumno.calcularPromedio();
            System.out.println("Alumno " + alumno.nombre + ", Promedio: " + promedio);
        }

        scanner.close();
    }
}

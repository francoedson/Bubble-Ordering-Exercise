import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Alumno 1:\n" +
                    "Nombre: ");
            String name = scanner.nextLine();

            Alumno obj1 = new Alumno(name);

            for(int i=0;i<=obj1.notas.length-1;i++) {
                System.out.print("Nota "+(i + 1)+": ");
                String nota1 = scanner.nextLine();

                // Validar que la nota 1 sean solo números
                if (!nota1.matches("\\d+")) {
                    System.out.println("La nota debe contener solo números.\n");
                    break;
                }

                if (Integer.parseInt(nota1) <= 20 && Integer.parseInt(nota1) >= 0) {
                    obj1.ingresarCalificacion(i,Integer.parseInt(nota1));
                } else {
                    System.out.println("Ingresa una nota mayor a 20 y menor a 0");
                    break;
                }
            }

            float promedio= obj1.calcularPromedio();


            System.out.println("Alumno "+obj1.nombre+", Promedio: "+promedio);
        }while (true);


    }
}
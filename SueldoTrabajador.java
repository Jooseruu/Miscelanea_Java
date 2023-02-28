import java.util.Scanner;

public class SueldoTrabajador {

  public static void main(String[] args) {
    int horasTrabajadas;
    final double precioHora = 8; // Precio por hora trabajada
    double sueldo;

    Scanner scanner = new Scanner(System.in);
    System.out.print("Introduce el número de horas trabajadas en el mes: ");
    horasTrabajadas = scanner.nextInt();

    sueldo = horasTrabajadas * precioHora; // Calculamos el sueldo multiplicando el número de horas trabajadas por el precio por hora

    System.out.println("El sueldo del trabajador es: " + sueldo + " euros.");
  }

}

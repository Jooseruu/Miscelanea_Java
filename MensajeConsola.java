public class MensajeConsola {

    public static void main(String[] args) {
      String[] letras = {"-H", "-O", "-L", "-A", "-", "-G", "-U", "-A", "-P", "-O"}; // Array con las letras del mensaje
  
      for (int i = 0; i < 10; i++) { // Recorremos las filas
        for (int j = 0; j < 10; j++) { // Recorremos las columnas
          if (j == 4 && i != 4) {
            System.out.print("-"); // Imprimimos un guión en la columna central
          } else {
            System.out.print(letras[j]); // Imprimimos la letra correspondiente
          }
        }
        System.out.println(); // Salto de línea para la siguiente fila
      }
    }
  
  }
  
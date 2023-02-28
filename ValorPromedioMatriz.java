public class ValorPromedioMatriz {

    public static void main(String[] args) {
      int[][] matriz = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}; // Matriz de ejemplo
      int filas = matriz.length; // Número de filas
      int columnas = matriz[0].length; // Número de columnas
      int suma = 0; // Variable para sumar los elementos de la matriz
  
      for (int i = 0; i < filas; i++) {
        for (int j = 0; j < columnas; j++) {
          suma += matriz[i][j]; // Sumamos cada elemento de la matriz
        }
      }
  
      double promedio = (double) suma / (filas * columnas); // Calculamos el promedio
  
      System.out.println("El valor promedio de los elementos de la matriz es: " + promedio);
    }
  
  }
  

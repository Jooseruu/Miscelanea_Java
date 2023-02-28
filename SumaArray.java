public class SumaArray {

    public static void main(String[] args) {
      int[] array = {1, 2, 3, 4, 5}; // Ejemplo de array
  
      int suma = 0; // Inicializamos una variable para la suma
  
      for (int i = 0; i < array.length; i++) {
        suma += array[i]; // Sumamos cada valor del array
      }
  
      System.out.println("La suma de los valores del array es: " + suma);
    }
  
  }
  
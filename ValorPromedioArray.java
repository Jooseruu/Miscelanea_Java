public class ValorPromedioArray {

    public static void main(String[] args) {
      double[] numeros = {1.5, 2.0, 3.5, 4.0, 5.0}; // Array de ejemplo
      double suma = 0; // Variable para almacenar la suma de los elementos del array
  
      for (int i = 0; i < numeros.length; i++) {
        suma += numeros[i]; // Sumamos el valor actual del array a la variable suma
      }
  
      double promedio = suma / numeros.length; // Calculamos el promedio dividiendo la suma entre la cantidad de elementos
  
      System.out.println("El valor promedio de los elementos del array es: " + promedio);
    }
  
  }
  
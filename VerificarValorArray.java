public class VerificarValorArray {

    public static void main(String[] args) {
      int[] numeros = {1, 2, 3, 4, 5}; // Array de ejemplo
      int valorBuscado = 3; // Valor a buscar
      boolean encontrado = false; // Variable para indicar si se ha encontrado el valor buscado
  
      for (int i = 0; i < numeros.length; i++) {
        if (numeros[i] == valorBuscado) { // Comprobamos si el valor actual del array es igual al valor buscado
          encontrado = true; // Marcamos la variable como verdadera
          break; // Salimos del bucle, ya que no es necesario seguir buscando
        }
      }
  
      if (encontrado) {
        System.out.println("El valor " + valorBuscado + " se encuentra en el array.");
      } else {
        System.out.println("El valor " + valorBuscado + " no se encuentra en el array.");
      }
    }
  
  }
  

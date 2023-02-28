import java.util.Scanner;

public class EliminarPalabra {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un texto:");
        String texto = sc.nextLine();

        System.out.println("Introduce la palabra que deseas eliminar:");
        String palabra = sc.nextLine();

        String nuevoTexto = eliminarPalabra(texto, palabra);

        System.out.println("El nuevo texto sin la palabra " + palabra + " es:");
        System.out.println(nuevoTexto);
    }

    public static String eliminarPalabra(String texto, String palabra) {
        // Eliminamos todas las apariciones de la palabra en el texto
        String nuevoTexto = texto.replaceAll("\\b" + palabra + "\\b", "");

        // Eliminamos espacios duplicados en caso de que se hayan generado
        nuevoTexto = nuevoTexto.replaceAll("\\s+", " ").trim();

        return nuevoTexto;
    }

}

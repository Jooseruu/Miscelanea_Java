import java.util.ArrayList;
import java.util.List;

public class Listadearrays {
    public static void main(String[] args) {
        List<String[]> colorsList = new ArrayList<>();

        // Agregamos algunos colores a la lista
        colorsList.add(new String[]{"Rojo", "Verde", "Azul"});
        colorsList.add(new String[]{"Amarillo", "Naranja", "Marrón"});
        colorsList.add(new String[]{"Rosa", "Morado", "Blanco"});

        // Imprimimos la lista de arreglos de colores
        for (String[] colors : colorsList) {
            for (String color : colors) {
                System.out.print(color + " ");
            }
            System.out.println();
        }
    }
}

import java.util.Arrays;

public class ClasificaciónArray {
    public static void main(String[] args) {
        int[] Arraynumerica = { 7, 3, 9, 2, 1 };
        String[] Arraycadena = { "manzana", "aperitivo", "zanahoria", "fabian", "elogio" };
        
        Arrays.sort(Arraynumerica);
        System.out.println("Sorted numeric array: " + Arrays.toString(Arraynumerica));
        
        Arrays.sort(Arraycadena);
        System.out.println("Sorted string array: " + Arrays.toString(Arraycadena));
    }
}


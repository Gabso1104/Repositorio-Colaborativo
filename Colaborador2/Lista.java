import java.util.List;
import java.util.ArrayList;

public class Lista {
    public static void main(String[] args) {
        // Declarar una lista de enteros
        List<Integer> numeros = new ArrayList<>();

        // Agregar elementos a la lista
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        numeros.add(6);
        numeros.add(7);
        // Acceder a elementos de la lista
        int primerElemento = numeros.get(0);
        System.out.println("Primer elemento: " + primerElemento);

        // Recorrer la lista utilizando un bucle for-each
        System.out.println("Elementos de la lista:");
        for (int numero : numeros) {
            System.out.println(numero);
        }

        // Obtener el tamaño de la lista
        int tamanoLista = numeros.size();
        System.out.println("Tamaño de la lista: " + tamanoLista);

        // Vaciar la lista
        numeros.clear();
        System.out.println("Tamaño de la lista después de vaciarla: " + numeros.size());
    }
}
import java.util.Stack;

public class Pila {
    public static void main(String[] args) {
        Stack<String> pila = new Stack<>();

        pila.push("Elemento 1");
        pila.push("Elemento 2");
        pila.push("Elemento 3");
        pila.push("Elemento 4");
        pila.push("Elemento 5");
        pila.push("Elemento 6");
        pila.push("Elemento 7");
        pila.push("Elemento 8");
        pila.push("Elemento 9");

        String elementoCima = pila.peek();
        System.out.println("Elemento en la cima: " + elementoCima);

        int tamañoPila = pila.size();
        System.out.println("Tamaño de la pila: " + tamañoPila);
        
        String elementoEliminado1 = pila.pop();
        System.out.println("Elemento eliminado: " + elementoEliminado1);

        String elementoEliminado = pila.pop();
        System.out.println("Elemento eliminado: " + elementoEliminado);

        String elementoEliminado2 = pila.pop();
        System.out.println("Elemento eliminado: " + elementoEliminado2);

        String elementoEliminado3 = pila.pop();
        System.out.println("Elemento eliminado: " + elementoEliminado3);
        
        String elemento = pila.peek();
        System.out.println("Elemento en la cima: " + elemento);

        int tamanoPila = pila.size();
        System.out.println("Tamaño de la pila: " + tamanoPila);
        
    }
}
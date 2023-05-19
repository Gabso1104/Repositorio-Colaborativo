package Colaborador1;

public class Main {
    public static void main(String[] args) {
        Pila pila = new Pila();

        pila.empujar(1);
        pila.empujar(2);
        pila.empujar(3);
        pila.empujar(4);
        pila.empujar(5);
        pila.empujar(6);
        pila.empujar(7);
        pila.empujar(8);
        pila.empujar(9);
        pila.empujar(10);
        pila.empujar(11);
        pila.empujar(12);
        pila.empujar(13);
        pila.empujar(14);
        pila.empujar(15);
        pila.empujar(16);
        pila.empujar(17);
        pila.empujar(18);
        pila.empujar(19);
        pila.empujar(20);
        
        System.out.println("La cima de la pila es: " + pila.cima());

        System.out.println("Elementos de la pila:");

        while (!pila.estaVacia()) {
            System.out.println(pila.sacar());
        }
    }
}
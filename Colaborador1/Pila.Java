package Colaborador1;

import java.util.EmptyStackException;

class Nodo {
    int valor;
    Nodo siguiente;

    public Nodo(int valor) {
        this.valor = valor;
    }
}

class Pila {
    private Nodo cima;

    public Pila() {
        cima = null;
    }

    public boolean estaVacia() {
        return cima == null;
    }

    public void empujar(int valor) {
        Nodo nuevoNodo = new Nodo(valor);
        nuevoNodo.siguiente = cima;
        cima = nuevoNodo;
    }

    public int sacar() {
        if (estaVacia()) {
            throw new EmptyStackException();
        }

        int valorCima = cima.valor;
        cima = cima.siguiente;
        return valorCima;
    }

    public int cima() {
        if (estaVacia()) {
            throw new EmptyStackException();
        }
        return cima.valor;
    }
}

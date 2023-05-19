#include <iostream>
#include <stack>

using namespace std;
//Ejercicio3: Revertuir el contenido de una pila.
void invertirPila(stack<int>& pila) {
    stack<int> pilaAuxiliar;

    // Transferir elementos de la pila original a la pila auxiliar
    while (!pila.empty()) {
        int elemento = pila.top();
        pila.pop();
        pilaAuxiliar.push(elemento);
    }

    // Transferir elementos de la pila auxiliar de vuelta a la pila original
    while (!pilaAuxiliar.empty()) {
        int elemento = pilaAuxiliar.top();
        pilaAuxiliar.pop();
        pila.push(elemento);
    }
}

int main() {
    stack<int> miPila;

    // Agregar elementos a la pila
    miPila.push(1);
    miPila.push(2);
    miPila.push(3);
    miPila.push(4);
    miPila.push(5);

    cout << "Contenido original de la pila: ";
    stack<int> pilaInvertida; // Variable para almacenar la pila invertida

    while (!miPila.empty()) {
        cout << miPila.top() << " ";
        pilaInvertida.push(miPila.top()); // Almacenar elementos invertidos en la nueva pila
        miPila.pop();
    }
    cout << endl;

    // Invertir la pila
    invertirPila(pilaInvertida);

    cout << "Contenido invertido de la pila: ";
    while (!pilaInvertida.empty()) {
        cout << pilaInvertida.top() << " ";
        pilaInvertida.pop();
    }
    cout << endl;

    return 0;
}
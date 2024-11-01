#include <iostream>
#include <string>
#include <vector>

template<typename T>
void imprimirDato(const T& dato) {
    std::cout << "El dato es: " << dato << std::endl;
}

// Función para imprimir un vector
void imprimirDato(const std::vector<int>& dato) {
    std::cout << "El dato es: ";
    for (const auto& elem : dato) {
        std::cout << elem << " ";
    }
    std::cout << std::endl;
}

int main() {
    imprimirDato(123);
    imprimirDato("Hello, World!");

    std::vector<int> lista = {1, 2, 3};
    imprimirDato(lista);

    return 0;
}
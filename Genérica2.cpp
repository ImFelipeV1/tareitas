#include <iostream>
#include <string>
#include <vector>

template<typename T>
T retornarValor(const T& valor) {
    return valor;
}

int main() {
    std::cout << retornarValor(123) << std::endl;

    std::cout << retornarValor(std::string("Para entender la historia de FNAF")) << std::endl;

    std::vector<int> lista = {1, 2, 3};
    std::cout << "Valores en la lista: ";
    for (const auto& elem : lista) {
        std::cout << retornarValor(elem) << " ";
    }
    std::cout << std::endl;

    return 0;
}

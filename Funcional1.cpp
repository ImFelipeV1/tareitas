#include <iostream>
#include <string>

int main() 
{
    std::string nombre = "Darwin Cardozo"; // Agrega el punto y coma al final
    std::string mensaje = "Hola, mi nombre es " + nombre; // Usa + para concatenar

    std::cout << mensaje << std::endl; // Imprime el mensaje
    return 0;
}
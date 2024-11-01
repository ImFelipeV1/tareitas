#include <iostream>
#include <string>

int main()
{
    int edad = 15;
    std::string mensaje = "Mi edad es " + std::to_string(edad);
    std::cout << mensaje << std::endl;
    return 0;
}

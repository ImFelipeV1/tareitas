#include <iostream>
#include <string>

class Perro {
public:
    Perro(std::string nombre, std::string raza) : nombre(nombre), raza(raza) {}

    std::string getNombre() const {
        return nombre;
    }

    std::string getRaza() const {
        return raza;
    }

    void mostrarInfo() const {
        std::cout << "Nombre: " << nombre << ", Raza: " << raza << std::endl;
    }
    
    void ladrar() const {
        std::cout << nombre << " está ladrando" << std::endl;
    }

    void comer() const {
        std::cout << nombre << " está comiendo" << std::endl;
    }

private:
    std::string nombre;
    std::string raza;
};

int main() {
    Perro frika("Frika", "Pincher");
    frika.mostrarInfo();
    frika.ladrar();
    frika.comer();

    return 0;
}
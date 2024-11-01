#include <iostream>
#include <string>
#include <unordered_map>
#include <functional>
#include <vector>

class User {
public:
    User(const std::string& nombre, bool autenticado, const std::string& rol)
        : nombre(nombre), autenticado(autenticado), rol(rol) {}

    std::string getNombre() const {
        return nombre;
    }

    bool isAutenticado() const {
        return autenticado;
    }

    std::string getRol() const {
        return rol;
    }

private:
    std::string nombre;
    bool autenticado;
    std::string rol;
};

class Autorization {
public:
    static std::function<void(const User&)> requiereAutorizacion(const std::vector<std::string>& rolesPermitidos) {
        return [rolesPermitidos](const User& usuario) {
            if (!usuario.isAutenticado()) {
                std::cout << "Usuario " << usuario.getNombre() << " no está autenticado." << std::endl;
                return;
            }

            if (std::find(rolesPermitidos.begin(), rolesPermitidos.end(), usuario.getRol()) == rolesPermitidos.end()) {
                std::cout << "Usuario " << usuario.getNombre() << " no tiene permiso para acceder a esta función." << std::endl;
                return;
            }

            verDatosConfidenciales(usuario);
        };
    }

    static void verDatosConfidenciales(const User& usuario) {
        std::cout << "Acceso concedido a " << usuario.getNombre() << " para ver datos confidenciales." << std::endl;
    }
};

int main() {
    User usuarioAdmin("Carlos", true, "admin");
    User usuarioEmpleado("Luis", true, "empleado");
    User usuarioNoAutenticado("Ana", false, "supervisor");

    auto verDatosConfidencialesConAutorizacion = Autorization::requiereAutorizacion({"admin", "supervisor"});

    verDatosConfidencialesConAutorizacion(usuarioAdmin);
    verDatosConfidencialesConAutorizacion(usuarioEmpleado);
    verDatosConfidencialesConAutorizacion(usuarioNoAutenticado);

    return 0;
}

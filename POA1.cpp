#include <iostream>
#include <string>
#include <functional>

class UserManager {
public:
    template<typename Func, typename... Args>
    void loggerDecorator(Func func, Args... args) {
        std::cout << "Llamando a la función " << func.get_name() << " con los argumentos: ";
        printArgs(args...);
        std::cout << std::endl;

        std::string result = func(args...);
        std::cout << "Resultado de " << func.get_name() << ": " << result << std::endl;
    }

    std::string createUser(const std::string& username) {
        return "Usuario " + username + " creado con éxito.";
    }

    std::string deleteUser(const std::string& username) {
        return "Usuario " + username + " eliminado con éxito.";
    }

private:
    template<typename T>
    void printArgs(const T& arg) {
        std::cout << arg;
    }

    template<typename T, typename... Args>
    void printArgs(const T& firstArg, const Args&... args) {
        std::cout << firstArg << " ";
        printArgs(args...);
    }
};

class FunctionWrapper {
public:
    FunctionWrapper(const std::function<std::string(UserManager&, const std::string&)>& func, const std::string& name)
        : func(func), name(name) {}

    std::string operator()(UserManager& um, const std::string& arg) {
        return func(um, arg);
    }

    std::string get_name() const {
        return name;
    }

private:
    std::function<std::string(UserManager&, const std::string&)> func;
    std::string name;
};

int main() {
    UserManager userManager;

    FunctionWrapper createUserFunc([&](UserManager& um, const std::string& username) {
        return um.createUser(username);
    }, "createUser");

    FunctionWrapper deleteUserFunc([&](UserManager& um, const std::string& username) {
        return um.deleteUser(username);
    }, "deleteUser");

    userManager.loggerDecorator(createUserFunc, "SuCucha");
    userManager.loggerDecorator(deleteUserFunc, "ImFelipeCaml");

    return 0;
}

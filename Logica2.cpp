#include <iostream>
#include <string>
#include <map>

std::map<std::string, std::string> hermanos = {
    {"Carlos", "Luis"}
};

std::map<std::string, std::string> hijos = {
    {"Carlos", "Jose"},
    {"Luis", "Ana"}
};

bool son_hermanos(const std::string& hermano1, const std::string& hermano2) {
    return hermanos[hermano1] == hermano2;
}

bool es_hijo(const std::string& padre, const std::string& hijo) {
    return hijos[padre] == hijo;
}

int main() {
    bool resultado1 = son_hermanos("Carlos", "Luis");
    bool resultado2 = es_hijo("Carlos", "Jose");

    if (resultado1 && resultado2) {
        std::cout << "Luis es tío de Jose" << std::endl;
    } else {
        std::cout << "Luis NO es tío de Jose" << std::endl;
    }

    return 0;
}

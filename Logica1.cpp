std::map<std::string, std::string> relaciones = {
    {"Orlando", "Rafael"},
    {"Rafael", "Felipe"}
};

bool es_padre(const std::string& padre, const std::string& hijo) {
    return relaciones.count(padre) && relaciones[padre] == hijo;
}

bool es_abuelo(const std::string& abuelo, const std::string& nieto) {
    for (const auto& [padre, hijo] : relaciones) {
        if (es_padre(abuelo, padre) && es_padre(padre, nieto)) {
            return true;
        }
    }
    return false;
}

int main() {
    std::string abuelo = "Orlando";
    std::string nieto = "Felipe";

    if (es_abuelo(abuelo, nieto)) {
        std::cout << abuelo << " es abuelo de " << nieto << std::endl;
    } else {
        std::cout << abuelo << " no es abuelo de " << nieto << std::endl;
    }

    return 0;
}
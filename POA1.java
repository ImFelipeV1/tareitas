// Interfaz que define las operaciones de UserManager
// Interfaz que define las operaciones de UserManager
interface IUserManager {
    String createUser(String username);
    String deleteUser(String username);
}

// Implementación base de UserManager
class UserManager implements IUserManager {
    @Override
    public String createUser(String username) {
        return "Usuario " + username + " creado con éxito.";
    }

    @Override
    public String deleteUser(String username) {
        return "Usuario " + username + " eliminado con éxito.";
    }
}

// Decorador para añadir logging
class UserManagerLogger implements IUserManager {
    private IUserManager userManager; // referencia al objeto que se va a decorar

    public UserManagerLogger(IUserManager userManager) {
        this.userManager = userManager;
    }

    @Override
    public String createUser(String username) {
        System.out.println("Llamando a la función createUser con los argumentos: " + username);
        String result = userManager.createUser(username);
        System.out.println("Resultado de createUser: " + result);
        return result;
    }

    @Override
    public String deleteUser(String username) {
        System.out.println("Llamando a la función deleteUser con los argumentos: " + username);
        String result = userManager.deleteUser(username);
        System.out.println("Resultado de deleteUser: " + result);
        return result;
    }
}

// Clase principal para ejecutar el código
public class POA1 {
    public static void main(String[] args) {
        // Creamos la instancia de UserManager y la decoramos con UserManagerLogger
        IUserManager userManager = new UserManagerLogger(new UserManager());

        // Llamamos a los métodos
        userManager.createUser("ImFelipev2");
        userManager.deleteUser("ImFelipeCaml");
    }
}

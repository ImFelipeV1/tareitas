public class Funcional1 {
    public static String func(String nombre) {
        return "Mi nombre es " + nombre; // Concatenación de cadenas
    }

    public static void main(String[] args) {
        String mensaje = func("Darwin Cardozo");

        System.out.println(mensaje);
    }
}

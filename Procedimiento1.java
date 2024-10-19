public class Procedimiento1 {
    // Método para saludar
    public static void saludar(String nombre) {
        System.out.println("Hola, " + nombre);
    }

    // Método para sumar
    public static int sumar(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        String nombreUsuario = "Darwin Cardozo";
        
        saludar(nombreUsuario);

        int resultado = sumar(5, 3);

        System.out.println("El resultado de Darwin Cardozo es " + resultado);
    }
}

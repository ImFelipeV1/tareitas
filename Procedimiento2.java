public class Procedimiento2 {

    public static void saludar(int año) {
        System.out.println("Naciste en el año " + año);
    }

    public static int Multiplicar(int a, int b) {
        return a * b;
    }

    public static void mostrarResultado(int añonac, int añoact) {
        int resultado = Multiplicar((añoact - añonac), 365);
        System.out.println("Han pasado aproximadamente " + resultado + " días desde que naciste.");
    }

    public static void main(String[] args) {
        int añonac = 2009;
        int añoact = 2024;
        
        saludar(añonac);
        mostrarResultado(añonac, añoact);
    }
}
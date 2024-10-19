class Tres<T> {
    private T primero;
    private T segundo;
    private T tercero;

    public Tres(T primero, T segundo, T tercero) {
        this.primero = primero;
        this.segundo = segundo;
        this.tercero = tercero;
    }

    public T getPrimero() {
        return primero;
    }

    public T getSegundo() {
        return segundo;
    }

    public T getTercero() {
        return tercero;
    }
}

public class Genérica1 {
    public static void main(String[] args) {
        Tres<Integer> parEnteros = new Tres<>(1, 2, 3);
        System.out.println("Primero: " + parEnteros.getPrimero() + ", Segundo: " + parEnteros.getSegundo());

        Tres<String> parCadenas = new Tres<>("Hola", "Mundo", ":)");
        System.out.println("Primero: " + parCadenas.getPrimero() + ", Segundo: " + parCadenas.getSegundo());
    }
}
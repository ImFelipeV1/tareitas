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

public class Genérica2 {
    public static void main(String[] args) {
        Tres<Integer> parEnteros = new Tres<>(1, 2, 3);
        System.out.println("Primero: " + parEnteros.getPrimero() + ", Segundo: " + parEnteros.getSegundo() + "Tercero: " + parEnteros.getTercero());

        Tres<String> parCadenas = new Tres<>("Para entender ", "la historia de ", "FNAF");
        System.out.println("Primero: " + parCadenas.getPrimero() + ", Segundo: " + parCadenas.getSegundo() + "Tercero: " + parCadenas.getTercero());
    }
}
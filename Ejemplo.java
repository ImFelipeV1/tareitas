public class Ejemplo {  // El nombre de la clase coincide con el nombre del archivo POO1.java
    public static void main(String[] args) {
        Ejemplo persona = new Ejemplo("Felipe", 15);  // Crear una instancia de la clase POO1
        persona.saludar();  // Llamar al método saludar para imprimir el mensaje
    }

    // Atributos
    private String nombre;
    private int Edad;

    // Constructor
    public Ejemplo(String nombre, int edad) {
        this.nombre = nombre;
        this.Edad = edad;
    }

    // Método para saludar
    public void saludar() {
        System.out.println("Hola, soy " + nombre + " y tengo " + Edad + " años.");
    }
}
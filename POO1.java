public class POO1 {

    public static void main(String[] args) {
        POO1 Perro= new POO1("Frika", "Pincher");
        Perro.comer();
        Perro.ladrar();
        Perro.MostrarRaza(); 
    }
    
    private String nombre;
    private String raza;

    public POO1(String perro, String raza) {
        this.nombre = perro;
        this.raza = raza;
    }

    public void comer() {
        System.out.println(nombre + " Está comiendo.");
    }

    public void ladrar() {
        System.out.println(nombre + " Está ladrando.");
    }

    public void MostrarRaza() {
        System.out.println(nombre + " Es de raza " + raza);
    }
}

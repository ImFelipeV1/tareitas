import java.util.Arrays;
import java.util.List;

class Usuario {
    String nombre;
    boolean autenticado;
    String rol;

    public Usuario(String nombre, boolean autenticado, String rol) {
        this.nombre = nombre;
        this.autenticado = autenticado;
        this.rol = rol;
    }
}

interface AccionConfidencial {
    void ejecutar(Usuario usuario);
}

class RequiereAutorizacion implements AccionConfidencial {
    private List<String> rolesPermitidos;
    private AccionConfidencial accion;

    public RequiereAutorizacion(List<String> rolesPermitidos, AccionConfidencial accion) {
        this.rolesPermitidos = rolesPermitidos;
        this.accion = accion;
    }

    @Override
    public void ejecutar(Usuario usuario) {
        if (!usuario.autenticado) {
            System.out.println("Usuario " + usuario.nombre + " no está autenticado.");
            return;
        }

        if (!rolesPermitidos.contains(usuario.rol)) {
            System.out.println("Usuario " + usuario.nombre + " no tiene permiso para acceder a esta función.");
            return;
        }

        accion.ejecutar(usuario); 
    }
}

class VerDatosConfidenciales implements AccionConfidencial {
    @Override
    public void ejecutar(Usuario usuario) {
        System.out.println("Acceso concedido a " + usuario.nombre + " para ver datos confidenciales.");
    }
}

public class POA2 {
    public static void main(String[] args) {
        Usuario usuarioAdmin = new Usuario("Carlos", true, "admin");
        Usuario usuarioEmpleado = new Usuario("Luis", true, "empleado");
        Usuario usuarioNoAutenticado = new Usuario("Ana", false, "supervisor");

        AccionConfidencial verDatos = new RequiereAutorizacion(
            Arrays.asList("admin", "supervisor"),
            new VerDatosConfidenciales()
        );

        verDatos.ejecutar(usuarioAdmin);
        verDatos.ejecutar(usuarioEmpleado);
        verDatos.ejecutar(usuarioNoAutenticado);
    }
}

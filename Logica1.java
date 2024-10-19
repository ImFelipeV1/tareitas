import java.util.HashMap;
import java.util.Map;

public class Logica1 {
    public static void main(String[] args) {
        Map<String, String> relaciones = new HashMap<>();
        relaciones.put("Orlando", "Rafael");
        relaciones.put("Rafael", "Felipe");

        boolean resultado = esAbuelo("Orlando", "Felipe", relaciones);
        String abuelo = "Orlando";
        String nieto = "Felipe";

        if (resultado) {
            System.out.println(abuelo + " es abuelo de " + nieto);
        } else {
            System.out.println(abuelo + " no es abuelo de " + nieto);
        }
    }

    public static boolean esPadre(String padre, String hijo, Map<String, String> relaciones) {
        return relaciones.get(padre) != null && relaciones.get(padre).equals(hijo);
    }

    public static boolean esAbuelo(String abuelo, String nieto, Map<String, String> relaciones) {
        for (Map.Entry<String, String> entry : relaciones.entrySet()) {
            if (esPadre(abuelo, entry.getKey(), relaciones) && esPadre(entry.getKey(), nieto, relaciones)) {
                return true;
            }
        }
        return false;
    }
}
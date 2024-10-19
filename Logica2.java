    import java.util.HashMap;
    import java.util.Map;
    
    public class Logica2 {
        public static void main(String[] args) {
            Map<String, String> hermanos = new HashMap<>();
            hermanos.put("Carlos", "Luis");
    
            Map<String, String> hijos = new HashMap<>();
            hijos.put("Carlos", "José");
            hijos.put("Luis", "Ana");
    
            boolean resultado = esTio("Luis", "José", hermanos, hijos);
            String tio = "Luis";
            String sobrino = "José";
    
            if (resultado) {
                System.out.println(tio + " es tio de " + sobrino);
            } else {
                System.out.println(tio + " no es tio de " + sobrino);
            }
        }
    
        // Check if 'tio' is an uncle of 'sobrino' using 'hermanos' and 'hijos' maps
        public static boolean esTio(String tio, String sobrino, Map<String, String> hermanos, Map<String, String> hijos) {
            // Check if 'tio' has a sibling and if that sibling has 'sobrino' as a child
            for (Map.Entry<String, String> entry : hermanos.entrySet()) {
                if (entry.getValue().equals(tio) && hijos.containsKey(entry.getKey()) && hijos.get(entry.getKey()).equals(sobrino)) {
                    return true;
                }
            }
            return false;
        }
    }
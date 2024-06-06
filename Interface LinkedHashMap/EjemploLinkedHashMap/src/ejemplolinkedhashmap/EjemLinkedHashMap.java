import java.util.LinkedHashMap;
import java.util.Map;

public class EjemLinkedHashMap {
    public static void main(String[] args) {
      
        Map<String, Integer> mapa = new LinkedHashMap<>();
        
        mapa.put("A", 1);
        mapa.put("B", 2);
        mapa.put("C", 3);
        mapa.put("D", 4);
        
        System.out.println("Elementos del mapa en el orden de inserción:");
        for (Map.Entry<String, Integer> entry : mapa.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        
        mapa.remove("B");
      
        System.out.println("\nElementos del mapa después de eliminar la clave 'B':");
        for (Map.Entry<String, Integer> entry : mapa.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

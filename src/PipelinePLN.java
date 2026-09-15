import java.util.Scanner;
import java.util.ArrayList;

public class PipelinePLN {

    public static String normalizar(String texto) 
    
    {
    
    String limpio = texto.toLowerCase();
    limpio = limpio.replaceAll("[.,;:!?¿¡\"0123456789]", "");
    return limpio;

    }

    public static String[] tokenizar(String textoLimpio) 
    {
    
        return textoLimpio.split(" ");
    
    }

    public static ArrayList<String> filtrarStopWords(String[] tokens) 
    
    {
    
        ArrayList<String> filtrados = new ArrayList<>();
        for (String palabra : tokens) 
            
            {
            
                if (!palabra.equals("el") && !palabra.equals("la") && !palabra.equals("de") &&
                !palabra.equals("en") && !palabra.equals("y") && !palabra.equals("a") &&
                !palabra.equals("es") && !palabra.isEmpty()) 
                
                {
                
                filtrados.add(palabra);
            
            }
        
        }
        
        return filtrados;
    
    }

    public static void contarFrecuencias(ArrayList<String> tokensFiltrados) 
    
    {
    
        ArrayList<String> vocabulario = new ArrayList<>();
        ArrayList<Integer> frecuencias = new ArrayList<>();

        for (String palabra : tokensFiltrados) 
            
            {
            
            if (vocabulario.contains(palabra)) 
                
                {
                
                int pos = vocabulario.indexOf(palabra);
                frecuencias.set(pos, frecuencias.get(pos) + 1);
            } 
            
            else 
                
            {
              
                vocabulario.add(palabra);
                frecuencias.add(1);
            
            }
        
        }

        System.out.println("Bolsa de Palabras (Frecuencias):");
        for (int i = 0; i < vocabulario.size(); i++) {
        
            System.out.println(vocabulario.get(i) + ": " + frecuencias.get(i));
        
        }
    }

    public static void main(String[] args) 
    
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una frase o reseña:");
        String textoOriginal = scanner.nextLine();

        String textoLimpio = normalizar(textoOriginal);
        String[] tokens = tokenizar(textoLimpio);
        ArrayList<String> tokensFiltrados = filtrarStopWords(tokens);

        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Texto Original: " + textoOriginal);
        System.out.println("Tokens filtrados: " + tokensFiltrados);
        contarFrecuencias(tokensFiltrados);
    }
}
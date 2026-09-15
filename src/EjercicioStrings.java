public class EjercicioStrings {
    public static void main(String[] args) {
        String cadena1 = "Esta es la primera cadena de prueba";
        String cadena2 = "Esta es la segunda cadena de prueba";

        System.out.println("Cadena 1: " + cadena1);
        System.out.println("Cadena 2: " + cadena2);

        System.out.println("Caracter en posicion 6 de Cadena 1: " + cadena1.charAt(6));

        System.out.println("Longitud Cadena 1: " + cadena1.length());
        System.out.println("Longitud Cadena 2: " + cadena2.length());

        System.out.println("Primera 'e' en Cadena 1: " + cadena1.indexOf('e'));
        System.out.println("Ultima 'e' en Cadena 2: " + cadena2.lastIndexOf('e'));

        System.out.println("Cadena 1 en mayusculas: " + cadena1.toUpperCase());
        System.out.println("Cadena 2 en minusculas: " + cadena2.toLowerCase());

        System.out.println("¿Son iguales?: " + cadena1.equals(cadena2));
        System.out.println("¿Son iguales ignorando mayusculas?: " + cadena1.equalsIgnoreCase(cadena2));

        System.out.println("Concatenacion: " + cadena1.concat(" ").concat(cadena2));

        System.out.println("¿Contiene 'esta'?: " + cadena1.contains("esta"));

        System.out.println("Subcadena (0 a 6): " + cadena1.substring(0, 6));

        System.out.println("Reemplazar 'a' por 'i': " + cadena1.replace('a', 'i'));
    }
}


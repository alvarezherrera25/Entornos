import java.util.Scanner;

public class ClasificadorTryCatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int edad = -1; // Inicializamos con -1 para que entre al bucle

        System.out.println("--- Clasificador de Edad (Con Try-Catch) ---");

        do {
            System.out.print("Introduce una edad (0 para salir): ");
            
            // 1. Leemos la entrada como TEXTO (String)
            String textoUsuario = scanner.next();

            try {
                // 2. Intentamos convertir ese texto a número
                edad = Integer.parseInt(textoUsuario);

                // --- Si la conversión funciona, se ejecuta tu lógica: ---
                if (edad == 0) {
                    System.out.println("Saliendo...");
                } else if (edad < 0) {
                    System.out.println(">> Error: La edad no puede ser negativa.");
                } else if (edad <= 12) {
                    System.out.println("Es un niño");
                } else if (edad <= 18) {
                    System.out.println("Es un adolescente");
                } else if (edad < 65) {
                    System.out.println("Es un adulto");
                } else {
                    System.out.println("Es un jubilado");
                }

            } catch (NumberFormatException e) {
                // 3. Si pusieron letras, JAVA lanza un error y cae aquí inmediatamente
                System.out.println(">> Error: '" + textoUsuario + "' contiene letras o símbolos.");
                
                // Aseguramos que edad sea diferente de 0 para que el bucle no termine por error
                edad = -1; 
            }
            
            System.out.println("-------------------------------");

        } while (edad != 0);

        scanner.close();
    }
}
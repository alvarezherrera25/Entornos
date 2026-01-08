import java.util.Scanner;

public class ClasificadorTryCatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int edad = -1; 

        System.out.println("--- Clasificador de Edad (Con Try-Catch) ---");

        do {
            System.out.print("Introduce una edad (0 para salir): ");
            
            String textoUsuario = scanner.next();

            try {
                edad = Integer.parseInt(textoUsuario);

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
                System.out.println(">> Error: '" + textoUsuario + "' contiene letras o símbolos.");
                
                edad = -1; 
            }
            
            System.out.println("FELIZ 2026");

        } while (edad != 0);

    }
}
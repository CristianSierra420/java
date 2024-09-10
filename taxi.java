import java.util.Scanner;
public class taxi {
    public static void main(String[] args) {
        System.out.println("¡Hola, mundo!");

        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese la distancia del viaje en kilómetros
        System.out.print("Ingrese la distancia del viaje en kilómetros: ");
        double distancia = scanner.nextDouble();

        // Solicitar al usuario que ingrese el tiempo de espera en tráfico en minutos
        System.out.print("Ingrese el tiempo de espera en tráfico (en minutos): ");
        double tiempoEspera = scanner.nextDouble();

        
        scanner.close();

        //  tarifas
        double tarifaBase = 4000;          
        double valorKilometro = 900;        
        double valorMinuto = 150;          

        //  precio del viaje
        double precioPorDistancia = distancia * valorKilometro;
        double precioPorEspera = tiempoEspera * valorMinuto;
        double precioTotal = tarifaBase + precioPorDistancia + precioPorEspera;

        // resultado
        System.out.println("Precio del viaje: $" + String.format("%.2f", precioTotal));
















    }
}
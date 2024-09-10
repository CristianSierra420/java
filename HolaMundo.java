import java.util.Scanner;

public class HolaMundo {
    public static void main(String[] args) {
        System.out.println("¡Hola, mundo!");

        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese la cantidad de la compra
        System.out.print("Ingrese la cantidad total de la compra (en pesos): ");
        double cantidadCompra = scanner.nextDouble();

        scanner.close();

        // Calcular los puntos acumulados
        int puntos = (int) (cantidadCompra / 10); // 1 punto por cada 10 pesos

        
        String nivelFidelizacion;
        String ofertaAdicional = "";

        if (puntos <= 100) {
            nivelFidelizacion = "Bronce";
            // Ofertas para el nivel Bronce
            ofertaAdicional = "¡Gracias por tu compra! No tienes ofertas adicionales en este nivel.";
        } else if (puntos <= 500) {
            nivelFidelizacion = "Plata";
            // Ofertas para el nivel Plata
            ofertaAdicional = "¡Felicidades! Obtienes un 5% de descuento en tu próxima compra.";
        } else if (puntos <= 1000) {
            nivelFidelizacion = "Oro";
            // Ofertas para el nivel Oro
            ofertaAdicional = "¡Excelente! Obtienes un 10% de descuento y un regalo especial en tu próxima compra.";
        } else {
            nivelFidelizacion = "Platino";
            // Ofertas para el nivel Platino
            ofertaAdicional = "¡Eres un cliente Platino! Obtienes un 15% de descuento, un regalo especial y acceso anticipado a nuevas ofertas.";
        }

        // resultados
        System.out.println("Cantidad de puntos acumulados: " + puntos);
        System.out.println("Nivel de fidelización: " + nivelFidelizacion);
        System.out.println("Oferta adicional: " + ofertaAdicional);












    }
}
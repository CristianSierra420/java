public class mensaje {
    public static void main(String[] args) {
        System.out.println("¡Hola, mundo!");

        String mensajeCodificado = "   H0l4 Bi3nv3nid0s 4 5i 5und0 d3 5il 54r4vill4s  ";

        // Reemplazar números por letras
        String mensajeDecodificado = mensajeCodificado
            .replace("0", "o")  
            .replace("3", "e")  
            .replace("4", "a")
            .replace("5", "m");

        
        mensajeDecodificado = mensajeDecodificado
            .trim()                          
            .replaceAll("\\s+", " ");        

        
        mensajeDecodificado = mensajeDecodificado.toUpperCase();

        
        System.out.println("Mensaje decodificado: " + mensajeDecodificado);





    }
}
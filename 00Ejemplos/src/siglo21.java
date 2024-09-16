public class siglo21 {

    public static void main(String[] args) {
        // Llamar a espereUnSegundo para probar
        espereUnSegundo();
    }

    public static void espereUnSegundo() {
        long ahora = System.currentTimeMillis();
        long despueso = ahora + 5000; // Un segundo son 1000 milisegundos
        while (System.currentTimeMillis() < despueso) {
            // No hacemos nada, solo esperamos
        }
        System.out.println("Ya pasó un segundo");
    }
}


public class Main {
    public static void main(String[] args) {
        Juana juana = new Juana();

        // Comportarse como Humano
        Polimorfismo humanoSimulacion = juana;
        System.out.println(new String(humanoSimulacion.accion()));

        // Comportarse como Perro
        Perro perroSimulacion = new Perro("Labrador");
        System.out.println(new String(perroSimulacion.accion()));

        // Comportarse como Puerco
        Puerco puercoSimulacion = new Puerco(80.5f);
        System.out.println(new String(puercoSimulacion.accion()));
    }
}
public class Humano extends Polimorfismo {
    private String nacionalidad;

    public Humano(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    @Override
    public byte[] accion() {
        return ("Hablar como Humano de nacionalidad: " + nacionalidad).getBytes();
    }
}
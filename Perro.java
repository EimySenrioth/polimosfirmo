public class Perro extends Polimorfismo {
    private String raza;

    public Perro(String raza) {
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    @Override
    public byte[] accion() {
        return "Ladrar como Perro".getBytes();
    }
}
public class Puerco extends Polimorfismo {
    private float kilos;

    public Puerco(float kilos) {
        this.kilos = kilos;
    }

    public float getKilos() {
        return kilos;
    }

    @Override
    public byte[] accion() {
        return "Grunir como Puerco".getBytes();
    }
}
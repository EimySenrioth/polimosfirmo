public class Polimorfismo extends SuperClase {
    protected String ascendiente;

    @Override
    public byte[] accion() {
        return "Acción polimórfica".getBytes();
    }
}
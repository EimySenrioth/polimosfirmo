public class Juana extends Humano {
    public Juana() {
        super("Mexicana");
        // this.nacionalidad = "Mexicana"; // Ya no es necesario porque se pasa al constructor padre
        this.tamano = 1.65f;
        this.peso = 60.0f;
        this.genero = "Femenino";
        this.ascendiente = "Humano";
    }

    @Override
    public byte[] accion() {
        return "Actuar como Juana, una Humano especial".getBytes();
    }
}

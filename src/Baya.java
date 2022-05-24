public class Baya extends Objeto{
    // Efecto
    // Duracion
    private String efecto;
    private int duracion;

    public String getEfecto() {
        return efecto;
    }

    public void setEfecto(String efecto) {
        this.efecto = efecto;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public Baya(double costo, int cantidad, String nombre, String tipo, String efecto, int duracion) {
        super(costo, cantidad, nombre, tipo);
        this.efecto = efecto;
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Baya{" +
                "efecto='" + efecto + '\'' +
                ", duracion=" + duracion +
                ", costo=" + costo +
                ", cantidad=" + cantidad +
                ", nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }
// Usar
    // Si es curacion
    // Aumentar 20 hp
    // Si es de fuerza
    // Aumentar ataque 20
    // Si es velocidad
    // Aumentar velocidad 20
}

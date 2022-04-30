public class Habilidad {
    private String nombre;
    private String descripcion;
    private int ataqueBase;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getAtaqueBase() {
        return ataqueBase;
    }

    public void setAtaqueBase(int ataqueBase) {
        this.ataqueBase = ataqueBase;
    }

    public Habilidad(String nombre, String descripcion, int ataqueBase) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.ataqueBase = ataqueBase;
    }
}

public abstract class Personaje {
    private String nombre;
    private int nivel;
    private char genero;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public Personaje(String nombre, int nivel, char genero) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.genero = genero;
    }

    // Pelear - abstracto
    public abstract boolean pelear(Pokemon pokemonContrario);

    @Override
    public String toString() {
        return "Personaje{" +
                "nombre='" + nombre + '\'' +
                ", nivel=" + nivel +
                ", genero=" + genero +
                '}';
    }
}

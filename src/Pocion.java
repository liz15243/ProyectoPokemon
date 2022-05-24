public class Pocion extends Objeto{
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

    public Pocion(double costo, int cantidad, String nombre, String tipo, String efecto, int duracion) {
        super(costo, cantidad, nombre, tipo);
        this.efecto = efecto;
        this.duracion = duracion;
    }


    @Override
    public boolean usar(Pokemon pokemon) {
        if(this.efecto.equals("curacion")){
            pokemon.setHp(pokemon.getHp()+20);
            return true;
        } else if(this.efecto.equals("fuerza")){
            pokemon.getHabilidad().setAtaqueBase(pokemon.getHabilidad().getAtaqueBase()+20);
            return true;
        } else if(this.efecto.equals("velocidad")){
            pokemon.setVelocidad(pokemon.getVelocidad()+20);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Pocion{" +
                "costo=" + costo +
                ", cantidad=" + cantidad +
                ", nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                ", efecto='" + efecto + '\'' +
                ", duracion=" + duracion +
                '}';
    }

}

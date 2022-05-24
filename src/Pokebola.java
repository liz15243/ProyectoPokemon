import java.util.Random;
public class Pokebola extends Objeto{
    // Efectividad - double
    private double efectividad;

    public Pokebola(double costo, int cantidad, String nombre, String tipo, double efectividad) {
        super(costo, cantidad, nombre, tipo);
        this.efectividad = efectividad;
    }


    @Override
    public boolean usar(Pokemon pokemon) {
        if(pokemon.isEsLegendario()){
            this.efectividad -= 40;
        }
        Random random = new Random();
        int valor= random.nextInt(100);
        if(valor>=1 && valor<= this.efectividad){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String toString() {
        return "Pokebola{" +
                "costo=" + costo +
                ", cantidad=" + cantidad +
                ", nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                ", efectividad=" + efectividad +
                '}';
    }
}

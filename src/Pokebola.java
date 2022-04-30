public class Pokebola extends Objeto{
    // Efectividad - double
    private double efectividad;

    public Pokebola(double costo, int cantidad, String nombre, String tipo, double efectividad) {
        super(costo, cantidad, nombre, tipo);
        this.efectividad = efectividad;
    }

    // Atrapar - retornar true/false
    // Revisar tipo pokebola
    // Si es PokebolaLegendario - 40 efectividad

    // Hacemos un Random del 1 al 10,
    // Si se obtiene un numero entre 1 y la efectividad que lo atrape
    // y restamos la pokebola
    //sino
    // Intenta otra vez hasta que se acaben las pokebolas
    // o el usuario ya no lo quiera intentar
    // Revisar tpo de pokemon
}

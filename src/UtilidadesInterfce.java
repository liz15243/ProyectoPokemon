import java.util.ArrayList;
public interface UtilidadesInterfce {
    void tiempoJugado(long tiempoInicial,long tiempoFinal);
    void mostrarMenu();
    Pokemon crearPokemonAleatorio(Habilidad habilidad);
    <T> T sacarAleatorio (ArrayList<T> arrayList);
    String [] debilYfuerte (String tipo);
    String [] nombresPokemones (String tipo);
}

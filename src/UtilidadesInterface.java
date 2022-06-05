import java.util.ArrayList;

public interface UtilidadesInterface {
    void tiempoJugado(long Inicial,long Final);
    void mostrarMenu();
    Pokemon crearPokemonAleatorio();
    <T> T sacarAleatorio(ArrayList<T> arrayList);
    String[] debilYfuerte(String tipo);
    String[] nombresPokemones(String tipo);
}

import java.util.ArrayList;
public class Entrenador {
    // Region - String
    // PokemonMascota - Pokemon
    // Torneos ganados - Int
    // Pokedex - ArrayList<Pokemon>
    // Mochila - ArrayList<Objeto>
    private String region;
    private Pokemon PokemonMascota;
    private int torneosGanados;
    private ArrayList<Pokemon> Pokedex;
    private ArrayList<Objeto> Mochila;

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Pokemon getPokemonMascota() {
        return PokemonMascota;
    }

    public void setPokemonMascota(Pokemon pokemonMascota) {
        PokemonMascota = pokemonMascota;
    }

    public int getTorneosGanados() {
        return torneosGanados;
    }

    public void setTorneosGanados(int torneosGanados) {
        this.torneosGanados = torneosGanados;
    }

    public ArrayList<Pokemon> getPokedex() {
        return Pokedex;
    }

    public void setPokedex(ArrayList<Pokemon> pokedex) {
        Pokedex = pokedex;
    }

    public ArrayList<Objeto> getMochila() {
        return Mochila;
    }

    public void setMochila(ArrayList<Objeto> mochila) {
        Mochila = mochila;
    }

    public Entrenador(String region, Pokemon pokemonMascota, int torneosGanados, ArrayList<Pokemon> pokedex, ArrayList<Objeto> mochila) {
        this.region = region;
        PokemonMascota = pokemonMascota;
        this.torneosGanados = torneosGanados;
        Pokedex = pokedex;
        Mochila = mochila;
    }

    // Pelear - abstracto
    //  Escoger pokemon de Pokedex
    // Si su HP es superior a 15
    // Escoger 2 fuertes y 1 debil aleatoriamente
    // Si no tiene fuertes, poner 3 aleaotorios
    //  Llamar al metodo pelear del pokemon
    //




}

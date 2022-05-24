import  java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Entrenador extends Personaje{
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

    public Entrenador(String nombre, int nivel, char genero, String region, Pokemon pokemonMascota, int torneosGanados, ArrayList<Pokemon> pokedex, ArrayList<Objeto> mochila) {
        super(nombre, nivel, genero);
        this.region = region;
        PokemonMascota = pokemonMascota;
        this.torneosGanados = torneosGanados;
        Pokedex = pokedex;
        Mochila = mochila;
    }

    //TIRAR OBJETO
    public boolean tirarObjeto(int indiceObjeto){
        if(indiceObjeto > Mochila.size()-1){
            return false;
        } else {
            Mochila.remove(indiceObjeto);
            return true;
        }

    }

    //INTERCAMBIAR
    public boolean intercambiar (int eleccion, boolean probabilidad){
        //mostrar la pokedex
        Scanner leer = new Scanner(System.in);
        Random elegir = new Random();
        int indice = 1;
        for (Pokemon pokedex : Pokedex){
            System.out.println( indice + " - " + pokedex);
            indice++;
        }

        //mostrar la pokedex del entrenador opuesto
        //escogo el pokemon que quiero
        System.out.println("¿Que Pokemon deseas intercambiar");
        eleccion = leer.nextInt();

        //y con random true o false acepta
        probabilidad = elegir.nextInt(100)>60;
        //si true
        if (probabilidad){

        }
        //get y add + remove

        return false;
    }

    @Override
    public boolean pelear(Pokemon pokemonContrario) {
        //escoger pokemones para pelear
        Scanner leer = new Scanner(System.in);
        ArrayList<Pokemon> paraPelear = new ArrayList<>();
        mostrarPokedex(Pokedex);
        System.out.println("escoge 3 pokemones");
        for (int i = 0; i < 3; i++) {
            paraPelear.add(Pokedex.get(leer.nextInt()-1));
        }
        int respuesta;

        do {
            System.out.println("1.- Pelear");
            System.out.println("2.- Usar pocion");
            System.out.println("3.- Huir");
            respuesta = leer.nextInt();
            if(paraPelear.size() != 0) {
                if (respuesta == 1) {
                    System.out.println("escoge el pokemon para pelear");
                    mostrarPokedex(paraPelear);
                    int eleccion = leer.nextInt();
                    if(!paraPelear.get(eleccion).pelear(pokemonContrario)){
                        paraPelear.remove(eleccion);
                        return false;
                    } else {
                        return true;
                    }
                } else if (respuesta == 2) {
                    mostrarMochila();
                    System.out.println("Escoge la pocion");
                    int eleccionn = leer.nextInt();

                    System.out.println("escoge el pokemon para dar Pocion");
                    mostrarPokedex(paraPelear);
                    int elecccion = leer.nextInt();
                    Mochila.get(elecccion - 1).usar(paraPelear.get(leer.nextInt() - 1));
                    return true;
                } else if (respuesta == 3) {
                    return false;
                }
            }
        }while (respuesta != 0);
        return false;
    }

    public void mostrarMochila(){
        System.out.println("los objetos disponibles son: ");
        int indice = 1;
        for (Objeto objeto : Mochila) {
            System.out.println(indice+" . ");
            System.out.println(objeto);
            indice++;
        }
    }

    public void mostrarPokedex(ArrayList<Pokemon> pokemones){
        System.out.println("los Pokemones disponibles son: ");
        int indice = 1;
        for (Pokemon pokemon : Pokedex) {
            System.out.println(indice+" . ");
            System.out.println(pokemon);
            indice++;
        }
    }

    @Override
    public String toString() {
        return "Entrenador{" +
                "region='" + region + '\'' +
                ", PokemonMascota=" + PokemonMascota +
                ", torneosGanados=" + torneosGanados +
                ", Pokedex=" + Pokedex +
                ", Mochila=" + Mochila +
                '}';
    }
}
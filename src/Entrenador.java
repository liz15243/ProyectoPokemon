import  java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

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

    //pelear - Abstracto implementado
    //escoger pokemon del pokedex

    //si su HP es superior a 15
    //escoger 2 fuertes y 1 debil aleatorios
    //si no tiene fuertes, poner 3 aleaatorios
    //arreglo de pokemones a usar en la pelea


    //darle a escoger el pokemon al entrenador
    //mostrar estadisticas del pokemon
    //menu para pelear, curar, aumentar ataque o velocidad
    //si escoge pelear
    //llamar al metodo pelear del pokemon
    //si escoge curar
    //hay que validar si hay pocion/baya de curacion, usar
    //si escoge +ataque
    //hay que validar si hay pocion/baya de +ataque, usar
    //si escoge velocidad
    //hay que validar si hay pocion/baya de +velocidad, usar


    //ganar metodo -> el entrenador opuesto ya no tienepokemones
    //nivel 1 = 10 xp pokemon y entrenador
    //nivel n = 10 xp * 1.5 pokemon y entrenador
    //perder metodo -> yo me quedo sin pokemones

    //TIRAR OBJETO
    //mostrar los elementos de mochila
   public void tirarObjeto(){
       Scanner leer = new Scanner(System.in);
      int indice = 1;
      for(Objeto contenido : Mochila){
          System.out.println( indice + " - ");
          System.out.println(contenido);
      }
       //que el usuario escoja cual tirar
       System.out.println(" Que deseas tirar");
       int tirar= leer.nextInt();

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
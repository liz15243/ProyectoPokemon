import  java.util.ArrayList;
import java.util.InputMismatchException;
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
    public void mostrarPokedex(ArrayList<Pokemon> pokemones){
        System.out.println("Los pokemones disponibles son:");
        int indice = 1;
        for(Pokemon objeto : Pokedex){
            System.out.println(indice + " - ");
            System.out.println(objeto);
            indice++;
        }
    }

    public void mostrarMochila(){

    }

    @Override
    public boolean pelear(Pokemon pokemonContrario) {
        ArrayList<Pokemon> parapelear = new ArrayList<>();

        System.out.println("Escoge 3 pokemones");
        mostrarPokedex(Pokedex);
        Scanner leer = new Scanner(System.in);
        for(int i=0; i<3;i++){
            System.out.println("Ingresa el pokemon");
            try {
                int indice = leer.nextInt();
                parapelear.add(Pokedex.get(indice - 1));
            }catch(InputMismatchException e){
                System.out.println("Ingrese un numero");
                leer.nextLine();
                i--;
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Ese pokemon no existe, ingrese uno ya existente");
                i--;
            }
        }

        int respuesta=0;
        do{
            System.out.println("1 Pelear");
            System.out.println("2 Usar Baya");
            System.out.println("3 Huir");
            respuesta= leer.nextInt();

            if(parapelear.size()!=0){
                if(respuesta==1){

                    System.out.println("Escoge el pokemon para pelear");
                    mostrarPokedex(parapelear);
                    int eleccion=leer.nextInt();
                    if(!parapelear.get(eleccion).pelear(pokemonContrario)){
                        parapelear.remove(eleccion);
                    }else{
                        return true;
                    }

                }else if(respuesta==2){

                    mostrarMochila();
                    System.out.println("Escoge la baya o pocion para el pokemon");
                    int eleccion= leer.nextInt();
                    System.out.println("Escoge el pokemon para dar baya/pocion");
                    mostrarPokedex(parapelear);
                    getMochila().get(eleccion-1).usar(parapelear.get(leer.nextInt()));

                }else{
                    System.out.println("Huyendoooo ");
                    return false;
                }
            }else{
                return false;
            }
        }while(respuesta !=0);

        return false;
    }

    public boolean tirarObjeto (int indice) {
        try {
            Mochila.remove(indice);
            return true;
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Ese objeto no existe");
            return false;
        }
    }



}
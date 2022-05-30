import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main implements UtilidadesInterfce{
    static ArrayList<Habilidad> habilidades = new ArrayList<>();
    static Habilidad habilidad = new Habilidad("Puño mortal","Lanza llamas",30);
    static Habilidad habilidad2= new Habilidad("Baby Baby","Distrae el contrincante",50);
    static  Habilidad habilidades3 = new Habilidad("Trueno","Baja la mitad de la vida",50);
    static ArrayList<String> tiposPokemon;

    public static void main(String[] args) {
        habilidades.add(habilidad);
        habilidades.add(habilidad2);
        habilidades.add(habilidades3);

    }

    @Override
    public void tiempoJugado(long tiempoInicial, long tiempoFinal) {
        tiempoInicial= System.currentTimeMillis();
        tiempoFinal = System.currentTimeMillis();
        System.out.println(tiempoFinal-tiempoInicial);

    }

    @Override
    public void mostrarMenu() {
        Scanner leer = new Scanner(System.in);
        int respuesta;
        System.out.println("\nBienvenido, digite el numero de la operacion que desea hacer: "+
                "\n1. Pokemon" + "\n2. Tienda" + "\n3. Pokedex" + "\n4. Combate" + "\n5. Bolsa");
        respuesta= leer.nextInt();
        switch (respuesta){
            case 1:

            case 2:

            case 3:

            case 4:

            case 5:
        }
    }

    @Override
    public Pokemon crearPokemonAleatorio(Habilidad habilidad) {
        return null;
    }

    @Override
    public <T> T sacarAleatorio(ArrayList<T> arrayList) {
        return null;
    }

    @Override
    public String[] debilYfuerte(String tipo) {
        String [] debilyFuerte = new String [2];
        switch (tipo){
            case ("Agua"):
                debilyFuerte [0] = "Electrico";
                debilyFuerte [1] = "Fuego";
            case ("Fuego"):
                debilyFuerte [0] = "Agua";
                debilyFuerte [1] = "Bicho";
            case ("Planta"):
                debilyFuerte [0] = "Fuego";
                debilyFuerte [1] = "Roca";
        }

        return new String[2];
    }

    @Override
    public String[] nombresPokemones(String tipo) {
        String [] banco = new String [4];
        switch (tipo){
            case ("Agua"):
                banco [0] = "Squirtle";
                banco [1] = "Magicarp";
                banco [2] = "Trucha";
                banco [3] = "Pez";
                break;
            case ("Fuego"):
                banco [0] = "Dragonite";
                banco [1] = "Arcanine";
                banco [2] = "Magby";
                banco [3] = "Carkol";
                break;
            case ("Planta"):
                banco [0] = "Oddish";
                banco [1] = "Chikorita";
                banco [2] = "Treecko";
                banco [3] = "Ludicolo";
                break;
        }
        return banco;
    }
}

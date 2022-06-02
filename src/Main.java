import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main implements UtilidadesInterfce{
    static ArrayList<Habilidad> habilidades = new ArrayList<>();
    static Habilidad habilidad = new Habilidad("Puño mortal","Lanza llamas",30);
    static Habilidad habilidad2= new Habilidad("Baby Baby","Distrae el contrincante",50);
    static  Habilidad habilidades3 = new Habilidad("Trueno","Baja la mitad de la vida",50);
    static ArrayList<String> tiposPokemon;

    public static void main(String[] args) throws InterruptedException {
        long tiempoInicial = System.currentTimeMillis();
        habilidades.add(habilidad);
        habilidades.add(habilidad2);
        habilidades.add(habilidades3);
        tiposPokemon = new ArrayList<>(Arrays.asList("Agua","Fuego","Planta"));
        Main main = new Main();

        int respuesta = 1;
        Scanner scanner = new Scanner(System.in);
        while (respuesta != 0)
            main.mostrarMenu();
        System.out.println("Elija una opcion: ");
        respuesta = scanner.nextInt();
        if(respuesta == 1){
            int dejarExlorar = 1;
            while (dejarExlorar != 0){
                System.out.println("Aparecio un pokemon salvaje");
                System.out.println(main.crearPokemonAleatorio());
                System.out.println("Quieres seguir explorando 1.");
                dejarExlorar = scanner.nextInt();
            }
            Thread.sleep(1500);
            //tamar tiempo jugado
            main.tiempoJugado(tiempoInicial,System.currentTimeMillis());
            System.out.println(main.crearPokemonAleatorio());
            System.out.println(main.crearPokemonAleatorio());
            System.out.println(main.crearPokemonAleatorio());

        }

    }

    @Override
    public void tiempoJugado(long tiempoInicial, long tiempoFinal)  {
        System.out.println("Has jugado" + (tiempoFinal-tiempoInicial/1000));

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
    public Pokemon crearPokemonAleatorio() {
        Random random=new Random();

        int numTipo=random.nextInt(tiposPokemon.size());
        String tipo=sacarAleatorio(tiposPokemon);
        int tamNombre= nombresPokemones(tipo).length;
        int nombre= random.nextInt(tamNombre);
        int hp=random.nextInt(200);
        boolean legendario =random.nextBoolean();
        String[] debilFuerte=debilYfuerte(tipo);
        int numHabilidad=random.nextInt(habilidades.size());
        String nombreFinal=nombresPokemones(tipo)[nombre];
        int nivel=random.nextInt(habilidades.size());
        char genero=random.nextInt(15)< 5 ? 'f':'m'; //operador ternario

        return new Pokemon(nombreFinal,nivel,genero,tipo,sacarAleatorio(habilidades),hp,legendario,debilFuerte[0],debilFuerte[1]);

    }

    @Override
    public <T> T sacarAleatorio(ArrayList<T> arrayList) {
            Random ramdom = new Random();
            int indice = ramdom.nextInt(0,arrayList.size()-1);
        return arrayList.get(indice);
    }

    @Override
    public String[] debilYfuerte(String tipo) {
        String [] debilyFuerte = new String [2];
        switch (tipo){
            case ("Agua"):
                debilyFuerte [0] = "Electrico";
                debilyFuerte [1] = "Fuego";
                break;
            case ("Fuego"):
                debilyFuerte [0] = "Agua";
                debilyFuerte [1] = "Bicho";
                break;
            case ("Planta"):
                debilyFuerte [0] = "Fuego";
                debilyFuerte [1] = "Roca";
                break;
        }

        return debilyFuerte;
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

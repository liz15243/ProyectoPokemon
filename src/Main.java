import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Objeto>paraTienda=new ArrayList<>();
        Pocion pocion1=new Pocion(30.3,2,"pocion vida","vida","dar vida",10);
        paraTienda.add(pocion1);

        Tienda miTienda= new Tienda("Mi tienda",paraTienda);
        miTienda.mostrarDisponibles();
        System.out.println(miTienda.usuarioComprar(30.3,1,0));
        miTienda.usuarioVender(pocion1,4);


        Pokebola pokebasica = new Pokebola(20,5,"Pokebasica","basica",10);
        paraTienda.add(pokebasica);
        miTienda.usuarioVender(pokebasica,1);

        Baya fuerza = new Baya(20,4,"Fuerza","Fuerza","dar mas fuerza",20);
        paraTienda.add(fuerza);
        miTienda.usuarioVender(fuerza,2);

    }
}

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

    }
}



import java.util.ArrayList;
public class Tienda {

    private String nombre;
    private ArrayList<Objeto> objetosDisponibles;


    //Metodo


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Objeto> getObjetosDisponibles() {
        return objetosDisponibles;
    }

    public void setObjetosDisponibles(ArrayList<Objeto> objetosDisponibles) {
        this.objetosDisponibles = objetosDisponibles;
    }

    public Tienda(String nombre, ArrayList<Objeto> objetosDisponibles) {
        this.nombre = nombre;
        this.objetosDisponibles = objetosDisponibles;
    }

    public boolean usuarioComprar(double dinero, int cantidad, int indiceObjeto) {
        try {
            if (objetosDisponibles.get(indiceObjeto).cantidad >= cantidad) {
                double precioTotal = cantidad * objetosDisponibles.get(indiceObjeto).costo;
                if (precioTotal >= dinero) {
                    System.out.println("Vendido");
                    return true;
                } else {
                    System.out.println("No le alcanza, le faltan: " + (precioTotal - dinero));
                    return false;
                }

            } else {
                System.out.println("No tenemos la cantidad solicitada");
                return false;
            }
        }catch (IndexOutOfBoundsException e){
            System.out.println("Ese objeto no existe");
            return false;
        }
    }

    public boolean usuarioVender(Objeto objeto, int cantidad) {
        if (objeto.getClass() == Pocion.class) {
            System.out.println("No puedes vender pociones");
            return false;
        } else {
            if (objeto.getClass() == Pokebola.class) {
                int cantidadFinalPoke= objeto.getCantidad() - cantidad;
                System.out.println("Ahora cuentas con: " + cantidadFinalPoke + " " + objeto.getNombre());
            }else if(objeto.getClass() == Baya.class ){
                int cantidadFinalBaya= objeto.cantidad - cantidad;
                System.out.println("Ahora cuentas con: " + cantidadFinalBaya + " " + objeto.getNombre());
            }
        }

        return false;
    }


    public void mostrarDisponibles() {
        System.out.println("Los objetos disponibles son: ");
        int indice = 1;
        for (Objeto objeto : objetosDisponibles) {
            System.out.println(indice + " - ");
            System.out.println();
            indice++;
        }
    }
}
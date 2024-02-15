package VISTA;

import MODELO.Cabagna;
import MODELO.Carpa;
import MODELO.Hotel;
import MODELO.datosClientes;

public class Test {
    public static void main(String[] args) {
        datosClientes cli = new datosClientes("Fabrizzio","71741790");
        datosClientes cli2 = new datosClientes("Ochoa","79897360");
        datosClientes cli3 = new datosClientes("Nadia","20202020");

        Carpa friendly = new Carpa("Media", cli, 200,3,5)   ;
        Hotel sheraton = new Hotel("baja",cli2,1500,2,true,10,true);
        Cabagna Lakebottom = new Cabagna("Media", cli3, 200,3,true,6,true);
        System.out.println("El subtotal de la carpa Friendly es:" + friendly.subTotal());
        System.out.println("El subtotal del Hotel Sheraton es:" + sheraton.subTotal());

        System.out.println("El Total del Hotel Sheraton es:" + sheraton.adicional());
        System.out.println("El descuento de la temporada de mi Carpa Friendly es:" + friendly.bonoDescuento());
        System.out.println("El descuento de la temporada de mi Hotel Sheraton es:" + sheraton.bonoDescuento());
        System.out.println("El valor a Cancelar de mi Hotel Sheraton es:" + Lakebottom.valorACancelar());

        System.out.println("El incremento del valor base de la noche de la cabaña Lakebottom es:" + Lakebottom.incrementaValorBase());
    }
}

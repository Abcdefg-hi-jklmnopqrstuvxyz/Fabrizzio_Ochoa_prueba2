package CONTROLADOR;

import MODELO.Cabagna;
import MODELO.Carpa;
import MODELO.Hotel;
import MODELO.mediosAlojamiento;

import java.util.ArrayList;

public class Alojamientos {
    private ArrayList<mediosAlojamiento> alojamiento;

    public Alojamientos(ArrayList<mediosAlojamiento> alojamiento) {
        this.alojamiento = alojamiento;
    }

    public ArrayList<mediosAlojamiento> getAlojamiento() {
        return alojamiento;
    }

    public void setAlojamiento(ArrayList<mediosAlojamiento> alojamiento) {
        this.alojamiento = alojamiento;
    }

    public int buscarAlojamiento(String rutCliente){
        for(int i=0; i<alojamiento.size();i++){
            if(alojamiento.get(i).getDatosCLi().getRutCliente().compareToIgnoreCase(rutCliente)==0){
                return i;
            }

        }
        return -1;
    }

    public void ingresarCarpa(Carpa carpa){
        if(buscarAlojamiento(carpa.getDatosCLi().getRutCliente())==-1){
            alojamiento.add(carpa);
        }
    }
    public void ingresarCabagna(Cabagna cabagna){
        if(buscarAlojamiento(cabagna.getDatosCLi().getRutCliente())==-1){
            alojamiento.add(cabagna);
        }
    }
    public void ingresarHotel(Hotel hotel){
        if(buscarAlojamiento(hotel.getDatosCLi().getRutCliente())==-1){
            alojamiento.add(hotel);
        }
    }

}

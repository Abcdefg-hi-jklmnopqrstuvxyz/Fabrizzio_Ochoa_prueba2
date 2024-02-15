package MODELO;

public class Carpa extends mediosAlojamiento{
    protected int cantidadPersonas;

    public Carpa(String tipoTemporada, datosClientes datosCLi, int valorBaseNoche, int cantidadDeNoches, int cantidadPersonas) {
        super(tipoTemporada, datosCLi, valorBaseNoche, cantidadDeNoches);
        this.cantidadPersonas = cantidadPersonas;
    }

    public int getCantidadPersonas() {
        return cantidadPersonas;
    }

    public void setCantidadPersonas(int cantidadPersonas) {
        this.cantidadPersonas = cantidadPersonas;
    }


}

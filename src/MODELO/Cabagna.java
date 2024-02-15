package MODELO;

public class Cabagna extends Hospederia{
    protected boolean chimenea;

    public Cabagna(String tipoTemporada, datosClientes datosCLi, int valorBaseNoche, int cantidadDeNoches, boolean esFumador, int capacidad) {
        super(tipoTemporada, datosCLi, valorBaseNoche, cantidadDeNoches, esFumador, capacidad);
    }

    public boolean isChimenea() {
        return chimenea;
    }

    public void setChimenea(boolean chimenea) {
        this.chimenea = chimenea;
    }

}

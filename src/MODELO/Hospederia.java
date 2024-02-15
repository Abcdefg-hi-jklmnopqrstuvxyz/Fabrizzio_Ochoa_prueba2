package MODELO;

public abstract class Hospederia extends mediosAlojamiento{
    protected boolean esFumador;
    protected int capacidad;

    public boolean isEsFumador() {
        return esFumador;
    }

    public void setEsFumador(boolean esFumador) {
        this.esFumador = esFumador;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public Hospederia(String tipoTemporada, datosClientes datosCLi, int valorBaseNoche, int cantidadDeNoches, boolean esFumador, int capacidad) {
        super(tipoTemporada, datosCLi, valorBaseNoche, cantidadDeNoches);
        this.esFumador = esFumador;
        this.capacidad = capacidad;
    }

    public abstract int valorACancelar();

}

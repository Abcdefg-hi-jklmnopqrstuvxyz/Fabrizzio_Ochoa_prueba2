package MODELO;

public class Cabagna extends Hospederia{
    protected boolean chimenea;

    public Cabagna(String tipoTemporada, datosClientes datosCLi, int valorBaseNoche, int cantidadDeNoches, boolean esFumador, int capacidad, boolean chimenea) {
        super(tipoTemporada, datosCLi, valorBaseNoche, cantidadDeNoches, esFumador, capacidad);
        this.chimenea = chimenea;
    }

    public boolean isChimenea() {
        return chimenea;
    }

    public void setChimenea(boolean chimenea) {
        this.chimenea = chimenea;
    }

    @Override
    public int valorACancelar() {
        return subTotal()-bonoDescuento()+incrementaValorBase();
    }

    public int incrementaValorBase(){
        int incremento=0;
        if(this.capacidad>5){
            incremento=Math.round(this.valorBaseNoche*18/100);
        }
        return incremento;
    }
}

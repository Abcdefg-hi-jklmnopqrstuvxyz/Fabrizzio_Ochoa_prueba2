package MODELO;

public class Hotel extends Hospederia{
    protected boolean conDesayuno;

    public Hotel(String tipoTemporada, datosClientes datosCLi, int valorBaseNoche, int cantidadDeNoches, boolean esFumador, int capacidad, boolean conDesayuno) {
        super(tipoTemporada, datosCLi, valorBaseNoche, cantidadDeNoches, esFumador, capacidad);
        this.conDesayuno = conDesayuno;
    }

    public boolean isConDesayuno() {
        return conDesayuno;
    }

    public void setConDesayuno(boolean conDesayuno) {
        this.conDesayuno = conDesayuno;
    }

    public int adicional(){
        int adicion=0;
        if(this.esFumador==true && this.isConDesayuno() == true){
            adicion = Math.round(this.subTotal()*30/100);
        }
        return adicion;
    }

    @Override
    public int valorACancelar() {
        return subTotal()-bonoDescuento()+adicional();
    }
}

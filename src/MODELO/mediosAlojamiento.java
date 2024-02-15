package MODELO;

public class mediosAlojamiento {
    protected String tipoTemporada;
    protected datosClientes datosCLi;
    protected int valorBaseNoche;
    protected int cantidadDeNoches;

    public String getTipoTemporada() {
        return tipoTemporada;
    }

    public void setTipoTemporada(String tipoTemporada) {
        this.tipoTemporada = tipoTemporada;
    }

    public datosClientes getDatosCLi() {
        return datosCLi;
    }

    public void setDatosCLi(datosClientes datosCLi) {
        this.datosCLi = datosCLi;
    }

    public int getValorBaseNoche() {
        return valorBaseNoche;
    }

    public void setValorBaseNoche(int valorBaseNoche) {
        this.valorBaseNoche = valorBaseNoche;
    }

    public int getCantidadDeNoches() {
        return cantidadDeNoches;
    }

    public void setCantidadDeNoches(int cantidadDeNoches) {
        this.cantidadDeNoches = cantidadDeNoches;
    }

    public mediosAlojamiento(String tipoTemporada, datosClientes datosCLi, int valorBaseNoche, int cantidadDeNoches) {
        this.tipoTemporada = tipoTemporada;
        this.datosCLi = datosCLi;
        this.valorBaseNoche = valorBaseNoche;
        this.cantidadDeNoches = cantidadDeNoches;
    }

    public int subTotal(){
        return cantidadDeNoches * valorBaseNoche;
    }

    public int bonoDescuento(){
        int descuento=0;
        if(this.tipoTemporada.equalsIgnoreCase("baja")){
            descuento= Math.round(this.subTotal() * 25/100);
        }else if (this.tipoTemporada.equalsIgnoreCase("media")){
            descuento= (int) Math.round(this.subTotal() * 12.5/100);
        }
        return descuento;
    }



}

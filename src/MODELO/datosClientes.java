package MODELO;

public class datosClientes {
    private String nombre;
    private  String rutCliente;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRutCliente() {
        return rutCliente;
    }

    public void setRutCliente(String rutCliente) {
        this.rutCliente = rutCliente;
    }
    public datosClientes(String nombre, String rutCliente) {
        this.nombre = nombre;
        this.rutCliente = rutCliente;
    }
}

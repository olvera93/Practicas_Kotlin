package r2;

public class SmartPhone {

    private Float precio;
    private String nombre;
    private String modelo;
    private String procesador;

    public SmartPhone(Float precio, String nombre, String modelo, String procesador) {
        this.precio = precio;
        this.nombre = nombre;
        this.modelo = modelo;
        this.procesador = procesador;
    }

    public Float getPrecio() {
        return precio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getModelo() {
        return modelo;
    }
}

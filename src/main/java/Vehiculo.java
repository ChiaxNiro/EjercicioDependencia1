public class Vehiculo {
    private String vehiculo;
    private int velocidad;

    public Vehiculo(String vehiculo, int velocidad) {
        this.vehiculo = vehiculo;
        this.velocidad = velocidad;
    }

    public String getVehiculo() {
        return vehiculo;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public void setVehiculo(String vehiculo) {
        this.vehiculo = vehiculo;
    }
}

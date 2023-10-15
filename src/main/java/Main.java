import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    }
    public static Vehiculo seleccionDeAuto(int seleccion){
        switch (seleccion) {
            case 1:
                Vehiculo mercedes = new Vehiculo("Auto", 80);
                return mercedes;
            case 2:
                Vehiculo kawasaki = new Vehiculo("Motocicleta",100);
                return kawasaki;
            case 3:
                Vehiculo trek = new Vehiculo("Bicicleta", 30);
                return trek;
        }
        return null;
    }
    public static Persona crearPersona(String nombre){
        Persona persona = new Persona(nombre);
        return persona;
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        menu();
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
    public static Ubicacion seleccionarUbicacion(int seleccion){
        switch (seleccion) {
            case 1:
                Ubicacion pucon = new Ubicacion("Pucon",105);
                return pucon;
            case 2:
                Ubicacion concepcion = new Ubicacion("Concepcion",292);
                return concepcion;
            case 3:
                Ubicacion victoria = new Ubicacion("Victoria",64);
                return victoria;
        }
        return null;
    }
    public static int calculoTiempo(int velocidad, int distancia){
        int tiempo = distancia/velocidad;
        return tiempo;
    }
    public static void menu(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su nombre");
        String nombre = sc.nextLine();
        Persona persona1 = crearPersona(nombre);

        System.out.println("¿Hacia donde quiere dirigirse?");
        System.out.println("1. Pucon");
        System.out.println("2. Concepcion");
        System.out.println("3. Victoria");
        int ubicacion = sc.nextInt();
        Ubicacion ubicacion1 = seleccionarUbicacion(ubicacion);

        System.out.println("¿Que vehiculo desea usar?");
        System.out.println("1. Auto");
        System.out.println("2. Motocicleta");
        System.out.println("3. Bicicleta");
        int seleccion = sc.nextInt();
        Vehiculo vehiculo1 = seleccionDeAuto(seleccion);
        int tiempo = calculoTiempo(vehiculo1.getVelocidad(), ubicacion1.getDistancia());
        System.out.println("Hola "+persona1.getNombre()+"!,el tiempo de viaje aproximado para llegar a "+ubicacion1.getUbicacion()+" en "+vehiculo1.getVehiculo()+" es de: "+tiempo+"Hrs");

    }
}

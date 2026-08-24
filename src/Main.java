import java.util.Scanner;



public class Main {

    public static void main(String[] args) {
        mostrarMenu();

    }

    static void mostrarMenu() {
        String opcion_menu;
        boolean mantener_menu = true;

        Personaje personaje_jugador = new Personaje();

        Scanner scanner = new Scanner(System.in);

        while (mantener_menu) {
            System.out.println("Elija su opción");
            System.out.println("1.- Crear personaje");
            System.out.println("2.- Ver personaje");
            System.out.println("3.- Cerrar");
            opcion_menu = scanner.nextLine();

            switch (opcion_menu) {
                case "1":
                    crearPersonaje(scanner, personaje_jugador);

                    break;
                case "2":
                    verDatosDelPersonaje(scanner, personaje_jugador);
                    break;
                case "3":
                    System.out.println("Cerrando programa....");
                    mantener_menu = false;
                    break;

                default:
                    System.out.println("Por favor ingrese una opción valida");
                    break;
            }
        }
    }

    static void crearPersonaje(Scanner scanner, Personaje personaje_jugador) {
        Hacker amaro = new Hacker();
        Programador alexander = new Programador();
        GameDev bruh = new GameDev();
    
        Personaje alan = new Personaje();
        
        System.out.println("Creación del Personaje");
        System.out.println("¿Cómo llamaras al personaje?");
        String nombre_sin_validar = scanner.nextLine();

        boolean bandera_ciclo_validar_nombre = true;

        while (bandera_ciclo_validar_nombre) {
            if (nombre_sin_validar.length() < 1) {
                System.out.println("Ingrese un nombre valido");
                nombre_sin_validar = scanner.nextLine();
            } else {
                bandera_ciclo_validar_nombre = false;
            }
        }

        personaje_jugador.validarNombre(nombre_sin_validar);

        System.out.println("¿Cómo llamaras al apellido del personaje?");
        personaje_jugador.apellido = scanner.nextLine();
        System.out.println("Asigna la vida del personaje");
        personaje_jugador.setVida(Integer.parseInt(scanner.nextLine()));
        System.out.println("Que tipo de personaje quieres ser?");
        System.out.println("Tipos disponibles: Hacker/Programador/GameDev/Todos");
        personaje_jugador.tipo = scanner.nextLine();
    }

    static void verDatosDelPersonaje(Scanner scanner, Personaje personaje_jugador) {
        System.out.println("Datos del personaje creado");
        System.out.println("Nombre personaje: " + personaje_jugador.mostrarNombre());
        System.out.println("Apellido personaje: " + personaje_jugador.apellido);
        System.out.println("Vida personaje: " + personaje_jugador.getVida());
        System.out.println("Su personaje es un "+ personaje_jugador.tipo);
        switch (personaje_jugador.tipo) {
            case "Hacker":
                System.out.println("Tu personaje es Hacker, los atributos que posees son una capacidad intelectual mayor al de cualquier otro tipo a la hora de planear, o infiltrarte a sistemas.");
                break;
            case "Programador":
                System.out.println("Tu personaje es Programador, dispones de cualquier tipo de lenguaje a la hora de crear algun sistema, buscando siempre el que se adecue más a la situacion.");
                break;
            case "GameDev":
                System.out.println("Tu personaje es GameDev, la capacidad de crear juegos de todo tipo en la palma de tu mano, los unicos limites, son los que encuentres en tu inspiración.");
            case "Todos":
                System.out.println("El poder del sol en la palma de tu mano.");
            default:
                System.out.println("No elegiste ningun tipo de personaje, eres una persona promedio.");
                break;
        }
        System.out.println("¿Se encuentra vivo?: " + personaje_jugador.esta_vivo);
    }



}
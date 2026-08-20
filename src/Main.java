import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        mostrarMenu();
    }

    static void mostrarMenu(){
        Personaje jugador = new Personaje();
        String opcion_elegida;
        Scanner pecausa = new Scanner(System.in);
        boolean iniciar_menu =true;
        System.out.println("***OH WAOOOOOOOOOOS***");

        while (iniciar_menu) {
            System.out.println("1.-Crear personaje.");
        System.out.println("2.-Ver personaje.");
        System.out.println("3.-Salir.");

        System.out.print("Por favor ingrese una opcion.");

        opcion_elegida = pecausa.nextLine();

        switch (opcion_elegida) {
            case "1":
                System.out.println("CREACIÓN DE PERSONAJE.");
                System.out.println("Ingresa el nombre de tu personaje:");
                jugador.nombre = pecausa.nextLine();
                switch (jugador.nombre) {
                    case "tonto":
                        System.out.println("No puedes tener ese nombre, pendejo.");
                    case "papanatas":
                        System.out.println("No puedes tener ese nombre, pendejo");
                    case "weon":
                        System.out.println("No puedes tener ese nombre, pendejo.");
                    case "peruvian":
                        System.out.println("No puedes tener ese nombre, pendejo.");
                        
                    default:
                        break;
                }
                System.out.println("Ingresa el apellido de tu personaje:");
                jugador.apellido = pecausa.nextLine();
                System.out.println("Ingresa la vida que tiene su personaje:");
                jugador.setearVida(Integer.parseInt(pecausa.nextLine()));
                System.out.println("Ingresa la edad de tu personaje:");
                jugador.ingresarEdad(Integer.parseInt(pecausa.nextLine()));
                break;

            case "2":
                System.out.println("VER PERSONAJE.");
                System.out.println("Tu personaje se llama "+jugador.nombre + " " + jugador.apellido);
                System.out.println("Y la vida es "+jugador.verVida());
                System.out.println("La edad de tu personaje es "+jugador.edad);
                break;

            case "3":
                System.out.println("GRACIAS POR JUGAR.");
                iniciar_menu = false;
                break;
        
            default:
                System.out.println("Escoge una opcion que si aparezca en pantalla.");
                break;
        }

        System.out.println("La opcion escogida es " + opcion_elegida);
        }
        
  
    }



}
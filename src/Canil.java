public class Canil {
    
    public static void main(String[] args) {
        System.out.println("*****Bienvenido al Canil*****");

        Perro perro_de_profe = new Perro();
        perro_de_profe.nombre = "Gimli";
        perro_de_profe.edad = 6;
        perro_de_profe.peso = 40;
        perro_de_profe.tiene_vacunas = false;

        Perro perro_de_happy = new Perro();
        perro_de_happy.nombre = "Patroclo";
        perro_de_happy.edad = 2;
        perro_de_happy.peso = 20;
        perro_de_happy.tiene_vacunas = true;

        if (perro_de_happy.edad > 5){
            System.out.println("El perro tiene más de 2 añotes");
        }
        else {
            System.out.println("El perro de happy tiene 2 añotes.");
        }
        if (perro_de_profe.peso > 20) {
            System.out.println("Su perro esta guaton.");
        }
        else {
            System.out.println("Su perro esta delgado.");
        }

        System.out.println("Thanks for you visit");
    }
    
}

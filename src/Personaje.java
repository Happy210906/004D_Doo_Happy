public class Personaje {
    String nombre;
    String apellido;
    private int vida;
    boolean esta_vivo = true;
    int edad;

    public void setearVida(int vida){
        if (vida < 0){
            this.vida = 0;
        }else{
            this.vida = vida;
        }
    }
    public void ingresarEdad(int edad){
        if (edad < 0){
            System.out.println("No puedes ingresar edad negativa pendejo.");
            this.edad = 18;
        }else {
            this.edad = edad;
        }
    }
    public int verVida(){
        return this.vida;
    }
    


}
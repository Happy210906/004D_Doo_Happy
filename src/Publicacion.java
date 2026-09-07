public abstract class Publicacion {
    private String id;
    private String autor;
    private String fechaCreacion;
    private int likes;
    protected boolean estaActiva;

    public Publicacion(String id, String autor) {
        this.id = id;
        this.autor = autor;
        this.likes = likes;
        this.estaActiva = true;

    }

    public void darLike() {
        this.likes++;
    }

    public void mostrarDetalle(){
        System.out.println("id: " + id + ", autor: " + autor + ", likes: " + likes);
    } 
}

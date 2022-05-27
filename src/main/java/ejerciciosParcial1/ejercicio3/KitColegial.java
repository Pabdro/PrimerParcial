package ejerciciosParcial1.ejercicio3;

public class KitColegial implements IKit{
    private Mochila mochila;
    private Libros libros;
    private Computadora computadora;
    public KitColegial(Mochila mochila, Libros libros, Computadora computadora){
        this.mochila=mochila;
        this.libros=libros;
        this.computadora=computadora;
    }

    public Mochila getMochila() {
        return mochila;
    }

    public void setMochila(Mochila mochila) {
        this.mochila = mochila;
    }

    public Libros getLibros() {
        return libros;
    }

    public void setLibros(Libros libros) {
        this.libros = libros;
    }

    public Computadora getComputadora() {
        return computadora;
    }

    public void setComputadora(Computadora computadora) {
        this.computadora = computadora;
    }

    @Override
    public void showInfo() {
        System.out.println("Kit Colegial");
        System.out.println("numero de bolsillos en mochila: "+mochila.getNumeroBolsillos());
        System.out.println("tamanio de la mochila: "+mochila.getTamanio());
        System.out.println("tipo de libro: "+libros.getTipo());
        System.out.println("autor del libro: "+libros.getAutor());
        System.out.println("marca de la computadora: "+computadora.getMarca());
        System.out.println("sistema operativo de la computadora: "+computadora.getOs());
        System.out.println();
    }
}

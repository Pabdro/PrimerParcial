package ejerciciosParcial1.ejercicio3;

public class CreatorKitColegial extends Creator{
    @Override
    public KitColegial createProduct() {
        Mochila mochila=new Mochila();
        mochila.setNumeroBolsillos(2);
        mochila.setTamanio("muy grande");
        Libros libros=new Libros();
        libros.setTipo("romantico");
        libros.setAutor("Miguel Molina");
        Computadora computadora= new Computadora();
        computadora.setMarca("hp");
        computadora.setOs("Windows");
        KitColegial kitColegial = new KitColegial(mochila,libros,computadora);
        kitColegial.setMochila(mochila);
        kitColegial.setLibros(libros);
        kitColegial.setComputadora(computadora);
        return kitColegial;
    }
}

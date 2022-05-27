package ejerciciosParcial1.ejercicio5;

public abstract class BuilderCarne {
    protected Carne carne;

    public Carne getProduct() {
        return carne;
    }

    public void createCarne() {
        this.carne = new Carne();
    }

    public abstract void buildNombre();
    public abstract void buildTipoDeCarne();
    public abstract void buildSaborRefresco();
    public abstract void buildGuarniciones();
}

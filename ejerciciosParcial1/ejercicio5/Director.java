package ejerciciosParcial1.ejercicio5;

public class Director {
    private BuilderCarne builder;

    public Carne getCarneHecha() {
        return builder.getProduct();
    }

    public void setBuilder(BuilderCarne builder) {
        this.builder = builder;
    }

    public void hacerCarne(){
        this.builder.createCarne();
        this.builder.buildNombre();
        this.builder.buildTipoDeCarne();
        this.builder.buildSaborRefresco();
        this.builder.buildGuarniciones();
    }
}
